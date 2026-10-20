package com.yonsai.kakaotalk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {

	public static void main(String[] args) {
		
		//  카카오톡에 실행하는 구조!
		//  Main은 카카오톡 메인프로필과 친구들이 모여있는 화면!
		//  보여주는 데이터
		//   유저의 정보(회원) / 프로필 (Profile) / 친구(Friend)
		
		// 카카오톡 실행 순서 
		// 로그인 됬다 -> 유저의 정보를 가져온다 (DB) -> 화면에 보인다
		// 로그인이 됬다면 어떤 유저인지 알 수있다.
		int user_id = 1; 
		
		// 그럼 메인 화면을 띄워야되니깐 데이터베이스로 접근해야된다.
		// 1. 통로 연결 Connection
		Connection conn;
		String name;
		String msg;
		
		try {
			 conn =  DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/kakaotalk",
						"root",
						"1234"
			);
			System.out.println(conn);
			System.out.println();
			
			//2. 나 1번 회원의 정보 주세요!
			String sql명령문 = """
					select 
						* 
					from 
						profile_list
					where 
						user_id = ?
					""";
			// 3. Sql실행 
			PreparedStatement sql실행관리 = conn
									.prepareStatement(sql명령문);
			//  ? 물음표 채우기 
			// 고객들마다 회원번호가 다르다! 변수를 집어 넣는다.
			sql실행관리.setInt(1, user_id);
			
			// 4.보내기 
			ResultSet 결과받기 = sql실행관리.executeQuery();
			
			// 5. 화면에 출력하기
			while(결과받기.next()) {
				System.out.println("프로필이미지");
				name = 결과받기.getString("name");
				msg = 결과받기.getString("status_msg");
				
				System.out.println(name);
				System.out.println(msg);
				
			}			
		}catch(Exception e) {}
		
		// 1.연결 	
		// 2.SQL작성
		// 3.실행 
		// 4.결과받기
		// 5.출력!
		// 거의 다 웹 앱 사이트는 위에 있는 내용을 기준으로 
		// 실행한다.
		
		// 채팅방을 열었다!
		// 채팅방 화면을 만든다. 
		
		// 나와의 대화 
		// name 변수에는 이서희!
		
		// 새로운 채팅방 하나를 만들어줄래?
		new ChatRoom("이서희");
//		new ChatRoom("아버님");
//		new ChatRoom("남편");
//		new ChatRoom("어머님");
		
		
		
		
		
	}
}
