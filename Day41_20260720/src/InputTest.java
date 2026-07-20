import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

// 자바에서도 HTML 태그의 input태그들 처럼
// 사용하는 도구들이 있다. 
public class InputTest {

	public InputTest() {
		System.out.println("input 태그들보기!");

		// 창 만들기
		JFrame 윈도우창 = new JFrame();

		// 창 설정
		윈도우창.setSize(400, 500);
		윈도우창.setLayout(new FlowLayout());

		// input type=text 한줄 입력창 만들기
//		JTextField(대략적인 가로크기)
		JTextField 텍스트창 = new JTextField(20);

		// input type=password
		// 비밀번호를 입력할 때 글자를 숨겨주는 input창!
		JPasswordField 패스워드창 = new JPasswordField(20);

		
		// input type=radio
		// 여러개 중에 하나만 선택할 때 사용하는 input창!
		JLabel 안내라벨2 = new JLabel("결제 방법!");
		
		JRadioButton 카드버튼 = new JRadioButton("카드");
		JRadioButton 현금버튼 = new JRadioButton("현금");
		JRadioButton 카카오페이버튼 = new JRadioButton("카카오페이");
		
		//라디오버튼을 이용해서 하나의 그룹으로 묶는다.
		ButtonGroup 결제그룹 = new ButtonGroup();
		결제그룹.add(카드버튼);
		결제그룹.add(현금버튼);
		결제그룹.add(카카오페이버튼);
		
		윈도우창.add(카드버튼);
		윈도우창.add(현금버튼);
		윈도우창.add(카카오페이버튼);

		// 체크박스
		// input type=checkbox
		// 여러 항목을 동시에 선택할 수있다.

		JLabel 안내라벨 = new JLabel("관심 분야를 선택하세요!");
		JCheckBox 자바체크 = new JCheckBox("Java");
		JCheckBox 파이썬체크 = new JCheckBox("Python");
		JCheckBox 리액트체크 = new JCheckBox("React");
		JCheckBox 데이터분석체크 = new JCheckBox("데이터 분석");

		윈도우창.add(안내라벨);
		윈도우창.add(자바체크);
		윈도우창.add(파이썬체크);
		윈도우창.add(리액트체크);
		윈도우창.add(데이터분석체크);

		윈도우창.add(텍스트창);
		윈도우창.add(패스워드창);

		// 엑스버튼시 종료!
		윈도우창.setDefaultCloseOperation(3);

		// 보이기
		윈도우창.setVisible(true);

	}
}
