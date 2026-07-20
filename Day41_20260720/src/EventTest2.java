import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;


class MyMouse extends MouseAdapter{
	// MouseEvent 마우스를 클릭시 정보를 담고 있는 객체다
	// 자바스크립트에서도 이벤트객체를 자동으로 만들어서 준것!
	// 언제 onclick 시점!
	
	
	// 도화지 저장
	JPanel 도화지;
	
	// 색을 번걸아 바꾸기! 
	boolean 빨강 = false; // 자동 초기화되서 false 채워져있다.
	
	// 실행순서 10번 
	// 실행하면서 기존에 만들어진 도화지를 가져온다.
	// MyMouse 안에 저장한다.
	public MyMouse(JPanel 도화지) {
		this.도화지 = 도화지;
		
	}
	
	// 이벤트도 내가 다 만들었으니깐 그거 가져다가 써!
	// 자바에서는 모든 코드들이 class로 이미 틀로! 묶여있다.
	// 필요한것만 만들어서 써라!(new)를 하면 클래스 타입을 보고
	// 그 안에 있는 변수들,혹은 함수들(메서드)을 사용할 수있게
	// 메모리에 로딩(올린다) 
	
	//실행 순서 11
	@Override
	public void mouseClicked(MouseEvent e) {
		
		// 랜덤으로 색상 
		Random 랜덤 = new Random();
		
		// 0~255
		int r = 랜덤.nextInt(256);
		int g = 랜덤.nextInt(256);
		int b = 랜덤.nextInt(256);
		
		// 색상을 랜덤하게 조립해서 사용할 수있다!
		Color 랜덤색 = new Color(r,g,b);
		
		도화지.setBackground(랜덤색);
		
		
		
		// 클릭을 하면 배경색 바꾸기!
//		if(빨강) {
//			도화지.setBackground(Color.ORANGE);
//		}else {
//			도화지.setBackground(Color.red);
//		}
//		
//		빨강 = !빨강;  // ! 빨강이면 오렌지로 바꾸고 오렌지면 빨강으로 바꾸는 
					 // 코드 !true -> false
					 //     !false -> true
					 // 실무에서 토글 로직에 많이 쓰인다.
		
		
//		System.out.println("클릭!");
//		마우스 위치
//		System.out.println("마우스 위치 가로(좌우):" + e.getX());
//		System.out.println("마우스 위치 세로(위아래):" + e.getY());
	}
}


public class EventTest2 {

	// 실행순서 2번째!
	//  생성자 복습!
	public EventTest2() {
		// Mouse Event
		// - 사용자가 마우스를 움직이거나 클릭했을 때
		// 프로그램이 반응하는 기능!
		
		// 3. 창만들기 
		JFrame 윈도우창 = new JFrame();

		// 4. 빈 창에 설정한다. 
		윈도우창.setSize(400, 300);

		
		// 5.도화지 생성한다.
		JPanel 도화지 = new JPanel();
		
		// 6. 도화지 배경 색칠!
		도화지.setBackground(Color.orange);
		
		// 도화지에 이벤트를 추가한다. 
		// 내가 자바에서 제공하는 마우스이벤트 객체 생성했다!
		// 클릭했을때 실행해라~
		// 마우스를 클릭했을 때 도화지를 넘겨줄께! 
		// MyMouse객체한테 넘겨줄께! 그럼 그 안에서 활용해!
		// <p  onclick=함수명()>내용</p>
		// 7. 도화지에 설정 이벤트!
		//   9번까지 실행했다가 프로그램이 대기중!
		//   마우스가 눌릴 때까지 기다린다.
		도화지.addMouseListener(new MyMouse(도화지));
		
		
		// 8.윈도우에 도화지를 붙인다. 
		윈도우창.add(도화지);
		윈도우창.setDefaultCloseOperation(3);

		// 9.보이기
		윈도우창.setVisible(true);
	}
}
