package com.yonsai.network.chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class 학생 {

	public static void main(String[] args) {
		
		//강사 컴퓨터 ip입니다. 192.168.82.100
		try {
			// 1. 강사 서버 접속하기 
			Socket 강사서버 = new Socket
								("192.168.82.100",
								  9000);
			// 2. 질문 보내기 준비
			PrintWriter 질문보내기 = new PrintWriter(
										강사서버
										.getOutputStream(),
										 true
								  );
			// 3.질문작성하고 보내기 
			질문보내기.println("서희 - 날씨가 참좋네요!");
							
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
