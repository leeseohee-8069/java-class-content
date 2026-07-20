import javax.swing.JFrame;
import javax.swing.JLabel;

// 자바를 이용해서 화면을 만들고 보이기!
public class GuiTest2 {
	
	// main이 GuiTest2 실행해!
	// 자동으로 실행될 수있게! 생성자를 부른다!
	public GuiTest2() {
		System.out.println("새로운 화면만들기!");
		
		//윈도우창 (화면)
		// JFrame 이라는 도구가 크고 빈 화면을 하나
		// 만들어준다. 
		// 빈 창 하나 만들어줘!
		// 크기도 없고 화면에 보이지 않고! 
		// 하나씩 설정한다.(setting)
		JFrame 화면 = new JFrame();
		
		// 화면 크기 설정 
		//  가로 400, 세로 300인 화면이 켜진다.
		화면.setSize(400,300);
		
		// 글자나 이미지를 화면에 보여주는 도구!
		// 그냥 정보를 보여주는 용도(환영합니다. 이름,안내문구)
		
		// p태그랑 비슷한 내용! 설명 
		JLabel 안내라벨 = new JLabel("환영합니다!");
		
		화면.add(안내라벨);
		
		// 보이기
		화면.setVisible(true);
		
		// 자바가 미리 만들어놓은 화면을 구성하는 설정
		// size (크기)
		// Visible(보이기)
		//  true 화면 보이기 , false 화면 숨기기!
		
		// 창만들기 -> 설정하기 -> 내용 넣기-> 보여주기!
		
	}
}
