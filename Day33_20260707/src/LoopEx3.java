import java.util.Scanner;

public class LoopEx3 {

	public static void main(String[] args) {
		
		// 엘리베이터 버튼 , 리모콘 채널돌리기 
		// 이미 찾았다면 계속 뒤에 조건을 비교하면 낭비!
		
		
		// 핸드폰은 키패드 , 키보드 입력을 해서 사용자한테 입력받는다
		// Scanner input태그 없으니 임시적으로 사용한다.
		// 키보드 만들고 키보드에서 입력한 값 가져와!
		Scanner 키보드 = new Scanner(System.in);
		
		// 아이디 찾기 
		String[] 기존아이디 = {"apple", "banana", "cherry"};
		
		// 1. 사용자한테 아이디를 입력받아서 확인 
		// nextLine()문자 입력 받아라!
		System.out.println("기존 아이디를 입력하세요");
		String 찾을아이디 =  키보드.nextLine();
		
		// 2. 입력했으면 기존아이디배열에서 찾는다.
		int 번호 = 0;
		
		while(번호 <= 2) {
		
			boolean 결과 = 찾을아이디.equals(기존아이디[번호]);
			if(결과) {
				System.out.println("찾았습니다.");
				break; // 찾았으면 끝내라! 
			}		
		}
		
		System.out.println();
		System.out.println();
		// break 그만! 이제 반복하지마!
		String[] fruits = {"딸기", "사과", "바나나", "포도"};
		
		// 배열에서 사과라는 과일을 찾는다!
		// 검색을 할 때 기본적으로 왼쪽기준으로 즉 0번째 인덱스부터 찾는다.
		int 공간번호 = 0;  //시작값!
		
		while(공간번호  <= 3 ) {
			
			if(fruits[공간번호].equals("사과")) {
				System.out.println("사과 찾았다! 몇번째 공간: "+ 공간번호 );
				// 찾으면 반복 그만해!
				break;
			}
			공간번호 += 1;
		}
		System.out.println("while문 멈춤!끝!");
		
		
	}
}
