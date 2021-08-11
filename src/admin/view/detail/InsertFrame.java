package admin.view.detail;

import javax.swing.JFrame;

public class InsertFrame extends JFrame{
	
	public InsertFrame() {
		setBounds(300, 200, 460, 460);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLayout(null);
		// 단독실행시에는 꺼주고, 메인에서 버튼으로 실행시에는 켜준
		setVisible(true);
		
		TopPanel topP = new TopPanel();
		add(topP);
		
		InsertPanel mainP = new InsertPanel(this);
		add(mainP);
		
	}
	
	public static void main(String[] args) {
		InsertFrame main = new InsertFrame();
//		main.setVisible(true);
	}
}
