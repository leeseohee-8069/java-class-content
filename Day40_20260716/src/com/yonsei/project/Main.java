package com.yonsei.project;

import java.util.Scanner;

import com.yonsei.project.service.TotalService;

public class Main {

	public static void main(String[] args) {
		// public - 누구나 전체공개!
		// 기본폴더에서는 파일경로를 제대로 못 잡아서 에러를 유발한다.
		// 프로그램은 항상 시작점! Main클래스 안에 main 함수다!

		// 키보드 만들고 입력받아와라!
		Scanner 키보드 = new Scanner(System.in);
		
		// 프로그램이 시작할때 딱! 한번 TotalService객체를 생성하면
		// 프로그램이 꺼질 때까지는 계속 사용할 수있다.
		// 자바는 무조건 클래스 타입들을 사용하려면 new가 있어야된다.
		// 그래서 메모리 공간을 확보해서 사용해야된다. 
		// 그럴려면 프로그램의 시작점인 main에서 객체 생성을 한번은
		// 해야된다.
		TotalService service = new TotalService();

		//코드 정렬! 실무에서 한 몫한다.
		// 전체 선택 ctrl +a 
		// 코드 정렬 단축키 ctrl + shift + f
		while (true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1.마이페이지");
			System.out.println("2.도서 전체 조회");
			System.out.println("3.도서 검색");
			System.out.println("4.도서 대여하기");
			System.out.println("9.프로그램 종료하기");
			int menu = 키보드.nextInt();

			if (menu == 1) {
				// TotalService 클래스 안에 myInfo()부른다.
				service.myInfo();
			} else if (menu == 2) {
				// TotalService 클래스 안에 selectAll() 부른다.
				service.selectAll();
				
			} else if (menu == 3) {
				service.searchBook();
				
			} else if (menu == 4) {
			} else if (menu == 9) {
				System.out.println("프로그램 종료!");
				break; // 프로그램 종료!while멈춤!
			}
		}
	}
}
