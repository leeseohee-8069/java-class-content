package com.yonsai.jdbc;

import com.yonsai.jdbc.service.JdbcConnectorTest;

// package 
//  - 폴더 구조! 프로젝트 구조를 잡기 위한 경로!

// API
//  - 프로그램하고 프로그램끼리 통신해서 
//    데이터를 주고 받는 방법!
//  - fetch() 다운로드!처럼 !
// mysql - 자바 통신을 해서 데이터를 주고
// 받아야된다.
// 문제 - 사용하는 언어가 다르다!
//      그래서 데이터를 주고받지 못한다. 
// 해결책 
//   - 중간에 데이터를 자바에서 mysql로 
//     변경! mysql -> 자바 언어로 변경해주는
//     도구가 필요하다
public class Main {

	public static void main(String[] args) {
		System.out.println("조회!");
	
		// JDBC (Java Database Connectivity)
		//  - 자바에서 SQL을 mysql 보내고,그 결과를 다시
		//    자바로 받아오는 방법!
		//  - 연결하는 라이브러리 (도구 ) 버전은 상관없음!
		
		JdbcConnectorTest service  = new JdbcConnectorTest();
		
		// 1. 연결함수를 실행해라!
		service.connect();
		
		// 2. 상품가져오기() 실행해!
		//  고객이 브라우저에서 메인 화면을 들어왔을 때 상품가져와서 
		//   보여주기 쿠팡.com 
		//  쿠팡 버튼 클릭하기 -> 자바한테 데이터 가져와 -> mysql 
		// -> 자바에게 보낸다. -> 자바가 프론트로 보낸다.-> 브라우저가
		// 데이터 읽어서 화면에 보인다. 
		service.상품가져오기();
		
		
		//카페메뉴 가져와!
		service.커피메뉴가져오기();
		
		
		
	}
}
