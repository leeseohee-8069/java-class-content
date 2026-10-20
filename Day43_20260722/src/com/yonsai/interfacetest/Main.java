package com.yonsai.interfacetest;

import com.yonsai.interfacetest.service.ExceptionTest;
import com.yonsai.interfacetest.service.InterfaceTest;
import com.yonsai.interfacetest.service.InterfaceTest2;
import com.yonsai.interfacetest.service.InterfaceTest3;

public class Main {

	public static void main(String[] args) {
		
		// 프로젝트 할 때 무조건 시작(진입점)
		// 지시만!
		
		ExceptionTest 테스트4 = new ExceptionTest();
//		테스트4.예외처리();
		테스트4.예외처리2();
		테스트4.예외처리3();
		
		
//		InterfaceTest3 테스트3 = new InterfaceTest3();
//		테스트3.실습();
	
		
		/*
		 * InterfaceTest2 테스트2 = new InterfaceTest2(); //테스트2.테스트2();
		 * 
		 * 테스트2.주문화면();
		 */
		// new 주소가 계속 새롭게 생긴다. 
		//InterfaceTest 테스트 = new InterfaceTest();
		
		// 테스트변수 안에 테스트1함수를 실행해줘!
		//테스트.테스트1();
	}
}
