import java.util.ArrayList;

public class ArrayEx {

	public static void main(String[] args) {
		// 코드를 정렬해서 보는것도 중요하다
		// 자동 코드 정렬 ctrl + shift + f
		
		// 배열 
		//  장점 = 여러개의 데이터를 저장하는 것!
		//        순서대로!
		//  단점 - 처음 한번 데이터를 저장하면 늘릴수도없고
		//        삭제도 못한다. 
		int[] nums = {10,20,30,40,50,60};
		
		// 아무런 데이터도 없다! 공간만 만든다.
//		int[] nums2 = new int[100];
//		String[] stus = new String[100];
//		
		// 리스트 
		//  - 배열처럼 여러개의 데이터를 저장할 수있다.
		//  - 추가도 가능하고 삭제도 가능하다!
		// ArrayList 
		//  - 미리 많이 만들지 말고 그때그때 필요한 만큼
		//    만들어서 사용해라!
		//  new 새롭게 만들어라! 
		//  ArrayList라는 타입을 만들어라!
		//  new ArrayList<>(); 자바스크립트 []
		//  let -> ArrayList<String> 문자들을 자유롭게
		//         추가하고 삭제하는 배열을 만들어라!
		ArrayList<String> 리스트 = new ArrayList<>(); 
		
		// 리스트 사이즈 확인 
		System.out.println("리스트 사이즈:" 
							+ 리스트.size());	
		
		// 추가 
		리스트.add("에리나");
		리스트.add("그레이스");
		리스트.add("알렉스");
		
		System.out.println("리스트 사이즈:" 
				            + 리스트.size());	
		// 전체 출력 
		System.out.println(리스트);
		
		// 삭제 
		리스트.remove("그레이스");
		System.out.println(리스트);
		
		// 데이터 찾기 
		//  indexOf()공간의 번호를 찾아준다.
		//  공간의 번호가 있으면 공간번호를 돌려주고
		//  공간의 번호를 못찾으면 -1를 준다.
		int 공간번호 = 리스트.indexOf("알렉스");
		System.out.println(공간번호);
		
		
//		-------------------------------------
		ArrayList<String> 장바구니 = new ArrayList<>();
		
		장바구니.add("사과");
		장바구니.add("바나나");
		장바구니.add("우유");
		
		System.out.println(장바구니);
		
//		---------------------------------
		ArrayList<String> 캐릭터 = new ArrayList<>();
		
		캐릭터.add("짱구");
		캐릭터.add("훈이");
		캐릭터.add("철수");
		캐릭터.add("맹구");
		
		System.out.println(캐릭터);
		
//		숫자도 여러개 저장 가능하다!
		ArrayList<Integer> 숫자들 = new ArrayList<>();
		
		숫자들.add(1);
		숫자들.add(2);
		숫자들.add(3);
		숫자들.add(4);
		
		System.out.println(숫자들);
		
//		------------------------------------------
		ArrayList<Integer> 점수들 = new ArrayList<>();
		점수들.add(80);
		점수들.add(90);
		점수들.add(100);
		점수들.add(95);
		
		System.out.println(점수들);
		
		// 배열은 한번 만들면 공간이 고정된다.
		// ArrayList 늘어났다 줄었다 유동적 이다.
		//  조건 - 어떤 타입을 저장할지 <타입결정>
		
		// while, 배열
		// 어떻게 동작하는지! 먼저 순서를 보기!
		//  \n 문자 안에서 동작하는 특수 기호
		// 문자 여러개의 안에서 줄바꿈 해라 \n
		System.out.println("3\n2\n1");
		
		
	}
}
