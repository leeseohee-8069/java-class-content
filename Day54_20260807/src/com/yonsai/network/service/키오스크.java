package com.yonsai.network.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class 키오스크 {

	public static void main(String[] args) {
		
		// 키오스크를 이용해서 주문하려면 키오스크를 주방에 연결
		// 1. 연결  
		//  포트 번호는 우리가 직접 정해도 된다. 
		//  1~10000번 안에는 혹시 다른 회사들에서 사용하는 포트번호를
		// 미리 예약해놓은 경우가 있어서 충돌위험!
		try {
			Socket 연결통로 = new Socket("localhost",10004);
			
			System.out.println("연결 성공!");
			
			// 2. 데이터 보내기 
			// 보내는 통로 (방향  고객->주방 주문을 한다)
			// 주문이 들어오면 바로 전달하겠다. true값을 붙인다!
			PrintWriter 주문보내기 = 
			 new PrintWriter(연결통로.getOutputStream(),true);
			
			// 3. 그럼 메뉴 작성해서 보내라
			주문보내기.println("햄버거 2개");
		
		} catch (Exception e) {
			// 에러 기록 콘솔에 출력 순서대로!
			e.printStackTrace();
		} 
	}
}
/*
 * 키오스크 (고객) 클라이언트
 * 1. 주방에 연결하기   (socket)
 * 2. 주문 보낼 준비!	(주문지)
 * 3. 주문 보내기!		(주문지 작성 보내기)
 * 
 * 
 * 
 * 
 */




