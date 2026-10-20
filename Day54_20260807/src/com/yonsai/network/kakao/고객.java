package com.yonsai.network.kakao;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class 고객 {

	public static void main(String[] args) {
		
		// 1. 서버 연결한다.
		try {
			Socket 서버 = new Socket("localhost",10004);
			
			//2. 메시지 보낼 준비
			PrintWriter 메시지보내기 = 
								new PrintWriter(서버.getOutputStream()
										       ,true);
			// 3. 메시지 작성후 보내기 
			// 안녕하세요라는 메시지를 서버로 보내! 
			메시지보내기.println("안녕하세요!");
			
			// 4. 카카오톡이 보낸 메시지를 읽기
			
			Scanner 답장읽기 = 
						new Scanner(서버.getInputStream());
			
			
			if(답장읽기.hasNextLine()) {
				String 답장 = 답장읽기.nextLine();
				System.out.println("서버 답장:" + 답장);
			}
			
			
		} catch (Exception e) {
			System.out.println("에러발생");
		}
	}
}
/*
 * 2번 추가 설명
 * // get 가져와!
	// output 내보내
	// Stream 데이터가 흐르는 길
	// 서버로 연결된 길 가져와! 그래서 문자로 채팅 보낼꺼야!
 * 
 */
