package com.yonsai.thread.chatroom;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

// 채팅방서버!
// 강사가 채팅방 만들어서 사용! 어려우면 안 하셔도 됩니다!
public class 채팅방서버 {

	
	// 접속하는 학생들 정보 모아놓기 
	// 채팅방에는 학생들의 정보를 모아놔야 강사가 안녕하세요! 
	// 각각 학생들의 콘솔창에 떠야죠!(front)
	
	// 브로드캐스트 (Broadcast)
	//  한명이 보낸 메시지를 접속해 있는 모든 사람에게 동시에 전달하는 것!
	
	// 실무에서도 많이 사용이 된다. 
	// 라디오 / TV방송  - 방송국서버가 말하면 그걸 모든 사람 동시에 듣는다.
	// 유튜브라이브 - 스트리머 한 명의 방송이 시청자 전원에게 동시 송출된다.
	// 온라인게임 - 플레이어의 정보가 모든 플레이어에게 전달 된다. 
	// 주식앱 - 주가가 바뀌면 그 종목을 보고 있는 모든 사람에게 동시 업데이트된다.
	
	static ArrayList<PrintWriter> 접속한모든학생들 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		try {
			ServerSocket 채팅방서버 = new ServerSocket(11000);
			
			//학생들이 계속 접속하면 반복적으로 저장해야된다.
			
			while(true) {
				Socket 들어온학생 = 채팅방서버.accept();
				System.out.println("학생 접속함! "+ 들어온학생);
			
			
				//각각 학생들이 동작할 수있도록 채팅방 입장에서도
				// 동시에 채팅을 작성할 수 있고 동시에 메시지를 읽을 수
				// 있게 실행되야된다.
				new Thread(()->{
					
					// 채팅방서버도 메시지 읽고(input), 보내기(output)
					try {
						Scanner 메시지읽기 = new Scanner(들어온학생
												.getInputStream());
					
						PrintWriter 답장보내기 = new PrintWriter(
												들어온학생
												.getOutputStream()
												,true);
						//1 접속하자마자 닉네임 물어보기 
						답장보내기.println("닉네임을 입력하세요!");
						String 닉네임 = 메시지읽기.nextLine();
						
						
						//2 접속한모든학생들 저장할께!
						접속한모든학생들.add(답장보내기);
						
						//3. 입장 알림 브로트캐스트
						// 제 서버 콘솔에 띄우는것!
						System.out.println(닉네임 + "님이 입장했습니다.");
						for(PrintWriter 학생 : 접속한모든학생들) {
							// 각각의 학생들 콘솔창에 띄우는것!
							학생.println("[알림] "+닉네임+"님이 입장하셨습니다.");
						}
						
						
						while (true) {
							if (메시지읽기.hasNextLine()) {
								String 메시지 = 메시지읽기.nextLine();
								System.out.println("[" + 닉네임 +"]" + 메시지);

								// 명단에 있는 모든 학생한테 전송
								for (PrintWriter 학생 : 접속한모든학생들) {
									학생.println("["+닉네임 +"]" +메시지);
								}
							}
						}					
					} catch (IOException e) {
						
						e.printStackTrace();
					}				
				}).start();
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}		
	}
}



