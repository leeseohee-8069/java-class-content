package com.yonsai.jdbc.service;

// Java와 DB가 연결된 상태를 저장하는 타입!
import java.sql.Connection;
//연결을 관리하는 클래스 !
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//데이터베이스에서 가져온 한 행을 저장하기
// 위해서 클래스로 한 행의 정보를 묶는다!
class User {

	int user_id;
	String nickname;
	String email;

}

public class JdbcConnectorTest {
	// 1. 자바랑 Mysql랑 연결!(연동)
	// 어떤 프로그램이든 기기랑 먼저 연결하듯이 프로그램끼리도
	// 연결을 해야된다.

	public void connect() {
		// 연결시 필요한 데이터! 3가지
		// Mysql에 연결할 때 필요한 정보
		// localhost -> 내 컴퓨터 주소(ip)
		// port -> 데이터들끼리 왔다갔다 이동하는 통로!
		//
		String url = "jdbc:mysql://localhost:3306/sns_db"; // naver.com, google.com
		String username = "root"; // 아이디랑 같다!
		String password = "1234";

		// 연결 시도 하는 코드
		// try ~ catch() 프로그램이 비정상적으로 끝나지 않게
		// 도와주는 문법!
		// username,password,url주소를 잘 못 입력해서 에러가나서
		// 프로그램이 멈추는 경우가 있다.
		try {
			Connection con = DriverManager.getConnection(url, username, password);

			System.out.println(con);
			System.out.println();
			System.out.println("==============================");

			// sql 명령어 작성하기
			// 전체 조회! (select)
			String sql = "select * from users";

			// 자바문자를 mysql의 진짜 언어로 바꿔준다.
			// sql로 보낼 준비를 한다.
			PreparedStatement pt = con.prepareStatement(sql);

			// mysql로 보내기!(전송)
			// execute() -> 실행하다
			// query -> 질문
			// sql 조회해! 실행해!

			// ResultSet
			// - select 결과를 가져온다.
			// - mysql에서 select결과를 받아오는 전용 타입!
			// - Result 결과 Set = 모음

			ResultSet rs = pt.executeQuery();

			// 여러개의 표형태로 저장된 rs에서 데이터 한 행씩
			// 꺼내기
			// next() 한 행씩 꺼내라! 데이터가 있으면 true
			// 데이터가 없으면 false
			// 언제 끝날지 모르는 상황!
			while (rs.next()) {
				String nickname = rs.getString("nickname");
				System.out.println(nickname);
			}

			// 관리자가 현재 가입된 고객들을 프론트 화면에서
			// 보고싶다!

			// 연결 끊기
			// - 데이터베이스 저장할 때 버그 유발!
			// - 보안 이슈!
			rs.close();
			pt.close();
			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

		System.out.println("연결 잘됨!");

	}

	// 쇼핑몰에서 상품을 조회하면 데이터 가져오기
	public void 상품가져오기() {
		// 1. 연결한다.
		String url = "jdbc:mysql://localhost:3306/shop_db"; // naver.com, google.com
		String username = "root"; // 아이디랑 같다!
		String password = "1234";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			// 2. sql 명령문 작성
			// 전체 조회!
			String sql = "select * from products";

			// 3. 보낼 준비
			// 자바 타입 -> sql언어 타입으로 변경한다.
			// 혹시 sql 문법이 틀렸는지도 같이 확인 한다.
			PreparedStatement pt = con.prepareStatement(sql);

			// 4. 전송
			// select조회된 값들의 결과를 rs에 담는다.
			ResultSet rs = pt.executeQuery();

			// 5. 한 행씩 꺼내기
			while (rs.next()) {
				// 상품명
				String 상품명 = rs.getString("name");
				System.out.println(상품명);
			}

			// 6. 닫기
			rs.close();
			pt.close();

			con.close(); // 연결정보를 완전히 끊기!

		} catch (SQLException e) {
			System.out.println("재시도!");
		}

	}

	// 커피 메뉴를 가져오기
	// 1. cafe_db 선택
	// 2. beverages 표에서 가격과 이름 출력하기
	// 실습하기
	public void 커피메뉴가져오기() {
		System.out.println();

		// 1. 연결한다.
		String url = "jdbc:mysql://localhost:3306/cafe_db"; // naver.com, google.com
		String username = "root"; // 아이디랑 같다!
		String password = "1234";

		try {
			Connection con = DriverManager.getConnection(url, username, password);

			// 2. sql 명령문 작성
			// 전체 조회!
			String sql = "select * from beverages";

			// 3. 보낼 준비
			// 자바 타입 -> sql언어 타입으로 변경한다.
			// 혹시 sql 문법이 틀렸는지도 같이 확인 한다.
			PreparedStatement pt = con.prepareStatement(sql);

			// 4. 전송
			// select조회된 값들의 결과를 rs에 담는다.
			ResultSet rs = pt.executeQuery();

			// 5. 한 행씩 꺼내기
			while (rs.next()) {
				// 상품명
				String 상품명 = rs.getString("name");
				System.out.println(상품명);

				// 숫자로 가져오는 방법
				int 가격 = rs.getInt("price");

				// String 가격 = rs.getString("price");
				System.out.println(가격);
			}

			// 6. 닫기
			rs.close();
			pt.close();

			con.close(); // 연결정보를 완전히 끊기!

		} catch (SQLException e) {
			System.out.println("재시도!");
		}

	}
	
	// 직원들에 대한 정보를 보여주는 프로그램
	public void 직원정보가져오기() {
		System.out.println();
		
	}
	
	
	

}

/*
 * 1. 연결한다. Connection
 * 
 * 2. SQL을 보낼 준비를 한다. PreparedStatement
 * 
 * 3. SQL을 실행한다. executeQuery()
 * 
 * 4. mysql에서 결과를 받는다. ResultSet
 * 
 * 5. 연결을 끊는다.
 * 
 * 
 * 
 * Application - 사용자가 어떤 일을 하기 위해 사용하는 프로그램
 * 
 * 이클립스 -> 실행 -> 우리가만든 프로그램(java Application) -> mysql connector -> Mysql
 * 데이터베이스!
 */
