package com.yonsai.network.service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class 주방 {

	public static void main(String[] args) {
		
		// 1. 포트번호만 열기!
		//키오스크랑 주방의 통로번호는 꼭! 맞춰줘야된다
		// 주방이 5000 , 키오스크 5000
		// 주방을 10004 , 키오스크 10004
		try {
			ServerSocket 주방 = new ServerSocket(10004);
			System.out.println("주문을 기다리는중...");
			
			// 키오스크에서 주문이 올때까지 기다리는 함수!
			// 2. 키오스크 연결 받기 
			Socket 연결  = 주방.accept();
			
			// 3. 주문 받기 
			Scanner 주문받기 = new Scanner(연결.getInputStream());
			
			// 4. 주문 읽기 
			String 주문 = 주문받기.nextLine();
			
			System.out.println("주문 들어옴:" + 주문);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
/*
 *  키오스크나 배달플렛폼 주문을 할려면 
 *  가게 문 열때까지 기다린다(ServerSocket)
 *  주방은 손님이 주문을 할 때까지 기다려야된다. (accept)
 * 
 *  주방장이 주문을 읽기 (Scanner)
 */




