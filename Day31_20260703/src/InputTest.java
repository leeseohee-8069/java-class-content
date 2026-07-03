import java.util.Scanner;

public class InputTest {

	public static void main(String[] args) {
		
		//사용자한테 입력하세요! 
		// HTML 에서는 input 태그! 
		// 키보드 입력을 대신 한다.
		// 사용자가 키보드로 입력한 값을 읽어오는 도구다!
		
//		<input type=text/>
//		사용자한테 키보드를 만들어서 제공한다. 한번만 만들면 된다.
		Scanner input = new Scanner(System.in);
		
		// 1. 고객이 알아볼 수있도록 메시지를 보여준다.
		System.out.println("숫자 아무거나 입력하세요");
		
		// 2. 고객이 입력할 수있도록 입력창을 만든다.
		int 숫자 = input.nextInt();
		
		// 3. 입력한 값 출력하기 
		System.out.println("사용자 입력한 값:" + 숫자);
		
		// 4. 입력한 숫자가 음수니? 양수니?
		if(숫자 < 0) {
			System.out.println("음수");
		}else {
			System.out.println("양수");
		}
		
	}
}
