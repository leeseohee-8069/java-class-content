package com.yonsai.project;

import com.yonsai.project.service.DogService;
import com.yonsai.project.service.MapTest;
import com.yonsai.project.service.MapTest2;

// java 패키지명 관례는 회사/조직의 도메인 주소를 거꾸로 뒤집어
// 서 짓는다.
//  - 이름 충돌 방지 
//  - 소유권/출처 구분 (어느 조직이 만든 코드인지 명확)
//  - 도메인
//    사람이 외우기 쉽게 만든 인터넷 주소!
//  - 자바에서 기본 폴더(default package) 경로 설정을 못잡는다.
//    다른 폴더에서 파일을 가져가서 객체 생성이 불가능하다!
//    다른 import 안된다! 
//    프로젝트가 커지면 클래스가 수백 개인데 전부 폴더 구분없이
//    한곳에 몰리면 관리 불가!(협업불가)
public class Main {

	public static void main(String[] args) {
		
		// 모든 자바 파일들은 main함수 안에서 실행을 해야된다.
		// 프로그램의 시작점!
		
		DogService test3 = new DogService();
		// 지시한다!
		// test3 파일에 가서 강아지입양테스트함수 실행해! 
		test3.강아지입양테스트();
		
		
		// 지시만!
//		MapTest2 test2 = new MapTest2();
//		
//		test2.테스트2();
		
		
		// 실행 순서 
		// 1. 자바 실행 후 main을 찾는다.(실행한다.)
		// 2. new MapTest2() 파일을 메모리 확보해라!
		//    test2에 저장해라!
		// 3. test2안에 있는 테스트를 함수를 실행해라!
		// test2.테스트();
		
		// 메모리 공간을 확보한다. 무슨타입으로 MapTest 보고
		// 공간을 확보하고 끝난다.
		// main파일과 MapTest 파일이 연결되었다!
//		MapTest map =  new MapTest();
//		
////		MapTest안에 있는 함수들을 실행할 수있다!
//		//maptest안에 mapEx()함수 실행해!
////		map.mapEx();
//		
//		// mapTest안에 회원정보조회해!
//		map.회원정보조회();
	}
}





