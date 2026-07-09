
public class CastingTest {

	public static void main(String[] args) {
		// Casting 
		//  - 타입을 다른 데이터로 사용할 수있게 만드는
		//    문법!
//		
//		int a = 3;
//		int b = 2;
//		
//		System.out.println(a/ b);
//		
//		// 컴퓨터는 약속대로 계산한다. 
//		// int (정수 소수점이 없는 숫자)
//		// 그 결과도 정수형태로 나온다. 
//		// 아무리 계산을 했을 때 실수가 나와도 소수점
//		// 뒤에를 버린다. 
//		
//		double c = 3.0;
//		double d = 3.0;
//		
//		System.out.println(c / d);
//		
//		// 쇼핑몰에서 다음달 구매할 금액 평균!
//		// 3개월 총 매출이 1000000
//		
//		int 총매출3개월 = 1000000;
//		System.out.println(총매출3개월 + "원");
//		
//		int total = 총매출3개월 / 3;
//		System.out.println(total  + "원");
//		
//		//대학교에서 학점을 평균내는 프로그램을 만들어야된다
//		
//		int 총학점 = 100;
//		int 몇개과목 = 12;
//		
//		// 학점 평균
//		int 학점평균 = 총학점 / 몇개과목;
//		System.out.println(학점평균);
//		
//		// 할인률 계산 
//		int 구매금액 = 100000;
//		int 할인 = 15;
//		
//		System.out.println(구매금액/할인);
//		
//		// 국어,수학, 영어
//		int k = 85;
//		int m = 84;
//		int e = 85;
//		
//		System.out.println((k+m+e) / 3);
//		// 실생활에서 소수점이 필요한 순간들이 있는데 
//		// 내가 만든 프로그램으로 계산을 하면 규칙에의해서
//		// 정수만 출력된다. 
//		
//		// 내가 계산한 정수를 실수로 변경해야될 때가 
//		// 있다. 그게 바로 casting(형변환)
//		
//		// int  정수한다 메모리의 크기를 결정 
//		//
//		
//		// 메모리에  4byte 공간을 만들고 정수만 저장해라!
//		int num = (int)1.1;
//		System.out.println(num);
//		
//		// 메모리에 8byte 공간을 만들고 실수만 저장해라!
//		
//		double num2 = 1;
//		System.out.println(num2);
//		
		// 큰 타입이 작은 타입으로 저장될려고 하니 
		// 데이터를 자르거나 줄여야된다. 
		
		// 0000 0010  이진수
		//        10  10진수
		
		// 2진수를 10진수로 변경 (casting)
		
		// 10 + 2.2;
		// 10.0 + 2.2; 
		// 12.2
		
		// 정수 + 정수 = 정수;
		// 실수 + 실수 = 실수;
		// 정수 + 실수 = 실수;
		// 큰 타입으로 자동으로 변경되서 실수로 계산이된다.
		// 타입이 다르면 계산이 안된다.
		// 그래서 큰 타입으로 자동으로 변경해서 계산한다.
		
		/*
		 * 입출력 예 설명
			입출력 예 #1
		 *  num1이 3, num2가 2이므로 
		 *  3 / 2 = 1.5에 1,000을 곱하면 1500이 됩니다.
		 */
		int num1 = 3,num3 = 2;
		
		// 계산할 때 잠깐만 실수로 변할께!
		System.out.println((int)((double)num1 / num3 *1000));
		// 위에 계산하는 순서 
		// 1. (double)num1 -> 3.0 / 2;
		// 2. 타입다른데? 컴퓨터 규칙에 의해서 타입 맞춰!
		//   3.0 / 2.0
		// 3. 1.5
		// 4. 1.5 * 1000 ->1500.0
		System.out.println(num1);
		
		// 개발자들끼리 가독성(코드를 읽는 것) 높이기 위해서
		// 사용하는 겁니다. 
		// 보기 좋게! 만들자 
		
		double result = (double)num1 / num3;
		System.out.println(result);
		
		int total = (int)(result * 1000);
		System.out.println(total);
		
		
		double divisionResult = (double)num1 / num3;
		int answer = (int)(divisionResult * 1000);
		System.out.println(answer);
		
		// 라이브러리 이용하기 
		//  round() 반올림 5이상! 
		//  1499.6  1500
		//  1499.4  1499
		Math.round(((double)num1 / num3 * 1000));
		
		// 무조건 내림
		// 3.8 -> 3.0
		// 2.5 -> 2.0
		Math.floor(((double)num1 / num3 * 1000));
		 
		
		
	
		
	}
}
