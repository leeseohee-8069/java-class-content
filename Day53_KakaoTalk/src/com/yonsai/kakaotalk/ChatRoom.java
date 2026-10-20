package com.yonsai.kakaotalk;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//채팅방 화면!
// 상황 제가 남편한테 일 끝났어? 새로운 채팅방을 열었다!
public class ChatRoom {

	String name;   			//나와의 채팅이다!
	Connection conn;		//연결정보 저장!
	
	//채팅방이 새로 만들어지는 순간!
	// 이름을 가져오고 화면에 출력!
	// ChatRoom 이 new 하는 순간 class ChatRoom 클래스파일이
	// 실행된다. 
	public ChatRoom(String name) {
		
		this.name = name;
		
		try {
			conn =  DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/kakaotalk",
					"root",
					"1234"
					);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(conn);
		System.out.println();
		
		System.out.println("프로필이미지");
		System.out.println(name);
		
		//디비야! 채팅 저장해 줄래?
		//채팅저장하기();
		
		기존대화가져오기();
		
		
	}
	void 기존대화가져오기() {
	
		// 상황 저랑 남편이랑 대화하는 창에서 
		// 기존 대화를 가져오는 방법!
		
		String sql = """
			select 
				* 
			from 
				chat_message
			where 
				senderName = '남편'
				""";
		
		try {
			PreparedStatement sql실행관리 = 
					conn.prepareStatement(sql);
		
			ResultSet 결과받기 =  sql실행관리
									.executeQuery();
			System.out.println("======== 남편 ======");
			
			// next 여러개의 결과를 한 행씩 꺼내서 데이터가 있니?
			// true, false 반복이 진행여부 파악!
			while(결과받기.next()) {
				String 메시지 = 결과받기.getString("message");
				System.out.println(메시지);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
	
	// 시간 순으로 정렬 -> order by 
	// 실시간 -> select, insert 안되요! JDBC X
	//       완전 다른 기술이 필요하다!
	// 폴링(Polling) - 앱이 1~2초마다 새 메시지 있어? 자동으로 계속 
	//                 물어본다. 
	// 웹소켓(Web Socket) 
	//   서버(카카오톡)랑 클라이언트(나) 한번 연결해서 계속 채팅방 닫지
	//  않고 켜두기!
	
	
	void 채팅저장하기() {
		String 채팅메시지 = "너 먹었니?";
		String 보낸사람 = "이서희";
		
		// 1. sql 작성
		// 어떤 대상이 어떤 메시지를 작성할지 모른다. ?
		// ? 빈칸, 빈칸 문제처럼 나중에 답을 채우는 자리!
		String sql명령문 = """
				insert into 
					chat_message(senderName,message)
				values 
					(? , ?)
				""";
		// 2. sql 실행
		try {
			PreparedStatement sql실행 = conn
								.prepareStatement(sql명령문);
			
			// ? 채우기 
			// set~~~  빈칸 값을 채운다. 
			sql실행.setString(1, 보낸사람);
			sql실행.setString(2, 채팅메시지);
			
			// 보내라!
			sql실행.executeUpdate();
			
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3. 보내기
	}

}

// 1. 대화창열기(나와대화창)
// 2. ChatRoom() 채팅방 생성
// 3. 생성자 동작해서 DB연결(통로)
// 4. 채팅방 화면 출력(이름,프로필이미지)
// 5. 채팅저장하기()실행
// 6. DB에 저장!









