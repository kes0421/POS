package admin.view.detail;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel{
	
	JLabel label1;
	
	public TopPanel() {
		setBounds(0, 0, 450, 65);
		setBackground(new Color(160,255,154));
		setLayout(null);
		
		label1 = new JLabel("상품 추가하기");
		label1.setForeground(Color.DARK_GRAY);
		label1.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 23));
		label1.setBounds(10, 5, 160, 50);
		add(label1);
	}
}
