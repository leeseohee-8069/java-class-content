package com.yonsai.interfacetest.service;

//무조건 지켜야되는 규칙!
//오버라이딩을 무조건 해야되는 규칙을 만들 때는 {}로를 생략한다.
//인터페이스를 가져가는 클래스가 무조건 오버라이딩해서 쓸 수있게!
interface 규칙{
	void 전진();
	void 후진();
	void 브레이크();
	void 주차();
}

// implements 반드시 지켜야되는 규칙! 
class A자동차 implements 규칙{

	@Override
	public void 전진() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 후진() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 브레이크() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 주차() {
		// TODO Auto-generated method stub
		
	}}

class B자동차 implements 규칙{

	@Override
	public void 전진() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 후진() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 브레이크() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 주차() {
		// TODO Auto-generated method stub
		
	}}

// 회사 기준 전직원 무조건 지켜야되는 규칙!
interface 직원규칙{
	void 출근하기();
	void 퇴근하기();
}

class 개발자 implements 직원규칙{

	@Override
	public void 출근하기() {
		// TODO Auto-generated method stub
	}
	@Override
	public void 퇴근하기() {
		// TODO Auto-generated method stub
	}	
}

// 규칙만 정한다 함수 이름은 이것만써!
// 실제 기능이 없다 {} new 해서 객체 생성 불가능하다!
// 그래서 어떤 클래스가 implements 구현해서 클래스에서
// 객체를 생성해야된다. 
interface 캐릭터{
	void 공격하기();
	void 이동하기();
}

class 전사 implements 캐릭터{

	@Override
	public void 공격하기() {
		System.out.println("칼 공격");
	}

	@Override
	public void 이동하기() {
		System.out.println("달려간다.");
	}	
}

class 궁수 {
	
	void 공격하기() {
		System.out.println("dd");
	}
}

public class InterfaceTest {
	//main이 없기 때문에 InterfaceTest 파일이 실행되지 않는다!
	// main을 각각 만들면 프로젝트를 실행했을 때 어디서 부터 시작을
	// 해야되는지 헷갈린다. 무조건 main은 하나만 있어야된다. 
	public void 테스트1() {
		System.out.println("테스트1번!");
		// 인터페이스 
		//  - 클래스가 반드시 구현해야될 함수 목록
		//  - 약속!
		//  - 규칙! 
		//  - 개발자들끼리 약속! 무엇을 해야하는지 규칙!
		//  상속과 인터페이스의 차이는 딱 하나!
		//   상속은 부모한테 받은 내용을 오버라이드 해도 되고 안해도 된다.
		//   부모 내용을 변경안하고 쓰고 싶으면 그냥 써도 된다. 
		//   자식 내용에 맞게 변경하고 싶다 재정의
		
		// 클래스는 메모리 생성 된다.
		전사 전사1 = new 전사();
		System.out.println("전사 캐릭터 생성:" + 전사1);
		
		// 인터페이스는 메모리 생성이 안된다.
		// 규칙을 정하는 interface들은 함수의 중괄호가 
		// 없어요 그래서 공격하기() 실행해! {} 어떤걸 실행
		// 해야되는지 내용이 없어요!
		
//		캐릭터 캐1 = new 캐릭터();에러
//		캐1.공격하기();
		
		
		
	}
}


/*

package com.yonsai.interfacetest.service;

class 자동차{
	
	// 동작 
	void 전진() {}
	void 후진() {}
	void 브레이크() {}
	void 주차() {}
}

class A자동차 extends 자동차{
	
	void 전진() {
		System.out.println("A자동차만의 방식 전진");
	}
	void 후진() {
		System.out.println("A자동차만의 방식 전진");
	}
	
	void 주차() {
		System.out.println("A자동차만의 방식 주차");
	}
	void 브레이크() {}
}

class B자동차 extends 자동차{
	
	void 전진() {
		System.out.println("B자동차만의 방식 전진");
	}
	void 후진() {
		System.out.println("B자동차만의 방식 후진");
		
	}
	void 브레이크() {
		System.out.println("B자동차만의 방식 브레이크!");
	}	
	void 주차() {}
}

// 무조건 지켜야되는 규칙!
// 오버라이딩을 무조건 해야되는 규칙을 만들 때는 {}로를 생략한다.
// 인터페이스를 가져가는 클래스가 무조건 오버라이딩해서 쓸 수있게!
interface 규칙{
	void 전진();
	void 후진();
	void 브레이크();
	void 주차();
}

public class InterfaceTest {
	//main이 없기 때문에 InterfaceTest 파일이 실행되지 않는다!
	// main을 각각 만들면 프로젝트를 실행했을 때 어디서 부터 시작을
	// 해야되는지 헷갈린다. 무조건 main은 하나만 있어야된다. 
	public void 테스트1() {
		System.out.println("테스트1번!");
		// 인터페이스 
		//  - 클래스가 반드시 구현해야될 함수 목록
		//  - 약속!
		//  - 규칙! 
		//  - 개발자들끼리 약속! 무엇을 해야하는지 규칙!
		//  상속과 인터페이스의 차이는 딱 하나!
		//   상속은 부모한테 받은 내용을 오버라이드 해도 되고 안해도 된다.
		//   부모 내용을 변경안하고 쓰고 싶으면 그냥 써도 된다. 
		//   자식 내용에 맞게 변경하고 싶다 재정의
		
	}
}



*/