public class PrintTest {

	public static void main(String[] args) {
		// main이 실행하고 중괄호 열리는 이곳
		// 실행하는 코드들 작성하기!
		// main이 시작점!
		// 세미콜론 == 마침표!
		System.out.println("Hello");
		
		// 더이상 실행할 코드가 없으면 } 닫는 중괄호
		// 만나면 프로그램이 끝난다.
		
		System.out.println(1 * 2);
		System.out.println(1 / 2); //몫
		System.out.println(1 % 2); //나머지값
		
		// 자바스크립트에서 비교할때 사용한 연산자(기호)
		// 같니? ==  같으면 true , 다르면 false
		System.out.println(10 == 10);
		
		// 다르니? 다르면 true, 같으면 false
		System.out.println(10 != 20);
		
		// 왼쪽을 기준으로 읽는게 편하다!
		// 10이 20보다 크거나 같니?
		System.out.println(10 >= 20);
		
		// 더하기 
		System.out.println(10 + 20);
		
		// 숫자 + 문자 = 연결
		System.out.println(10 + "입니다.");
		
		// 1 + 1 = 2
		System.out.println("1 + 1 = 2");
		System.out.println("1+1=" + 2);
		
//		자바는 println() 안에서는 콤마가 안 들어간다
//		무조건 + 연결을 해야된다.
//		System.out.println("내 나이:",20);
		
/*
 * 
[코드 작성]
   System.out.println( 내용 );
        ↓
[ctrl + F11 실행]
   저장 + 컴파일 + 실행이 한번에
        ↓
[콘솔 창]
   괄호 안 내용이 순서대로 한 줄씩 출력됨
        ↓
[프로그램 종료]
   main의 닫는 중괄호 } 를 만나면 종료
 * 
 * 
 */
		
		
	}
}
