import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiTest {
	// 치트키 다른 폴더로 이동한다. public 
	public GuiTest() {
		System.out.println("객체 자동으로 만들기!");
		
		//화면을 만들려면 메인창을 하나 만들어야된다.
		JFrame 윈도우창 = new JFrame();
		
		// 버튼을 윈도우창에 올리기 
		JButton 첫번째버튼 = new JButton("로그인!");
		
		// 화면에 버튼을 추가했다.
		윈도우창.add(첫번째버튼);
		
		// 화면 보이기 
		윈도우창.setVisible(true);
	}
}
/*
자바에서도 프론트화면 처럼 버튼,창,텍스트 입력창
만들수 있게 도와주는 라이브러리(도구) 스윙!

*/