package products.view.detail;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Detail_P1 extends JPanel{
	
	public Detail_P1() {
		setBackground(new Color(255,254,230));
		setBounds(0, 0, 600, 67);
		setLayout(null);
		setVisible(true);
		
		JLabel label1 = new JLabel("1) �ֹ� Ȯ��");
		label1.setFont(new Font("�޸յձ�������", Font.BOLD | Font.ITALIC, 16));
		label1.setForeground(new Color(87,149,255));
		label1.setBounds(17, 6, 104, 27);
		add(label1);
		
		JLabel label2 = new JLabel("�ֹ��� Ȯ�����ּ��� ");
		label2.setFont(new Font("�޸յձ�������", Font.PLAIN, 10));
		label2.setForeground(new Color(105, 105, 105));
		label2.setBounds(17, 45, 116, 16);
		add(label2);
	}
}