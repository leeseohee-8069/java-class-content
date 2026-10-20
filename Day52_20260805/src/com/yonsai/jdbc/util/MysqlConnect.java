package com.yonsai.jdbc.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Mysql 연결 정보를 한 번 만들어서 계속 재사용한다.
// Connection (연결 유지)
//	자바프로그램 , Mysql은 완전 프로그램!
//  - 지금부터 자바프로그램과  Mysql 사이에 통로를 열어줄께!
//  - 데이터를 주고받는 통로를 열어놓고 유지하고,통로는 닫는 역할!
//  자바의 원칙
//   - 하나의 클래스가 여러 책임을 가지면 안된다. 
//   - 하나의 기능만 해야된다. 

// PreparedStatement(Sql실행)
//   - 어떤 SQL을 어떻게 보낼지 
//   - 자바에서 mysql로 질문을 보내고 mysql이 실행될수 있도록 
//     담당하는 클래스!
//   - sql 실행!

// ResultSet (결과 읽기)
//   - SQL에서 나오는 표 형태를 자바가 몰라요!
//   - mysql에서 받은 데이터를 자바에서 한 행씩 순회(반복) 꺼내서 
//     자바가 사용할 수있도록 저장한다. 


public class MysqlConnect {

	// static 공유!
	// MysqlConnect 나 연결정보좀 줄래?
	// 연결정보 보내줄께! return 
	public static Connection getConnect() {
		try {
			return DriverManager
						.getConnection(
								"jdbc:mysql://localhost:3306/yonsai_db",
								"root",
								"1234"
				   );
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 혹시 에러가 발생하면 연결이 안됬다는 뜻으로 아무값이 없어요!
		return null;
	}
	
	
	
	
	
	
}
