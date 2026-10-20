package com.yonsai.network;

// java.net  자바에서 네트워크에 관련된 도구들이 들어있다.
import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkTest {

	void 아이피주소알아내기() {
		// 자바에서도 아이피를 알아낼 수있는 클래스가 있다. 
		try {
			InetAddress 네이버ip = InetAddress
									.getByName("www.naver.com");
		
			// 구글 아이피를 알아내기 
			InetAddress 구글ip = InetAddress
					.getByName("google.com");

			
			System.out.println("네이버ip:" + 네이버ip);
			System.out.println();
			System.out.println("구글ip:" + 구글ip);
		} catch (UnknownHostException e) {			
			System.out.println("URL을 다시 확인하세요!");			
		}
		
		
		
		
		
		
	}
}
