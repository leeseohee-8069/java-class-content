package com.yonsai.cookie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 게임을 시작하려면 게임 메뉴화면이 필요하다.
// 게임을 시작하기 전에 캐릭터도 사고 펫도 사고 
// 보석도 사고 돈도 충전하고 대기실(대시보드) 
// 게임 준비화면!
public class CookieRunGameStartScreen {
	
	// 게임화면이 열리기 전에 캐릭터의 정보와 유저 정보(한 명)를
	// 가져와서 보여주기 
	Connection conn;
	
	String kingdomName;   //누가 로그인했냐? 그때 왕국이름
	
	// CookieRunGameStartScreen 객체가 생성될 때 
	// 연결 정보 자동으로 실행하기 (생성자)
	public CookieRunGameStartScreen(String 로그인한유저왕국이름) {
		
		// Mysql 연결 정보!
		try {
			conn = DriverManager
					.getConnection(
							"jdbc:mysql://localhost:3306/cookierungame",
							"root",
							"1234"
				);
			System.out.println(conn);
			System.out.println();
			
			//유저의 정보도 같이 저장해야된다.
			//게임시작화면에 유저의 정보를 띄워야되니
			// 로그인한 유저의 왕국이름을 가져온다.
			kingdomName = 로그인한유저왕국이름;
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}				
		
	}
	
	
	
}
