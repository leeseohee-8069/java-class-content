package com.yonsai.thread.service;

//내가 직접 일꾼을 만들어서 할 일 주겠다!
// 람다 문법 나오기 전 !
// 자바는 상속을 한번 받으면 다른 클래스를 상속하지 못해요!
class MyThread extends Thread{
	
	//할일 작성하는 메서드 
	@Override
	public void run() {
		// 할일을 작성하면된다!
	}
}

// 위에 문제점을 해결하기 위해서 인터페이스 
// 다중상속이 안되는 자바의 문제점을 해결하기 위해서 
// 인터페이스로 규칙들을 강제해서 사용했다.
class MyThread2 implements Runnable{

	@Override
	public void run() {
		System.out.println("하하");
	}	
}

public class ThreadService {
	
	
	public void 예전문법() {
		MyThread2 th = new MyThread2();
		Thread ths2 =  new Thread(th);
		ths2.start();
	}

	// 람다 - 함수를 짧게 적는 방법 
	// 17버전 
	public void 기본문법() {
		new Thread(()->{
			
		}).start();
	}
}
