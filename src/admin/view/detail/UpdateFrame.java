package admin.view.detail;

import javax.swing.JFrame;

public class UpdateFrame extends JFrame{

	public UpdateFrame(String code, String name, int quantity, int price) {
		setBounds(300, 200, 460, 460);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLayout(null);
		// �ܵ�����ÿ��� ���ְ�, ���ο��� ��ư���� ����ÿ��� ����
		setVisible(true);
		
		TopPanel topP = new TopPanel();
		topP.label1.setText("��ǰ �����ϱ�");
		add(topP);
		
		UpdatePanel updateP = new UpdatePanel(this, code, name, quantity, price);
		add(updateP);
		
	}
	
}
