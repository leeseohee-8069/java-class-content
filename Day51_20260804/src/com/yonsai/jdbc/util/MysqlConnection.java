package com.yonsai.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConnection {
	// 실제 실무에서도 많이 사용하는 기법!
	// 연결 정보를 클래스 내부에서만 쓰는 값 private
	
	// 어디서든지 MysqlConnection안에서 한번 만들어진 정보를
	// 가져다가 쓸 수있다.
	// 하나를 만들어서 공유(static)한다! 
	public static Connection getConnect() {
		// getConnect()함수를 실행시킨 파일에게 연결정보를 
		// 보내준다. 
		String url = "jdbc:mysql://localhost:3306/yonsai_db";
		String user = "root";
		String password = "1234";
		
		// 에러가 발생하지 않으면 연결정보를 넘겨주고!
		// 에러가 발생하면 아무값도 없습니다. null 넘겨준다.
		try {
			return DriverManager
						.getConnection(url, user, password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
	
}
