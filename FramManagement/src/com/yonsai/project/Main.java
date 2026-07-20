package com.yonsai.project;

import java.util.Scanner;

import com.yonsai.project.service.FramService;

public class Main {

	public static void main(String[] args) {
		// 프로젝트의 시작점!
		// 여기서 자바의 클래스 객체들을 한번은 생성해야 사용할 수
		// 있다!

		Scanner 키보드 = new Scanner(System.in);
		FramService service = new FramService();

		// 직원이 종료를 누르기 전까지는 엑스버튼을 누르기 전까지는
		// 무조건 실행해야된다!
		while (true) {
			System.out.println("===== 싱싱마켓 재고관리 프로그램 =====");
			System.out.println("1. 품목 추가");
			System.out.println("2. 전체 재고 조회");
			System.out.println("9. 종료");
			int menu = 키보드.nextInt();

			if (menu == 1) {
				service.addNewKind();
			} else if (menu == 2) {
				service.printFarm();
			} else if (menu == 9) {
				System.out.println("프로그램 종료!");
				break;
			}
		}// while 반복문
	}// main함수 
}
