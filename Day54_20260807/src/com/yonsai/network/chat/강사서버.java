package com.yonsai.network.chat;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 본인이름서버
public class 강사서버 {

	public static void main(String[] args) {
	
		//1. 서버 문 열기 
		try {
			ServerSocket 강사서버 =  new ServerSocket(9000);
			
			while(true) {
				Socket 들어온학생 = 강사서버.accept();
				
				System.out.println("학생이 들어왔어요!");
				System.out.println(들어온학생);
				
				// 3. 들어온학생의 질문 메시지를 읽을 것
				// 들어온 학생의 소켓통로에서 데이터를 읽어라!
				Scanner 질문읽기 = 
							new Scanner(들어온학생.getInputStream());
				// 일단 데이터가 들어왔는지 물어볼께!
				// 데이터가 있으면 화면에 출력하고 데이터가 없으면 아직 값이
				// 들어오지 않았다.
				if(질문읽기.hasNextLine()) {
					// 4. 학생이 보낸 메시지를 콘솔에 출력하기 
					String 질문 = 질문읽기.nextLine();
					System.out.println("학생: "+ 질문);
				}else {
					
					System.out.println("아직 값이 들어오지 않았습니다.");
				}				
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
