package com.yonsai.thread.interfaceTest;

// B개발자 네이버 로그인/로그아웃 개발해!
public class NaverLogin implements Role{

	@Override
	public void login() {
		// 네이버 로그인
		System.out.println("1. 아이디 패스워드 확인");
		System.out.println("2. 사용자 정보");
	}

	@Override
	public void logout() {
		System.out.println("사용자 로그인 정보 확인");
		System.out.println("토큰값 확인 후 로그아웃됨");
	}	
}
