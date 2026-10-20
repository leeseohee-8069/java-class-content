package com.yonsai.thread.service;

// 멀티쓰레드 
//  - 일꾼 여러명이 각각의 일을 처리하는 것!
//  - 뷔페(김밥,스시,국수,튀김) 자바스크립트(비동기)
//  - 앞의 일이 끝날 때 까지 기다리지 않고 여러 작업을
//    같이 진행할 수있다. (동시에 실행)
//  - 서버(데이터를 처리하고 저장하는 곳) - 쓰레드
//  - 브라우저(크롬,엣지,파이어폭스) - 비동기
public class MultiThreadTest {

	// 다른 폴더로 이동을 하고 싶으면 public
	public void 기본문법() {
		// Thread 클래스로 되어있다.
		// 한명의 일꾼을 만들 때 아래처럼 코드를 작성하면
		// 된다.
		// new Thread(어떤일할지 할일 주면된다.) 
		System.out.println(new Thread());
		System.out.println(new Thread());
		System.out.println(new Thread());
		System.out.println(new Thread());
		System.out.println(new Thread());
	}
	
	public void 쓰레드이름() {
		
		// 1. 직원!
		Thread 김총무 = new Thread();
		
		// 2. 이름달기 
		김총무.setName("김총무 돈과 자제관리");
		
		System.out.println(김총무);
	}
	
	public void 할일주기() {
		
		// 1. 인사팀  - 직원 좀 뽑아줘!
		Thread 박인사 =  new Thread(()->{
			System.out.println("일단 사람인에 공고올리기");
			System.out.println("서류확인");
			System.out.println("면접 보기");
			System.out.println("개발팀 면접 인원3명 최종 나한테 보여줘");	
		});	
		
		// 2. 직원 일 시작!
		박인사.start();
		
		// 3. 사장님은 다른 일 보러 갑니다.
		System.out.println("사장님: 다른 회사 마케팅 홍보하러가기!");
		
	}
	
	
	
	
	
}
