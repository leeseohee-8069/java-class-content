import java.util.Scanner;

public class InputTest2 {

	public static void main(String[] args) {
		
		// 프론트 화면에서 사용자가 입력한 데이터가
		// 프로그램에서 어떻게 처리되는지 확인하기
			
		// 1. 키보드 생성 
		Scanner a = new Scanner(System.in);
		
		// 2. 숫자 입력 
		System.out.println("나이:");
		int 나이 = a.nextInt();
		
		// 3. 처리
		//  마이너스 나이가 들어오면? 
		//  혹시 숫자를 입력하라고 했더니 문자 입력!
		//  바이러스 코드들 보안
		//  값이 안 들어왔니?
		if(나이 >= 20) {
			System.out.println("성인");
		}else {
			System.out.println("청소년");
		}
		
		System.out.println("정상실행!");
	}
}
