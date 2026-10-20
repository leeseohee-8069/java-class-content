package com.yonsai.cookie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


// 로그인하는 화면 파일

public class CookieRunGameService {
	
	Scanner 키보드 = new Scanner(System.in);
	ArrayList<String> 왕국이름들 = new ArrayList<>();
	
	Connection conn;
	
	//연결 통로 만들기!
	// 실제 객체를 생성할 때 자동으로 실행되는 생성자를 이용해서 
	// 연결 객체를 자동으로 만든다.
	public CookieRunGameService() {
		try {
			conn = DriverManager
					.getConnection(
							"jdbc:mysql://localhost:3306/cookierungame",
							"root",
							"1234"
				);
			System.out.println(conn);
			System.out.println();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}				
	}
	//게임이 시작되면 로그인 화면이 켜지기 전에 
	// 기존 유저들에 대한 정보 가져오는 문장!
	public void 유저가져오기() {
		
		//sql 문장
		String sql = """
				select 
					* 
				from 
					users
				""";
		// sql 실행을 도와주는 클래스 
		try {
			PreparedStatement 변경된sql = conn
										.prepareStatement(sql);
			
			// 보내!
			ResultSet 결과관리 = 변경된sql.executeQuery();
			
			while(결과관리.next()) {
				// 데이터베이스에서 결과들의 모음으로 표형태로
				// 주면 자바는 읽을 수없다! 
				// 한 행씩 접근해서 자바의 변수에 각각 저장한다.
				String 왕국이름 = 결과관리
								.getString("kingdomName");
				// ArrayList에 저장한다.
				왕국이름들.add(왕국이름);
			}
			
			System.out.println("유저 회원 가져오기 성공!!");
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	
	//화면이 이동했다. 그래서 메뉴를 보여준다.
	public void touchToStart() {
		// 유저의 정보 가져오기 
		유저가져오기();
		
		System.out.println("DEV PLAY");
		System.out.println("to:" +왕국이름들);
		로그인();
		// 왕국이름을 저장하면 arraylist 확인
	}
	
	public void 로그인() {
		
		System.out.println("""
				1. google login
				2. apple login
				3. facebook login
				4. email login
				5. 게스트로 시작하기				
				""");
		int 메뉴번호 = 키보드.nextInt();
		
		// 건너뛰기 방지
		키보드.nextLine();
		
		if(메뉴번호 == 1) {}
		else if(메뉴번호 == 2) {}
		else if(메뉴번호 == 3) {}
		else if(메뉴번호 == 4) {}
		else if(메뉴번호 == 5) {
			System.out.print("왕국이름:");
			String 왕국이름 = 키보드.nextLine();
			
			왕국이름들.add(왕국이름);
			
			// 왕국이름을 저장하면 arraylist 확인
			System.out.println(왕국이름들);
			
			// sql 작성
			// 왕국이름으로 한다는 것은 게임을 처음 들어와서 
			// 처음 시작한다는 뜻! 
			String sql = """
				
				insert into users (	kingdomName) 
				values( ? )
					
				""";
			// sql실행 
			try {
				PreparedStatement 변경된sql = conn
											.prepareStatement(sql);
				
				//? 물음표 채우기 
				변경된sql.setString(1,왕국이름);
				
				// 보내!
				변경된sql.executeUpdate();
				
				System.out.println("회원 가입및 로그인 성공!");
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}		
	}
	
	
}
/*
 쿠키런 게임이 실행하는 순서
	   Main
		↓
CookieRunGameService 객체 생성
        ↓
생성자 자동 실행
        ↓
MySQL 연결
        ↓
touchToStart() 실행
        ↓
로그인 메뉴 출력
        ↓
사용자가 5번 선택
        ↓
왕국 이름 입력
        ↓
ArrayList에 왕국 이름 저장
        ↓
ArrayList 출력
		↓
Mysql 데이터를 저장하기 
-------------------------------------------------
유저가져오기 함수 실행 순서 
Main 실행
   ↓
CookieRunGameService 객체 생성
   ↓
생성자 자동 실행
   ↓
Java와 MySQL 연결
   ↓
유저가져오기() 실행
   ↓
SELECT * FROM users 전송
   ↓
MySQL이 기존 회원 목록 반환
   ↓
ResultSet에 조회 결과 저장
   ↓
while(결과관리.next())
한 행씩 이동
   ↓
kingdomName 컬럼 값 꺼내기
   ↓
자바 String 왕국이름 변수에 저장
   ↓
ArrayList 왕국이름들에 추가
   ↓
touchToStart() 실행
   ↓
기존 회원 목록 출력
   ↓
로그인 메뉴 출력

 */





