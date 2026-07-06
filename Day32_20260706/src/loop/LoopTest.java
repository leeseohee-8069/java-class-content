package loop;

public class LoopTest {

	public static void main(String[] args) {
		// package?
		// - 자바에서 관련있는 파일들을 하나의 폴더(디렉토리)단위로
		// 묶어서 관리하는 것!
		// - 패키지 문장은 파일 가장 윗쪽에 있어야된다.

		// 컴파일(Compile)
		// - 내가 작성한 파일을 컴퓨터가 알아들을 수 있는 0과1로
		// 번역!(파파고)

		// 도메인(Domain)
		// naver.com , google.com
		// 인터넷에서 웹사이트를 쉽게 찾아기기 위한 이름!
		// package 구조를 이용해서 실제 도메인을 만든다.
		// 중복되면 안됨(전 세계적으로 이름이 겹치지 않도록) 회사/개인
		// com.yonsai.XXX

		// 반복문
		// - 같은 작업을 여러번 반복해서 실행하는 문법!
		// for for in

		// 1
		// 2
		// 3
		// 4
		// 5
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);

		// 실행 ctrl + f11 (자동 저장, 화면에 보여줌)

		/*
		 * for(시작값;조건;증감){ 참인 동안 실행! }
		 */

		// 1~10까지 출력하는 for문 만드시오!
		for (int num = 1; num <= 10; ++num) {
			System.out.println(num);
		}
		System.out.println();

		// 1~100까지 출력하는 for문 만드시오!
		// 시작값 - 처음 시작하는 값? 1
		// 조건 - 얼마동안 반복할꺼니? (이 동안은 참)
		// 증감 - 증가하거나 감소하는 값?(다음 이동)
		// 다음 숫자로 증거하거나 감소한다.
		for (int num2 = 1; num2 <= 100; ++num2) {
			System.out.println(num2);
		}

		// 1~10까지 반복하면서 짝수만 출력!
		for (int num3 = 1; num3 <= 10; ++num3) {

			// if문
			if (num3 % 2 == 0) {
				System.out.println(num3);
			}
		}
		// num3 += 2
		// num3 = num3 +2; 같은것!
		for (int num3 = 2; num3 <= 10; num3 += 2) {

			System.out.println(num3);
		}
	}
}
