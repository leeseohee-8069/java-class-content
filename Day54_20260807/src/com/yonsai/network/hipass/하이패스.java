package com.yonsai.network.hipass;

import java.net.ServerSocket;

public class 하이패스 {

	public static void main(String[] args) {
		
		try {
			
			// 1. 하이패스 차선 열기 
			ServerSocket 하이패스 = new ServerSocket(1234);
			
			// 2. 자동차가 들어올때까지 기다린다.
			하이패스.accept();
			
			// 3. 차량의 정보랑 결제정보가 들어오면 결제를 한다.
			
			
			
		}catch (Exception e) {}
		
	}

}
