package com.yonsai.thread.game;

import java.util.Random;

// 
public class ThreadGame {

	// 각각 티아그라, 오타, 마키아토가 각각의 목숨 변수를
	// 공유해서 사용할 수있도록 static 선언한다.
	// 1. 목숨 추가
	static int 티아그라체력 = 100;
	static int 오타체력 = 100;
	static int 마키야토체력 = 100;

	public void 게임실행() {
		// 각각의 캐릭터들한테 동시에 행동해!

		// 2. 랜덤값을 이용해서 각각 캐릭터가 데미지를 준다.
		Random 랜덤 = new Random();

		// 티아그라 -> 달려!
		Thread 티아그라 = new Thread(() -> {
			
			while(티아그라체력 > 0 && 오타체력 > 0) {
				// 데미지는 5~10사이 랜덤값을 뽑는다.
				int 티아그라공격력 = 랜덤.nextInt(10) + 5;
	
				// 티아그라가 오타 공격해서 데미지 준다.!
				오타체력 = 오타체력 - 티아그라공격력;
				System.out.println("티아그라 공격!!! 데미지: " + 티아그라공격력
									+"티아그라체력  체력: " + 티아그라체력 );
				
				try {
					Thread.sleep(500); // 0.5초마다 한 번씩 공격
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// 오타 -> 방망이 휘둘러!
		Thread 오타 = new Thread(() -> {
			
			while(마키야토체력 > 0 && 오타체력 > 0) {
				
				int 오타공격력 = 랜덤.nextInt(10) + 5;
				
				// 오타는 마키아토를 공격한다.
				마키야토체력 = 마키야토체력 - 오타공격력;
				System.out.println("오타 공격!!! 데미지: " +오타공격력
									+"오타 체력: " + 오타체력);
				
				try {
					Thread.sleep(500); // 0.5초마다 한 번씩 공격
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// 마키아토 -> 점프하기!
		Thread 마키아토 = new Thread(() -> {
			while(마키야토체력 > 0 && 티아그라체력 > 0) {
				int 마키아토공격력 = 랜덤.nextInt(10) + 5;
				// 마키아토는 티아그라를 공격한다.
				티아그라체력 = 티아그라체력 - 마키아토공격력;
				
				System.out.println("마키아토 공격!!! 데미지: " 
									+ 마키아토공격력 +
									"마키아토 체력:" + 마키야토체력);
				
				
				try {
					Thread.sleep(500); // 0.5초마다 한 번씩 공격
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		// 시작!
		티아그라.start();
		오타.start();
		마키아토.start();

	}
}
