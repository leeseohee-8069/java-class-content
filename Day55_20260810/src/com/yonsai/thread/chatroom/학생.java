package com.yonsai.thread.chatroom;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class 학생 {

	public static void main(String[] args) {
		Scanner 키보드 = new Scanner(System.in);

		try {
			
			// 1. 채팅방서버로 연결하기 
			Socket 채팅방서버 = new Socket
								("localhost",
								 11000);
			// 2. 메시지받기(input) , 보내기(output)
			PrintWriter 메시지보내기 = 	new PrintWriter(
										채팅방서버
										.getOutputStream()
										,true);
			Scanner 메시지받기 =new Scanner(
									채팅방서버
									.getInputStream());					
			
			// 3. 메시지를 받는 전담 직원!
			new Thread(() -> {
				while (true) {
					if (메시지받기.hasNextLine()) {
						System.out.println(메시지받기.nextLine());
					}
				}
			}).start();
			
			// 4. 메시지를 입력해서 보내는 전담 직원!
			// 제일 처음 입력하는걸 닉네임! 암묵적으로 순서를 정한다.
			while (true) {
				System.out.println("메시지 입력>");
				String 내메시지 = 키보드.nextLine();
				메시지보내기.println(내메시지);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

// 항상 실행은 무조건 서버를 실행한 후!
// 학생 파일에 들어와서 ctrl + f11 -> 3번을 누르면
// 학생 3명이 접속된걸로 보인다.!






