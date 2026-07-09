
public class FunctionTest {

	// 함수를 만드는 공간
	public static void 숫자출력() {
		int start = 1;

		// 조건 참이면 실행!
		while (start <= 10) {
			System.out.println(start);
			start += 1; // 다음으로 이동!
		}
	}
	public static void 숫자출력2() {
		
		int start2 = 1;

		// 조건 참이면 실행!
		while (start2 <= 10) {
			System.out.println(start2);
			start2 += 1; // 다음으로 이동!
		}
		
	}
	
	public static void 짝수홀수합() {
		int start4 = 1;
		int 홀수의합 = 0;
		int 짝수의합 = 0;

		while (start4 <= 6) {

			if (start4 % 2 == 0) {
				짝수의합 += start4;
			} else {
				홀수의합 += start4;
			}
			start4 += 1; // 다음으로 이동!
		}
	}
	
	public static void 숫자출력3() {
		int start3 = -6;

		// 조건 참이면 실행!
		while (start3 <= 6) {
			System.out.println(start3);
			start3 += 1; // 다음으로 이동!
		}
	}

	public static void main(String[] args) {

		// 1~10까지 출력하는 반복문 while
		// 시작값
		숫자출력();

		// 1~100까지 출력하는 while문 만드시오!
		숫자출력2();

		// -6~6까지 출력하는 반복문 만드시오!
		숫자출력3();

		// 1~100까지 반복하면서 홀수의 합과 짝수의 합을 구하시오!
		// 1 3 5 7 9 .....
		// 2 4 6 8 10 .....
		짝수홀수합();
		// 1~10까지 출력하는 반복문
		// 리액트에서 중복되는 태그들을 묶어서 새로운 태그로 만들때 함수!
		숫자출력();

		// 1~ 100까지 홀수의 합 짝수합 구하시오!
		짝수홀수합();

		// 1~100까지 출력하는 반복문만드시오!
		숫자출력2();
		// 위에서 작성했던 코드들이 아래쪽에 똑같이 사용이 될 수있어요!
		// 코드를 수정할때 (추가, 삭제, 수정) 일일 하나씩 다 찾아가야된다.

		// 함수(Function)
		// - 긴~ 코드들을 한 단어로 바꾼다.!
		// - 코드를 수정할 때 함수만 찾으면 된다! (유지보수 좋다)
		// - 중복되는 코드가 없어요! (재사용)
		
		// -6부터 6까지 출력하는 반복문을 작성하시오!
		숫자출력3();
		
		// 1~10까지 출력하는 반복문을 작성하시오!
		숫자출력();
		

	}
}
