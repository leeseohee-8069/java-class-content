import java.util.ArrayList;

// 상속 -> 다형성!
// 함수 -> return 언제 되지?
// 상속 -> 메서드 오버라이딩? 어떤걸 해야되지? 안해도 되나?


// LinkedList
// 게임에서 파티명(부모) 그 안에 파티원들(자식)
class 종합병원 {
	// 의사도 여러명이 필요하다!
	// 여러과의 의사도 필요!
	ArrayList<의사> 의사들 = new ArrayList<>();
	//ArrayList<알림> 알림들;
	// ArrayList<몬스터> 필드에있는몬스터;
	// ArrayList<회원가입> 여러회원들;
}
// 상속을 하는 이유중에 하나가! 바로 
// 하나의 의사라는 타입이 여러명의 의사 타입을 
// 저장하기 위해서!
class 의사{
	String 이름;
	String 진료과;
	String 진료과목;
}
// 타입관계(연결)
class 내과의사 extends 의사{
	
}
class 외과의사 extends 의사{
	
}
class 소아과의사 extends 의사{
	
}
class 치과의사 extends 의사{
	
}


// 안드로이드 앱, 웹 프론트엔드(리액트)
// 컴포넌트 

// 화면을 구성하는 컴포넌트들을 한번에 관리하고 싶다
// 그럴때 공통되는 타입을 만들어서 관리 (다형성)
// Button  extends View
// TextBox extends View
// Image extends View

public class PolymorphismTest {

	public static void main(String[] args) {
		
		// 진짜 의사!
		// 연관성이 있으니 변수에 저장도한다.
//		의사 첫번째 =  new 내과의사();
//		System.out.println("실제:" + 첫번째);
//		
//		의사 두번째 = new 소아과의사();
//		System.out.println("실제2:" + 두번째);
		
		// 이 자식은 이 부모의 한 종류다!
		
		
		// 다형성?
		//  - 같은 명령을 내려도 객체마다 다르게 동작하는것
		//  - 서로 다른 자식들을 부모라는 이름의 공통상자
		//     하나에 몽땅 집어넣고 한꺼번에 다루는것!
		
		// 하나의 타입으로 여러개 자식(타입)을 저장할 수있다.
		// 왜? 필한데?
		//  - 어떤 자식이나 어떤클래스가 나올지 모른다.
		
		// 데이터들을 한꺼번에 관리하고 싶어서!
		
		
	}
}
