package com.yonsai.network.multichat;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// gpt, 재미니,클로드 

public class Ai서버 {

	public static void main(String[] args) {

		try {
			// 1. AI서버 문 열기
			ServerSocket AI서버 = new ServerSocket(9000);

			// 2. 기다리기
			Socket 들어온고객 = AI서버.accept();
			System.out.println(들어온고객);

			// 3. 들어온고객의 질문을 읽는다.
			Scanner 질문읽기 = new Scanner(들어온고객.getInputStream());
			PrintWriter 답장보내기 = new PrintWriter(들어온고객.getOutputStream(), true);

			// 4.들어온질문을 읽기
			while (true) {
				if (질문읽기.hasNextLine()) {
					String 질문 = 질문읽기.nextLine();
					System.out.println("고객 질문:" + 질문);

					// 5. 고객 답변 보내기
					// 6. 답변 보내기
					답장보내기.println("네! 좋은 질문입니다! -lsh");
				}
			}
		} catch (Exception e) {
		}

	}

}
