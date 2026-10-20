package com.yonsai.thread;

import com.yonsai.thread.game.ThreadGame;
import com.yonsai.thread.game.ThreadGame2;
import com.yonsai.thread.service.MultiThreadTest;

public class Main {

	public static void main(String[] args) {
		
		ThreadGame2 리니지 = new ThreadGame2();
		리니지.게임실행();
		
	}
}
/*
	ThreadGame 파티애니멀즈게임 = new ThreadGame();
		파티애니멀즈게임.게임실행();
		
// main도 하나의 일처리 일꾼으로 포함된다.
//		MultiThreadTest 멀티쓰레드 = new MultiThreadTest();
//		멀티쓰레드.기본문법();
//		
//		// 김총무 부르기!
//		멀티쓰레드.쓰레드이름();
//		
//		// 박인사 부르기!
//		멀티쓰레드.할일주기();

*/