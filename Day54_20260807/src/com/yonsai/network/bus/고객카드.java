package com.yonsai.network.bus;

import java.net.Socket;

public class 고객카드 {
	public static void main(String[] args) {
		
		try {
			// 1. 단말기에 대기!(카드찍기)
			Socket 단말기 = new Socket("localhost",7700);
			
			// 2. 카드정보 보낼 보내기 
			
			// 3. 카드번호 보내기
		}catch(Exception e) {}
	}
}
