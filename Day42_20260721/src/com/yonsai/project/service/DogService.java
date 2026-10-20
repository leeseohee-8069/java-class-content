package com.yonsai.project.service;

import java.util.HashMap;

// 강아지 입양 정보 관리
// 강아지 마다 강아지 정보를 한꺼번에 묶어서 저장
// 각각의 강아지 마다 정보를 저장한다. 
class Dog {
	String dogId; // 강아지들의 정보를 순서대로 저장하는 id d001
	String name; // 강아지 이름
	String breed; // 품종
	boolean isAdopted; // 입양여부 입양되었는가?
	
	// is ~인가? 맞니? 틀리니?
	// true 맞다! false 틀린다.
	// isLogin -> 로그인 되었니?
	// isAdmin -> 관리자니?
	// isSoldOut -> 품절이니?
	
	
	
	// 클래스 멤버 변수를 한꺼번 자동으로 출력해주는 특별한 
	// 함수가 있다!
	// 클래스 안에 변수들을 소개시키는 함수!
	@Override
	public String toString() {
		return "[강아지id=" + dogId + 
				", 이름=" + name +
				", 품종=" + breed + "]";
	}	
}

public class DogService {
	// DogService.java 실행을 해야되는데 메인함수가 없다!
	// 자체적으로 실행을 못한다.

	// 강아지들의 정보를 저장하는 함수!
	public void 강아지입양테스트() {
		
		// 1. 여러 강아지를 저장하는 공간 (새로운 변수생성)
		// new HashMap<>(); 빠르고 쉽게 검색하고 저장하는 공간
		// 2. 강아지들 변수에 메모리 주소 저장한다.
		HashMap<String, Dog> 강아지들 = new HashMap<>();

		// 2. Dog 객체 1(d001, 초코, 말티즈, false) 생성 후 필드 값 대입
		Dog 강아지1 = new Dog();
		강아지1.dogId = "d001";
		강아지1.name = "초코";
		강아지1.breed = "말티즈";
		강아지1.isAdopted = false;
		강아지들.put("d001", 강아지1);
		

		// 3. Dog 객체 2(d002, 몽이, 푸들, false) 생성 후 필드 값 대입
		Dog 강아지2 = new Dog();
		강아지2.dogId = "d002";
		강아지2.name = "몽이";
		강아지2.breed = "푸들";
		강아지2.isAdopted = false;
		강아지들.put("d002", 강아지2);
		
		// 4. Dog 객체 3(d003, 보리, 진돗개, false) 생성 후 필드 값 대입
	
		Dog 강아지3 = new Dog(); //heap
		
		강아지3.dogId = "d003";
		강아지3.name = "보리";
		강아지3.breed = "진돗개";
		강아지들.put("d003", 강아지3);
		강아지3.isAdopted = false;		
		System.out.println(강아지들);
		
		// d002 있니? 없니?
		
		if(강아지들.containsKey("d002")) {
			System.out.println("강아지 있다");
		}else {
			System.out.println("해당 강아지를 찾을 수 없습니다");
		}		
		
		// 면접!
		//  이 객체는 참조(메모리의 주소) new를 이용해서 만든 타입
		//          값을 저장하고 있느냐? 10 ,0.012,"이서희";
		//  정확하게 설명할 수있는지?
		
	}
	
	// 가장 기본적으로 메모리 구조!
	public void 메모리구조() {
		int num = 0;  // stack 
		
		// 메모리에 구조는 2개만 확인 
		//  heap - new를 했을때 생기는 변수!(객체)
		//       - new를 해서 만든 객체!
		
		
		//  stack - new가 붙지 않는 변수들
		//        - 변수들이 저장되는 곳!
		//          지역변수
		
	
		int num5 = 0;
		double num4 = 0;
		char ch1 = 'ㅁ';
		boolean result; 
		
		// Stack에는 위치(주소)를 저장하고 Heap에는 실제
		// 객체를 저장한다. 서로 다른 공간이라 주소로 
		// 연결을 해서 사용한다. 
		
		// stack 크기가 정해져있는 변수들! (기본타입)
		// heap 크기가 정해져있지 않는 변수들! (클래스타입)
		//      클래스 멤버 변수들의 개수가 정해져있지 않음
	}
	
	
	
	
	
	
	

}
