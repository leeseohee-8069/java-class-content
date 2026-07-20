
class 치킨{
	
}

// 배달 주문앱에 여러개의 가게를 등록!
// 교촌치킨 , 네네치킨 , 푸라닭치킨
// 위에 치킨집들의 정보를 하나로 묶는다.
class 배달주문가게{
	
	String 지역;  //동탄7동
	double 별점;  // 리뷰의 수를 가지고 1~5
	String 전화번호;
}

// 변수만 있으면 고객이 주문했을 때 뭘 해야하는지 없어요!
// 그래서 각각 가게마다 주문하기 기능을 넣어서 행동도 넣어줘야된다.

class 교촌치킨 extends 배달주문가게{
	
	교촌치킨(String 지역,String 전화번호){
		this.지역 = 지역;
		this.전화번호 = 전화번호;
	}
	
	//고객들이 주문하면 치킨을 만들고 배달하시는 라이더분들께
	// 만든 치킨을 줘야된다.
	// 함수를 실행했을 때 결과가 있니? 돌려줄게 있니?
	
	치킨 주문하기(String 고객주문메뉴){
		System.out.println("교촌치킨 만드는방법");
		System.out.println("치킨을 밀가루에 묻힌다.");
		System.out.println("온도는 180도에 튀킨다");
		System.out.println("기름을 털고");
		System.out.println("상자에 담아");
		System.out.println("라이더분들께 치킨을 준다.");
		
		return "고객이 주문한 치킨 완성";
	}
	
}
class 네네치킨 extends 배달주문가게{
	네네치킨(String 지역,String 전화번호){
		this.지역 = 지역;
		this.전화번호 = 전화번호;
	}
	
	치킨 주문하기(String 고객주문메뉴){
		System.out.println("네네치킨 만드는방법");
		System.out.println("치킨을 밀가루에 묻힌다.");
		System.out.println("온도는 180도에 튀킨다");
		System.out.println("기름을 털고");
		System.out.println("상자에 담아");
		System.out.println("라이더분들께 치킨을 준다.");
		
		return "고객이 주문한 치킨 완성";
	}	
} 
class 푸라닭치킨 extends 배달주문가게{
	푸라닭치킨(String 지역,String 전화번호){
		this.지역 = 지역;
		this.전화번호 = 전화번호;
	}
	String 주문하기(String 고객주문메뉴){
		
		치킨 새로운치킨 = new 치킨();
		System.out.println("푸라닭치킨 만드는방법");
		System.out.println("치킨을 밀가루에 묻힌다.");
		System.out.println("굽는다");
		System.out.println("기름을 털고");
		System.out.println("상자에 담아");
		System.out.println("라이더분들께 치킨을 준다.");
		
		return "고객이 주문한 치킨 완성";
	}
} 
class 족발꾼 extends 배달주문가게{
	
} 

public class MethodOverrideTest {

	public static void main(String[] args) {
		//  실제 가게!
		교촌치킨 동탄9동= new 교촌치킨("동탄9동","0507-1111-1111");
		System.out.println("체인점 명:" + 동탄9동.지역);
	}
}






