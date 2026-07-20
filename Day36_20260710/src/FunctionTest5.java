
public class FunctionTest5 {
	
	// 더하는게 귀찮아서 더하기 대신 해주는 함수
	public static  int  더하기(int num1,int num2) {
		return num1 + num2;
	}
	
	// 더하는게 귀찮아서 곱하기 대신하는 함수 
	public static  int  곱하기(int num3,int num4) {
		return num3 * num4;
	}
	// 빼는게 귀찮아서 대신 빼기하는 함수 
	public static  int  빼기(int num5,int num6) {
		return num5 - num6;
	}
	
	// 홀수 짝수 계속 판단해주는게 귀찮아 그래서 대신 해주는
	// 함수를 만든다.
	public static  void  홀수짝수출력(int 숫자) {
		if(숫자 %2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수!");
		}
	}
	
	public static void main(String[] args) {
		
		// 1.정수 두개를 입력해서 더한 값이 홀수인지
		//   짝수인지 구하는 프로그램을 만드시오!
		int 더한결과값 = 더하기(10,20);
		홀수짝수출력(더한결과값);
		
		
//		if(더한결과값 %2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수!");
//		}
		
		// 2. 정수 두개를 입력 해서 곱한 결과 값이 
		//    홀수인지 짝수인지 구하는 프로그램을 만드시오!
		//  내가 계산한 결과값을 가지고 다음 코드가 사용을한다
		//  이러면 return을 한다. return을 할때 숫자
		//  문자 미리 알아야된다. 그래서 타입을 적어준다.
		int 곱한값의결과 = 곱하기(10,15);
		홀수짝수출력(곱한값의결과);
//		if(곱한값의결과 %2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수!");
//		}
		
		// 3. 두 정수를 입력 받아서 뺀 다음에 그 값이
		//    홀수인지 짝수 인지 구하는 프로그램을 만드시오!
		int 뺀값의결과 = 빼기(10,15);
		홀수짝수출력(뺀값의결과);
//		if(뺀값의결과 %2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수!");
//		}
		
/*
 * 
더하기(10,20) 실행
    ↓ return 30  (30을 돌려받음)
더한결과값 = 30
    ↓
홀수짝수출력(30) 호출  ← 30을 "재사용"
    ↓ 내부에서 판단하고 출력만 함
"짝수" 출력 (여기서 끝, return 없음)
 * 
 * 
 * 		
 */
		
		
	}
}
