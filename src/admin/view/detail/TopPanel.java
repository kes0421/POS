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
		
		label1 = new JLabel("��ǰ �߰��ϱ�");
		label1.setForeground(Color.DARK_GRAY);
		label1.setFont(new Font("�޸յձ�������", Font.PLAIN, 23));
		label1.setBounds(10, 5, 160, 50);
		add(label1);
	}
}
