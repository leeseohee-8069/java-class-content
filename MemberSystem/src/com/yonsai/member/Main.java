package com.yonsai.member;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 프로그램의 진입점(시작점)
		Scanner input = new Scanner(System.in);
		
		// 메뉴들 작성한다.
		while (true) {

            System.out.println("========== yonsai 사이트 ==========");
            System.out.println();
            System.out.println("****** 메인 메뉴 ******");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 같은 이름 회원 찾기");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");

            int menu = input.nextInt();

            if (menu == 1) {
                System.out.println("회원가입 실행");
            } 
            else if (menu == 2) {
                System.out.println("로그인 실행");
            } 
            else if (menu == 3) {
                System.out.println("같은 이름 회원 찾기 실행");
            } 
            else if (menu == 9) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } 
            else {
                System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
            }

            System.out.println();
        }

	}
}
