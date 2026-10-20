package com.yonsai.thread;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
	
	}
}

/*
 * 
import com.yonsai.thread.interfaceTest.GitLogin;
import com.yonsai.thread.interfaceTest.KakaoLogin;
import com.yonsai.thread.interfaceTest.NaverLogin;
import com.yonsai.thread.interfaceTest.Role;
 // 인터페이스 복습!
		// - 약속(규칙)
		// - 실제 동작은 없지만 이런 기능을 만들어야해!
		// - 개발자들끼리 함수명을 통해서 유연하게 개발하자!
		
		Role 카카오톡 = new KakaoLogin();
		카카오톡.login();
		
		Role[] 로그인들 = {
				new KakaoLogin(),
				new NaverLogin(),
				new GitLogin()
		};
		// 규칙을 만들어서 각각 개발자들한테 나눠준다.
		// Main 코드 건들지 않고 각각 인터페이스의 규칙을 오버라이딩
		// 덮어써서 개발해라! 
		// 메인에서는 login() 메서드 호출만하면 각각의 개발자가
		// 개발한 코드로 자연스럽게 연결된다.
		// else if() 확연하게 줄어든다.
		
		for(Role 회사 : 로그인들) {
			회사.login();
			회사.logout();
		}	 
 */



