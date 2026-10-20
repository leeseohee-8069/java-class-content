package com.yonsai.interfacetest.service;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

interface 아빠 {
	void 인사();
}

interface 엄마 {
	void 인사();
}

class 나 implements 아빠, 엄마 {

	// 상속해서 물려받는게 아니라 그냥 규칙만
	// 가져오는것!
	// 인터페이스는 규칙만 가져온다.
	// 아빠 인사(), 엄마 인사() 인사라는 함수를
	// 오버라이딩 무조건 해야되! 규칙!
	// 이 함수를 반드시 만들어!규칙 전달!
	@Override
	public void 인사() {
		System.out.println("안녕하세요!");
	}
}

// 결제 부분을 인터페이스로 개선
// 규칙: 모든 결제 수단은 "결제하기(금액)"를 반드시 가지고 있어야된다.

interface 결제수단 {
	void 결제하기(int 금액);
}

// implement (구현)
// - 내용을 만든다.
//   결제수단 규칙을 가져가서 내용을 만들어라!
// - 다형성 클래스도 상속하든 인터페이스로 규칙을 가져오던
//   하나의 타입으로 여러개의 타입을 저장할 수있다.
class 카카오결제 implements 결제수단 {
	@Override
	public void 결제하기(int 금액) {
		System.out.println("카카오 결제" + 금액);
	}
}

class 애플페이 implements 결제수단 {

	@Override
	public void 결제하기(int 금액) {
		System.out.println("애플페이 결제" + 금액);
	}
}

// 토스페이 추가
class 토스페이 implements 결제수단 {

	@Override
	public void 결제하기(int 금액) {
		System.out.println("토스페이 결제" + 금액);
	}
}

// 새 결제 수단이 추가돼도 이 클래스는 절대 안 바뀐다.
class 주문처리 {
	public void 주문하기(결제수단 방법, int 금액) {
		방법.결제하기(금액);
		System.out.println("주문이 완료! 대기시간 30분");
	}
}

public class InterfaceTest2 {

	public void 주문화면() {

		// 웹(UI)화면 (빈 화면)
		JFrame 결제창 = new JFrame();

		// 화면 설정
		결제창.setSize(350, 250);

		// 화면배치를 flex처럼 가로정렬 하겠다!
		결제창.setLayout(new FlowLayout());

		// 내용 추가
		JLabel 결제안내 = new JLabel("결제 방법을 선택하세요.");
		JRadioButton kakao = new JRadioButton("카카오페이");
		JRadioButton apple = new JRadioButton("애플페이");
		JRadioButton toss = new JRadioButton("토스페이");

		// 하나만 선택 가능
		ButtonGroup group = new ButtonGroup();
		group.add(kakao);
		group.add(apple);
		group.add(toss);
		
		// 결제하기 버튼 
		JButton btn = new JButton("결제하기");
		
		// 결제하기 버튼을 클릭했을 때 실행해라~
		// 이벤트를 달겠다. 
		// 고객이 버튼을 누른 동작을 했을 때 이렇게 실행해!
		btn.addActionListener(e->{
			
			// 선택한 결제수단은 아직 없다!
			결제수단 선택한결제수단 = null;
			
			// 어떤 결제수단이 체크 되었는지 확인
			if (kakao.isSelected()) {

				선택한결제수단 = new 카카오결제();

			} else if (apple.isSelected()) {

				선택한결제수단 = new 애플페이();

			} else if (toss.isSelected()) {

				선택한결제수단 = new 토스페이();
			}
			
			// 결제수단을 클릭했으니 주문처리를 한다.
			// 어떤 객체가 들어오든 결제하기()를 실행한다.
			주문처리 주문 = new 주문처리();
			주문.주문하기(선택한결제수단,25000);
	
			// 라디오버튼에서 체크가 되었는지 안됬는지 확인
//			System.out.println(kakao.isSelected());
//			System.out.println(apple.isSelected());
//			System.out.println(toss.isSelected());
			
			
		});
		
		// 결제창에 내가 만든 라벨,버튼,라디오버튼을 추가
		결제창.add(결제안내);
		결제창.add(kakao);
		결제창.add(apple);
		결제창.add(toss);
		결제창.add(btn);
		
		결제창.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		결제창.setVisible(true);

	}

	// 클래스는 다중(여러클래스) 상속 못한다.
	public void 테스트2() {
		주문처리 주문 = new 주문처리();
		주문.주문하기(new 카카오결제(), 10000);
		주문.주문하기(new 애플페이(), 20000);
		주문.주문하기(new 토스페이(), 25000);

		// 인터페이스도 클래스도 규칙을 가져오던(함수이름만)
		// 클래스는 변수랑 함수를 물려받는다.
		결제수단 첫번째수단 = new 카카오결제();
		결제수단 두번째수단 = new 애플페이();
	}
}

/*
1. interface 결제수단 { void 결제하기(int 금액); }
   → 몸통 없이 규칙만 선언
        ↓
2. class 카카오결제 implements 결제수단 { ... }
   class 애플페이 implements 결제수단 { ... }
   class 토스페이 implements 결제수단 { ... }
   → 각자 결제하기()의 내용을 다르게 채움 (@Override 필수)
        ↓
3. class 주문처리 {
       void 주문하기(결제수단 방법, int 금액) {
           방법.결제하기(금액);
       }
   }
   → 매개변수 타입을 "구체 클래스"가 아닌 "인터페이스"로 받음
        ↓
4. 실제 호출 시점
   주문.주문하기(new 카카오결제(), 10000);
   주문.주문하기(new 애플페이(), 20000);
   → new로 실체를 만들어서 넘길 때 비로소 어떤 결제수단인지 결정됨
        ↓
5. 다형성 작동
   → 같은 코드 "방법.결제하기(금액)"가 넘어온 객체에 따라 다르게 동작
        ↓
6. 확장
   → 새 결제수단(예: 네이버페이) 추가 시 새 클래스 하나만 만들면 끝
   → 주문처리 클래스는 절대 안 바뀜 (개방-폐쇄 원칙)
 
 
 
 
 
 
 * ========================== 주문하기
 * 
 * 가게 ( ) 치킨 ( ) 피자 ( ) 햄버거
 * 
 * 주문금액 [ 25000 ]
 * 
 * 주문시간 [ 오후 6시 ]
 * 
 * --------------------------
 * 
 * 결제방법
 * 
 * (●) 카드 ( ) 카카오페이 ( ) 네이버페이 ( ) 토스페이
 * 
 * [ 주문하기 ]
 * 
 * ==========================
 * 
 * 
 * 
 * 
 * //class 아빠{ 
 *  	void 인사() {  System.out.println("안녕하세요");  }  
 *  } //class
 * 엄마{ // void 인사() { // System.out.println("안녕하세요"); // } //} // 첫번째 문제는 나라는
 * 클래스 엄마아빠 클래스 둘다 못받음 // 두번째 문제는 두 클래스에 혹시라도 똑같은 이름이 있으면 // 자식입장에서 어떤걸 실행하지? //
 * 모호성(Ambiguity) 이런 문제 때문에 자바는 아예 차단! // 다중상속하지마! 그래서 인터페이스 나옴!
 * 
 * // 나 서희 = new 나(); // 서희.인사(); //class 나 extends 아빠,엄마{ // // 아빠의 함수를 받아옴 //
 * void 인사() { // System.out.println("안녕하세요"); // } // void 인사() { //
 * System.out.println("안녕하세요"); // } //} // 배달앱 만든다. // 배달은 주문을 하면 결제! // 카드 결제할
 * 수있는 승인! 카드결제만 가능하다! class 카드결제{ public void 카드로결제하기(int 금액) {
 * System.out.println("카드로 "+ 금액 +"결제"); } } // 카카오페이가 추가된다. class 카카오결제{ public
 * void 카카오결제하기(int 금액) { System.out.println("카카오결제 "+ 금액 +"결제"); } } // 새 결제
 * 기능은 카카오페이인테, 기존 서비스 주문처리 클래스까지 수정해야된다. class 애플페이결제{ public void 애플페이결제하기(int
 * 금액) { System.out.println("애플페이결제 "+ 금액 +"결제"); } } class 주문처리{ // 결제 진행이 되면
 * 주문 완료! 실제 음식을 만들어서 배달! // 새 결제가 하나 추가될 때마다 주문처리클래스가 늘어난다. 계속 수정해야된다.
 * 
 * public void 주문하기(String 결제방법,int 금액) {
 * 
 * if(결제방법.equals("카드결제")) { 카드결제 카드 = new 카드결제(); 카드.카드로결제하기(금액);
 * 
 * }else if(결제방법.equals("카카오")) { 카카오결제 카카오 = new 카카오결제(); 카카오.카카오결제하기(금액);
 * 
 * }else if(결제방법.equals("애플페이")) { 애플페이결제 애플페이 = new 애플페이결제();
 * 애플페이.애플페이결제하기(금액); }
 * 
 * System.out.println("주문이 완료되었습니다. 배송시간 30분걸립니다."); } }
 * 
 */