import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class MenuTest {

	public MenuTest() {
		// 메뉴는 프로그램 위쪽에 있는 목록
		// 창 만들기
		JFrame 윈도우창 = new JFrame();

		// 창 설정
		윈도우창.setSize(400, 500);
		
		// 메뉴바 만들기 
		//  메뉴들이 올라갈 공간을 만들어준다. 
		JMenuBar 메뉴바 = new JMenuBar();
		
		// 메뉴바 안에 추가될 항목!만들기
		JMenu 파일메뉴 = new JMenu("파일(F)");
		JMenu 편집메뉴 = new JMenu("편집(E)");
		JMenu 서식메뉴 = new JMenu("서식(O)");
		
		// 파일메뉴 밑에 들어가는 서브 메뉴!
		JMenuItem 새로만들기 = new JMenuItem("새로 만들기");
		JMenuItem 새창 = new JMenuItem("새창");
		JMenuItem 열기 = new JMenuItem("열기");
		
		파일메뉴.add(새로만들기);
		파일메뉴.add(새창);
		파일메뉴.add(열기);		
		
		// 편집메뉴 아래 들어가는 서브메뉴!
		JMenuItem 잘라내기 = new JMenuItem("잘라내기");
		JMenuItem 복사 = new JMenuItem("복사");
		
		편집메뉴.add(잘라내기);
		편집메뉴.addSeparator(); // 구분선!
		편집메뉴.add(복사);
		
		
		// 메뉴바에 추가한다. 
		메뉴바.add(파일메뉴);
		메뉴바.add(편집메뉴);
		메뉴바.add(서식메뉴);
		
		// 화면에 메뉴바 붙이기
		윈도우창.setJMenuBar(메뉴바);
		
		// 여러줄을 작성하는 (입력)
		// JTextArea(세로 몇줄,가로 몇칸)입력!
		JTextArea 여러줄입력 = new JTextArea();
		
		// 윈도우창에 추가
		윈도우창.add(여러줄입력);
		
		// 엑스버튼시 종료!
		윈도우창.setDefaultCloseOperation(3);

		// 보이기
		윈도우창.setVisible(true);
	}
}
