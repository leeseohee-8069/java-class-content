package com.yonsai.thread.webserver;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		Scanner 키보드 = new Scanner(System.in);
		
		// 사용자는 카카오톡서버에 접속해야된다.
		// BindException 포트번호가 충돌해서 그렇다! 
		//   포트 번호를 바꾸고 이클립스를 껐다가 다시 켜면 제대로 실행한다.
		
		try {
			// 1. 연결 (ip,포트번호)
			Socket 카카오톡서버 = new Socket("localhost",10003);
			
			// 클라이언트 입장에서도 메시지를 보내고 받기 
			
			// 메시지 받을 준비!
			Scanner 메시지받기= new Scanner(카카오톡서버
											.getInputStream());
			
			// 답장은 사용자에게 보내기 
			// 메시지 보낼 준비! 
			PrintWriter 메시지보내기 = new PrintWriter(카카오톡서버
											.getOutputStream()
											,true);
			// 채팅방에서 내가 메시지를 작성하고 있다.
			// 그러면 다른 사람은 메시지 작성 못하나요? 아니죠!
			// 사용자마다 각각 메시지를 작성할 수있도록! 스레드!
			
			// 아래 스레드는 메시지 읽기만 하는 직원!
			new Thread(()->{
				
				while(true) {
					if(메시지받기.hasNextLine()) {
						String 받은메시지 = 메시지받기.nextLine();
						System.out.println("[채팅방]: " + 받은메시지);
					}
				}
				
			}).start();
			
			// 이미 main도 하나의 직원! 
			// main 스레드는 메시지를 입력하는것만 실행한다. 
			while(true) {
				String 내메세지 = 키보드.nextLine();
				메시지보내기.println(내메세지);
			}
				
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
