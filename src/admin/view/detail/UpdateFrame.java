package admin.view.detail;

import javax.swing.JFrame;

public class UpdateFrame extends JFrame{

	public UpdateFrame(String code, String name, int quantity, int price) {
		setBounds(300, 200, 460, 460);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLayout(null);
		// 단독실행시에는 꺼주고, 메인에서 버튼으로 실행시에는 켜준
		setVisible(true);
		
		TopPanel topP = new TopPanel();
		topP.label1.setText("상품 수정하기");
		add(topP);
		
		UpdatePanel updateP = new UpdatePanel(this, code, name, quantity, price);
		add(updateP);
		
	}
	
}
