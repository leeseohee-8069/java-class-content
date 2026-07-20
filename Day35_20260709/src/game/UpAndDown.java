package game;

import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

	public static void main(String[] args) {

		/*
		 * # Up & Down 게임[2단계] # 1. 정답을 맞추면 게임은 종료된다. # 2. 100점부터 시작해 오답을 입력할 때마다 10점씩
		 * 차감된다. # 3. 게임 종료 후, 점수를 출력한다.
		 * 
		 * 1~50 사이에 랜덤값을 뽑는걸고 변경~
		 */

//		int 정답 = 10; // 랜덤으로 변경!

		// 1. 키보드 생성

		// 2. 숫자를 입력하세요!

		// 3. 입력한 숫자와 정답을 맞추는 게임 !

		// 한번만 실행! 그래서 무한 반복을 돌려서 점수가 0미만으로 떨어지면
		// 게임 종료!
		Scanner 키보드 = new Scanner(System.in);
		Random 랜덤 = new Random();

		// 1 ~ 50 사이의 랜덤 숫자
		int 정답 = 랜덤.nextInt(50) + 1;

		System.out.println("치트키 = " + 정답);

		int 오답횟수 = 0;
		int 내정답 = 0;

		while (정답 != 내정답) {

			System.out.print("정답 입력 : ");
			내정답 = 키보드.nextInt();

			// 내가 입력한 정답과 랜덤으로 뽑은 정답이 
			// 다르면 오답횟수 증가!
			if (정답 != 내정답) {
				오답횟수++;
			}
		}
		int 점수 = 100 - (오답횟수 * 10);
		System.out.println("성적 = " + 점수);

	}
}
