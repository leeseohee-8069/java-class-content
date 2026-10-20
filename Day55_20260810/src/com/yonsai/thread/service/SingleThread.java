package com.yonsai.thread.service;

// 싱글쓰레드
//  - 일꾼 한명이 일을 하나씩 순서대로 처리하는것!
//    무조건 위에서부터 아래로 내려가면서 앞의 일이
//    끝나야 다음 일을 할 수있다. (동기)
public class SingleThread {

	void test() {
		// Thread
		// - 프로그램 안에서 코드를 실행하는 일꾼!
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");

		// 우리가 만든 서버(프로그램) 한번에 하나의
		// 코드를 처리할 수있다.
		// 하나씩 처리하다보니 오래걸리는 작업들이
		// 생기면 컴퓨터를 아예 못쓴다.
		// 동시에 실행하는 프로그램! - 쓰레드

		for (int i = 0; i < 100; i++) {
			System.out.println(i + "%");
			try {
				// 프로그램을 지연시키는 함수!
				// 2초에 한번씩 반복시킨다.
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("완료!");

	}
}
