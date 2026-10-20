package com.yonsai.network.bus;

import java.net.ServerSocket;

public class 버스답말기 {

	public static void main(String[] args) {
		try {
			// 1. 버스 단말기 켜기
			ServerSocket 단말기 = new ServerSocket(7700);
			
			// 2. 카드가 찍힐때까지 기다리기
			단말기.accept();
			
		}catch(Exception e) {}
	}
}
