
public class FunctionTest {
	
	
	// 함수를 만들면 실행 안된다!
	public static void a() {
		// a함수에서만 사용할 수 있는 num2 변수
		// 메인에서는 사용할 수 없다!
		int num2 = 100;
		System.out.println(num2);
	
	}
	
	// 내가 만든 함수는 바로 실행하지 않는다!
	public static void b() {
		// b함수가 실행하면 name2 사용 가능하다!
		// 메인에서는 사용할 수 없다!
		String name2 = "에리나";
		System.out.println(name2);
	
	}

	public static void c(int num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		//num변수는 메인에서만 사용할 수있다!
		// c함수에서 num 변수를 사용할 수 없다!
		int num = 10;  
		System.out.println(num);
		
		c(num);
		
		// 생존시간
		//  변수를 만들면 메모리에서 살아있는 시간
		
		// 그 기준이 바로 중괄호!
		String name = "이서희";
		
		// 메인에서 내가 만든 a함수를 부른다(호출)
		// 함수를 실행라는 뜻!
		a();
		b();
		
		// b함수를 실행하고 나서 에리나를 메인에서 
		// 출력 ? 못 사용한다.
		
		// 지역변수?
		//  - 중괄호가 시작되면 변수들이 생성되었다가
		//    중괄호가 끝나면(닫히면) 변수들이 삭제된다. 
		//  - 지역(함수)에서만 사용할 수있는 변수!
		
		// 변수 
		//  - 값을 저장하는 공간
		// 프로그램을 실행할 때 마다 안에 있는 
		// 변수들을 계속 생성해서 메모리에 가지고 있는
		// 다 - 어느 순간 메모리가 꽉 찬다.
		
		
		
		
		
		
	}
}
