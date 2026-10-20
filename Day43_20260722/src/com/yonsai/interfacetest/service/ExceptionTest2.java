package com.yonsai.interfacetest.service;

import java.util.Scanner;

// if문으로 미리 걸러내고(확인) try~catch로 실행중 문제를 잡는다!
// 예제들 파일이다!
public class ExceptionTest2 {
	
	Scanner 키보드 = new Scanner(System.in);
	
	public void 예제2() {
		
		// 사용자들이 키보드로 어떤 내용을 입력할 지 몰라요!
		// 가지고 있는 데이터로 판단! if
		// 정상적인 데이터를 만들지도 못하는 상황을 처리! try~catch
		
		// 예외처리는 프로그램 멈춘다!제일 위험 
		
		try {
			System.out.println("나이를 입력하세요(숫자만):");
			
			// 사용자들이 나이를 입력! 
			// 문자로 입력을 할 수도 있다는 것! 사용자들이 입력하기전에는 절대 
			// 모른다. 여기서 예외가 발생한다!
			int age = 키보드.nextInt();
			
			if(age >= 20) {
				System.out.println("성인입니다.");
			}else {
				System.out.println("미성년자입니다.");
			}
			
		}catch(Exception e) {
			System.out.println("어떤 예외든 다 받아서 처리할께!");
		}
	}
	
	

	public void 예제1() {
		// 나이 계산
		String 나이 = "abc";

		// if를 쓴이유
		// 나이변수에 값이 비었는지(isEmpty)는 실행전에 눈으로 바로 확인이 가능한 조건
		if (나이.isEmpty()) {
			System.out.println("값을 입력하세요!");
			return; // 값이 비었는데 뭐하러 실행! 실행할 필요없다!
		}

		// 문자를 숫자로 변경
		// 문법적으로는 틀린게 없다 그리고 미리 비었는지도 확인 데이터가 있대요!
		// 실행을 해봐야 변경이 잘 되는지 안되는지 알수있다.
		try {
			int 숫자나이 = Integer.parseInt(나이);
			System.out.println("나이: " + 숫자나이);

		} catch (Excepdtion e) {
			System.out.println("어떤 예외든 모두 처리하겠다");
		}
	}
}
