package com.yonsai.network.kakao;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class 카카오톡서버 {

	public static void main(String[] args) {

		try {
			// 1. 서버 열기
			ServerSocket 서버 = new ServerSocket(10004);
			
			// 2. 사용자 기다리기 (고객이 언제 들어올지 언제 메시지를 보낼지 모른다)
			while(true) {
				Socket 들어온고객 = 서버.accept();				
				System.out.println(들어온고객);
				
				//3. 들어온고객의 소켓통로에서 데이터 읽기 
				Scanner 들어온고객메시지읽기 = 
								new Scanner(들어온고객
											.getInputStream());
				
				// hasNextLine() 지금 메시지 있나요?
				if(들어온고객메시지읽기.hasNextLine()) {
					String 메시지 = 들어온고객메시지읽기.nextLine();
					System.out.println(메시지);
				}
				
				// 고객한테 답변 보낼 준비 
				PrintWriter 답변보내기 = new PrintWriter(
										들어온고객
										.getOutputStream()
										,true
										);
				// 고객에게 보낼 메시지 작성후 보내기 
				답변보내기.println("카카오톡 - 안녕하세요! 고객님!");
			
			}
		}catch (Exception e) {
			System.out.println("에러발생");
		}		
	}
}
/*
 Server
  - 요청을 기다리고 받아주는 프로그램 
  - 데이터를 저장하고 있다가 고객들한테 제공하는 컴퓨터
  
[카카오톡서버]
 1. 서버 문 열기 
public class 카카오톡서버 {

	public static void main(String[] args) {

		try {
			// 1. 서버 열기
			ServerSocket 서버 = new ServerSocket(10004);
			
			// 2. 사용자 기다리기
			서버.accept();
			
			System.out.println("사용자가 메시지를 보냈다!");
			
		}catch (Exception e) {
			System.out.println("에러발생");
		}		
	}
}

*/