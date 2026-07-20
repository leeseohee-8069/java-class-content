import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutTest2 {

	public LayoutTest2() {
		System.out.println("borderLayout!");
		// 화면 배치를 하는데 5개의 영역으로 나눠서 배치!
		// 위, 아래, 왼쪽 , 오른쪽 가운데로 나눠서
		// 배치한다.
		JFrame 윈도우창 = new JFrame();

		윈도우창.setSize(400, 500);
		윈도우창.setLayout(new BorderLayout());
		// 버튼
		JButton 위버튼 = new JButton("위");
		JButton 아래버튼 = new JButton("아래");
		JButton 왼쪽버튼 = new JButton("왼쪽");
		JButton 오른쪽버튼 = new JButton("오른쪽");
		JButton 가운데버튼 = new JButton("가운데");

		윈도우창.add(위버튼, "North");
		윈도우창.add(아래버튼, "South");
		윈도우창.add(왼쪽버튼, "West");
		윈도우창.add(가운데버튼, "Center");
		윈도우창.add(오른쪽버튼, "East");

		윈도우창.setDefaultCloseOperation(3);

		// 보이기
		윈도우창.setVisible(true);

	}

}
