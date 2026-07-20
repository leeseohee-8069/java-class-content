import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiTest3 {

	public GuiTest3() {
		System.out.println("test3 실행해!");
		
		// 창 만들기
		JFrame 화면 = new JFrame();
		
		// 화면 설정
		화면.setSize(400,300);
		
		//내용 추가
		JLabel 아이디라벨 = new JLabel("아이디:");
		
		// 버튼 
		JButton 확인버튼 = new JButton("확인!");
		
		// 실무에서는 add를 이용해서 여러개의 도구들을 하나의 창에
		// 붙인다. 
		// add()  아이디라벨 윈도우창에 올라갔으면 그 위로
		// 버튼이 또 올라간다 그래서 덮어졌다!
		// 위로 쌓아놓는것 밖에는 못한다. 
		// 그래서 우리가 자리 배치하듯이 도구들을 윈도우창에서
		// 예쁘게 배치한다.
		화면.add(아이디라벨);
		화면.add(확인버튼);
		
		// 보이기
		화면.setVisible(true);
		
	}
}
