package com.yonsai.network.hipass;

import java.io.PrintWriter;
import java.net.Socket;

public class 자동차 {

	public static void main(String[] args) {
		try {
			//1. 하이패스 연결
			Socket 하이패스 = new Socket("localhost",1234);
			
			//2. 차량 정보 보낼 준비
			//  몇 차선으로 갈껀데? 그 길 좀 가져올래?
			PrintWriter 보내기 = 
			new PrintWriter(하이패스.getOutputStream(),true);
			
			// 3. 결제정보 보내기
			보내기.println("1500원");
			
		}catch(Exception e) {}
	}

}
