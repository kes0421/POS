package admin.view.detail;

import javax.swing.JFrame;

public class InsertFrame extends JFrame{
	
	public InsertFrame() {
		setBounds(300, 200, 460, 460);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLayout(null);
		// �ܵ�����ÿ��� ���ְ�, ���ο��� ��ư���� ����ÿ��� ����
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
