package com.yonsai.thread.interfaceTest;

// 회사에서 개발을 하기 위해서 각각 개발자한테 기능나눈다.
// 로그인 - 카카오톡,토스,git,네이버 , 구글

public interface Role {

	public void login();  // 로그인
	public void logout(); // 로그아웃 
}
