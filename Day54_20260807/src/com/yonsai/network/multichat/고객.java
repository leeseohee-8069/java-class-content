package com.yonsai.network.multichat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class 고객 {

	public static void main(String[] args) {
		Scanner 키보드 = new Scanner(System.in);

		try {
			// 1. AI서버 연결하기 (본인 ip)를 작성
			Socket AI서버 = new Socket("192.168.82.100", 9000);

			// 2. AI한테 질문 보내기 준비
			PrintWriter 질문보내기 = new PrintWriter(AI서버.getOutputStream(), true);
			Scanner 답변읽기 = new Scanner(AI서버.getInputStream());

			while (true) {
				// 3. 키보드로 입력
				System.out.print("재미니한테 물어보기 >");
				String 질문 = 키보드.nextLine();

				// 4. 바로 재미니에게 보내기
				질문보내기.println(질문);

				// 4.들어온질문을 읽기
				if (답변읽기.hasNextLine()) {
					String 답변 = 답변읽기.nextLine();
					System.out.println("AI 답변:" + 답변);

				}
			}

		} catch (Exception e) {
		}

	}
}
