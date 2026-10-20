package com.yonsai.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yonsai.jdbc.util.MysqlConnection;

public class Main {

	public static void main(String[] args) {
		// utility (유틸리티)
		//  - 자주 사용하는 편리한 기능/도구!
		//  - 자주 이용하는 편리한 도구들을 모아놓은 패키지(폴더)
		// 폴더명 util명으로 많이 쓴다. 
		
		// 1. 연결
		Connection conn = MysqlConnection.getConnect();
		
		// 2. persons 테이블(표하나) 회원가입 시키기
		// 자바 버전 17 이상! 텍스트 블록! 기능 추가!
		// 자바는  "" 한줄에 모두 문자를 작성한다! 기준!
		// 여러줄을 작성할 수있도록 만들어줄께 """ 여러가지문자 """;
		String sql명령어 = """
			insert into persons
			values ('eryna',20,'경기도 동탄','010-1234-1234')								
		""";
		
		// 3. 자바->mysql 로 변경
		try {
			PreparedStatement 변경된sql문 = conn
								.prepareStatement(sql명령어);
		
			//4. 보내기 
			//  select 단순 조회! - executeQuery()
			// insert,update, delete - executeUpdate()
			변경된sql문.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
		System.out.println("정상적으로 추가했습니다.!");
	}
}

/*
 * 
 * // 프로그램이 시작하면 가장 먼저 찾는곳!
		// 하나만 존재한다. 
		
		// 1. 자바랑 mysql랑 연결(데이터를 주고받을 수있는 상태)
		//  : 앞뒤의 역할을 구분하는 구분자!
		//  각각의 정보가 무슨 역할인지 구분하는것!
		String url = "jdbc:mysql://localhost:3306/kh_db";
		String user = "root";
		String password = "1234";
		
		//실습 
		//  - 직원 테이블에서 이메일 주소에 ju가 포함되어있는 모든
		//   이메일을 조회해서 직원의 이름만 출력!
		//   ? 나중에 값을 넣을 자리!
		//   빈칸!
		//  고객들이 검색하는 내용이 다 다르다! 
		
		// 아래처럼 빈 칸으로 만들어놓으면 해커들이 SQL Injection
		// (SQL삽입공격) 
		String sql =  "select * from employee" 
		            + "where email LIKE ?";
		
		try {
			// 2. 연결 정보 저장하기!
			Connection con = DriverManager 
						.getConnection(url, user, password);
		
			System.out.println(con);
			
			// 3. 자바가 mysql한테 부탁!
			//  부서명 좀 보내줄래? 부서명을 전체 조회하겠다.
			// String sql명령어 = "select * from department where dept_title = '마케팅부'";
					// 4. 자바의 문자타입을 mysql이해할 수있도록 변경
			//  자바 타입 String -> mysql varchar 타입변경
			//   이상한 sql문법일 수도 있어서 확인!
			PreparedStatement 변경된sql = con
									.prepareStatement(sql);
			
			변경된sql.setString(1, "%ju%");
			// 5. mysql로 보내기 
			ResultSet 조회된결과 =  변경된sql.executeQuery();
			
			// 6. 한 행씩 꺼내기 !
			while(조회된결과.next()) {
				String 이름 = 조회된결과.getString("emp_name");
				System.out.println(이름);
			}
			// 7. 연결 끊기!
			//  항상 데이터베이스는 모든 일이 끝나면 항상 닫기
			
			조회된결과.close();
			변경된sql.close();
			
			con.close();
			
			// 실무에서는 위에 close들 각각 수동으로 작성해서 닫는게
			// 싫다! 불편하다 그래서 자동으로 알아서 닫아줬으면 좋겠다!
			// try(연결정도){실제 실행하는 코드}catch(){}
			// try가 끝나면 자동으로 괄호안에 연결 정보들을 close()
			// try - with - resources
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
 * 
 * 
 * try {
			// 2. 연결 정보 저장하기!
			Connection con = DriverManager 
						.getConnection(url, user, password);
		
			System.out.println(con);
			
			// 3. 자바가 mysql한테 부탁!
			//  부서명 좀 보내줄래? 부서명을 전체 조회하겠다.
			// String sql명령어 = "select * from department where dept_title = '마케팅부'";
			
			// 현재 부서가 몇개 인지 확인 
			// sql 에서 개수를 확인하는 함수 count(*)
			String sql명령어 = "select count(*) AS 개수 from department";
			
			// 4. 자바의 문자타입을 mysql이해할 수있도록 변경
			//  자바 타입 String -> mysql varchar 타입변경
			//   이상한 sql문법일 수도 있어서 확인!
			PreparedStatement 변경된sql = con
									.prepareStatement(sql명령어);
			
			// 5. mysql로 보내기 
			ResultSet 조회된결과 =  변경된sql.executeQuery();
			
			// 6. 한 행씩 꺼내기 !
			while(조회된결과.next()) {
				String 개수 = 조회된결과.getString("개수");
				System.out.println(개수);
			}
			// 7. 연결 끊기!
			//  항상 데이터베이스는 모든 일이 끝나면 항상 닫기
			
			조회된결과.close();
			변경된sql.close();
			
			con.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
 * 
 * 
 * while(조회된결과.next()) {
				String 부서명 = 조회된결과.getString("dept_title");
				System.out.println(부서명);
			}
 * 
 */
