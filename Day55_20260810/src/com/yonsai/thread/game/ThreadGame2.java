package com.yonsai.thread.game;

public class ThreadGame2 {

	public void 게임실행() {
		
		Thread 전사 = new Thread(()->{
			System.out.println("전사: 검을 휘두른다!");
		});
		
		Thread 궁수 = new Thread(()->{
			System.out.println("궁수: 화살을 쏜다!");
		});
		Thread 마법사 = new Thread(()->{
			System.out.println("마법사: 파이어볼을 시전한다!");
		});
		Thread 힐러 = new Thread(()->{
			System.out.println("힐러: 회복 마법을 건다!");
		});
		
		전사.start();
		궁수.start();
		마법사.start();
		힐러.start();
		
	}
}
/*
실습 문제: 캐릭터 4명이 동시에 한 번씩 행동하기
		 RPG 캐릭터 4명이 각자 자기 행동을 한 번씩 하고, 
		 그걸 동시에 실행하는 프로그램을 만드세요.
등장인물과 행동
	전사 → "전사: 검을 휘두른다!"
	궁수 → "궁수: 화살을 쏜다!"
	마법사 → "마법사: 파이어볼을 시전한다!"
	힐러 → "힐러: 회복 마법을 건다!"
	해야 할 것
	
4명 각각을 Thread로 만들고, 위에 적힌 대사를 각자 스레드 
안에서 System.out.println()으로 출력 4개 스레드 모두 
.start()로 실행해서 동시에 움직이게 만들기

*/