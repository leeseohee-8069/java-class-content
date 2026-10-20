package com.yonsai.cookie;

import java.util.ArrayList;
import java.util.Scanner;

// 메인화면 파일 

public class Main {

	public static void main(String[] args) {
		// 파일을 나눈다. (자바 - 하나의 파일은 하나의 기능만 해야된다)
		// 시작하는 파일(Main)
		// 실제 게임을 진행하는 파일(Service)
		// 데이터를 가져와야된다.(Mysql)
		
		// 메인화면에서 게임 시작해라!(손가락으로 메인 화면누름)
		new CookieRunGameService()
			.touchToStart();
		
		
	}
}
/*

		Scanner 키보드 = new Scanner(System.in);

		// 쿠키런 게임에서 많은 사람의 데이터를 저장!
		// ArrayList 배열 
		ArrayList<String> nickNameList = new ArrayList<>();

		System.out.println("전체 회원");
		System.out.println(nickNameList);
		
				
		System.out.println("게스트 아이디입력:");
		String nickName = 키보드.nextLine();
		nickNameList.add(nickName);
		
		System.out.println("게스트 아이디입력:");
		nickName = 키보드.nextLine();
		nickNameList.add(nickName);
		
		System.out.println("게스트 아이디입력:");
		nickName = 키보드.nextLine();
		nickNameList.add(nickName);
		
		System.out.println("전체 회원");
		System.out.println(nickNameList);
		
		// 위에 코드 실행해봤자 프로그램이 종료되는 순간에
		// 데이터가 전부 사라짐(메모리는 휘발성)
		// 게임을 껐다 켜면 캐릭터가 다시 레벨1로 초기화!
		// 수백,수천명의 캐릭터 데이터를 관리!
		
		// 게임이 꺼도 회원,레벨,코인,아이템 같은 데이터를
		// 계속 저장을 해야된다.
		
		// SSD/HDD 
		//  - 컴퓨터를 꺼도 파일이 남아있음
		
		// 데이터베이스 (Mysql)
		//  - 데이터를 저장해 놓고 필요할 때 마다 검색,
		//    수정,삭제 할 수있음
		//  - 24시간 돌아가야된다. 
		//  하나의 프로그램! (로딩페이지)
		
		//  게임이 켜져있는 동안은 프로그램이 실행하니깐
		//  메모리에 데이터를 저장할 수있다.
		//  문제가 프로그램 종료되면 싹 다! 날라간다!
		
		
		
*/