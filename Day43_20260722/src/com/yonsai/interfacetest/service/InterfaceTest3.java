package com.yonsai.interfacetest.service;

// 삼성 휴대폰을 이용해서 무선이어폰을 연결 
// 버즈,에어팟,소니 등등등등  어떤 무선 이어폰이든 음악재생,유튜브생성
// 음성재생이 정상적으로 연결되서 되야된다.
interface 무선이어폰{
	void 음악재생();
}

class 버즈 implements 무선이어폰{

	@Override
	public void 음악재생() {
		System.out.println("버즈 연결을 할때 소프트웨어를 자동으로설치");
		System.out.println("자동으로 뮤직을 재생한다.");
	}	
}

class 에어팟 implements 무선이어폰{

	@Override
	public void 음악재생() {
		System.out.println("에어팟 연결을 할때 애플 소프트웨어를 자동으로설치");
		System.out.println("자동으로 테스트음악 재생한다.");
	}
}

class 소니이어폰 implements 무선이어폰{

	@Override
	public void 음악재생() {
		System.out.println("소니이어폰 연결을 할때 소니 소프트웨어를 자동으로설치");
		System.out.println("자동으로 실행되지 재생 않는다.");
	}
}

class 삼성휴대폰 {
	
	// 어떤 이어폰이 연결되는 음악만 재생하면 된다. 
	public void 음악듣기(무선이어폰 이어폰) {
		이어폰.음악재생();
		System.out.println("이어폰 연결 완료!");
	}	
}

//모든 AI가 지켜야되는 규칙!
interface AIModel{
	// 질문을 받으면 답변을 문자열로 돌려준다. 
	String generate(String prompt);
}

class ChatGPT implements AIModel{

	// 
	@Override
	public String generate(String prompt) {
		return "ChatGPT" + prompt +"답변을 합니다.";
	}	
}

class Gemini implements AIModel{

	// 
	@Override
	public String generate(String prompt) {
		return "Gemini" + prompt +"답변을 합니다.";
	}	
}

class Claude implements AIModel{

	// 
	@Override
	public String generate(String prompt) {
		return "Claude" + prompt +"답변을 합니다.";
	}	
}

class 비쥬얼코드{
	
	public void 질문하기(AIModel ai, String prompt) {
		System.out.println("질문:" + prompt);
		String 답변 = ai.generate(prompt);
		System.out.println(답변); // 프론트화면 
	}
}


public class InterfaceTest3 {
	//main연결해서 실행하기 
	public void 실습() {
		System.out.println("실습 함수 실행됨!");
		
		// 실제 핸드폰 
		삼성휴대폰 서희 = new 삼성휴대폰();
		
		// 버즈 이어폰
		// 변수를 만들어서 new한 클래스를 저장하는 이유는 
		// 한번 구매를 하면 오랫동안 혹은 한번 구매를 하면 잃어버리지
		// 않는 이상은 계속 사용!
		버즈 버즈이어폰 = new 버즈();
		
		서희.음악듣기(버즈이어폰);
		
		// 버즈를 잃어버림 ㅠㅠ 그래서 새로운 이어폰 소니이어폰
		소니이어폰 새로산소니이어폰 = new 소니이어폰();
		서희.음악듣기(새로산소니이어폰);
		
		
		// 다형성
		//  - 하나의 타입으로 여러개의 타입들이 저장되서
		//    실행할 수있도록 도와주는 문법!
		
	}
}

/*
//컴퓨터를 구매를 했다. 컴퓨터는 삼성 
//프린트 LG를 본체에 연결, 소닉, 삼성 
//어떤 프린터가 와도 삼성본체랑 연결해서 출력만하면 된다.

//규칙: 어떤 프린터든 출력하기 라는 함수이름만 전달을 해서
//   각각의 프린트가 내용을 직접 작성할 수있도록!
interface 프린터{
	void 출력하기();
}

class LG프린터 implements 프린터{

	@Override
	public void 출력하기() {
		System.out.println("LG프린터로 출력한다.");
	}	
}
class 소닉프린터 implements 프린터{

	@Override
	public void 출력하기() {
		System.out.println("소닉프린터로 출력한다.");
	}	
}*/