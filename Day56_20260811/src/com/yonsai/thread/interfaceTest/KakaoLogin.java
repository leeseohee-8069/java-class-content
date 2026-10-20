package com.yonsai.thread.interfaceTest;

// Role 같은 폴더(패키지)있기 때문에 import 문이 뜨지 않는다.
// A 개발자한테 카카오톡로그인 개발해!

public class KakaoLogin implements Role{

	@Override
	public void login() {
		// 카카오톡 로그인
		System.out.println("1. 토큰값");
		System.out.println("2. 사용자 정보");
	}

	@Override
	public void logout() {
		System.out.println("로그아웃은 간편하게 함수하나실행");
	}

}
