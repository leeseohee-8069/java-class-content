package com.yonsai.thread.webserver;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

// 웹에서 사용자의 요청을 받아서 응답해주는 프로그램
// 웹 서버(유튜브,배달의민족,네이버,채팅서버,카카오톡서버)
// 동시에 수백만명이 접속한다. 
// 서버하나가 한 명씩 순서대로 처리하면 뒷사람은 몇시간씩 기다려야된다.
// 그래서 요청이 올 때 마다 스레드를 배정해서 동시에 처리한다.!
public class WebServer {
	// 카카오톡서버
	
	//  접속한 모든 사용자한테 전체 공지를 보낼때가 있다.
	//  각각 채팅방에 들어가면 여러명의 사람들에게 내가 작성한 
	//  메시지를 전달!
	//  1:1 메시지가 아니라 여러 사람들을 관리할 수있는 공간
	//  오픈 채팅, 단체 채팅방!
	
	//PrintWriter
	//  - 접속하는 사람마다 메시지를 보낼 수있는 도구! 누군가 메시지를 보내면
	//   모든사용자변수 안에 있는 사람들에게 메시지를 전달할 수있다.
	// PrintWriter 한 사람에게 보내는 도구!
	// ArrayList<PrintWriter> 여러명에게 메시지를 보낼 수있는 도구!
	
	static ArrayList<PrintWriter> 모든사용자 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		try {
			// 1. 문 열고
			ServerSocket 카카오톡서버 = new ServerSocket(10003);
			System.out.println("사용자 기다리는중...");
			// 2. 기다리기 
			// 계속 반복하면서 사용자를 받는다.
			// 받으면서 각각 메시지를 처리할 수있도록 쓰레드를 만들어준다.
			
			while(true) {
				Socket 들어온사용자 =  카카오톡서버.accept();
				System.out.println("사용자접속함 " + 들어온사용자);
			
				//상대방이 나한테 메시지를 보낸다. 
				// 내 입장에서는 읽기! Input
				Scanner 메시지읽기 = new Scanner(들어온사용자
												.getInputStream());
				
				// 답장은 사용자에게 보내기 
				// 내 입장에서는 내보내기 Output
				PrintWriter 답장보내기 = new PrintWriter(들어온사용자
												.getOutputStream()
												,true);
						
				// 모든사용자 리스트에 등록!
				모든사용자.add(답장보내기);
				
				// 3. 들어온 사용자를 새 스레드(직원)한테 맡기고
				// 메인은 다른 사용자 받으러 간다.
				new Thread(()->{
						System.out.println("메시지보내실껀가요?");
						System.out.println("무엇이든 제가 처리해야드릴께요~");
						
						String 메시지;
						if(메시지읽기.hasNextLine()) {
							메시지 = 메시지읽기.nextLine();
							System.out.println("받은 메시지: "+ 메시지);
							
							for(PrintWriter 사용자: 모든사용자) {
								사용자.println(메시지);
							}	
						}				
					}
				).start();
				
			}
		}catch (Exception e) { // 에러가 났을 때 어떤 에러인지 확인
			e.printStackTrace(); //에러를 추척!
		}
		
		
		
	}
}

/*
 *  혹시 포트 충돌이 발생하면 명령프롬프트(윈도우 설정)
 *  포트확인 명령어 
 *   netstat -ano  (윈도우)
 *   lsof - i      (맥)
 * 
 *  a -> ALL (모든 연결과 열려있는 포트를 보여줘!)
 *  n -> 주소와 포트번호를 숫자로 보여줘!
 *  o -> 이 포트를 사용하는 프로그램의 id값(pid)
 * 
 */






