package products.view.detail;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Detail_P3 extends JPanel{
	
	public Detail_P3() {
		setBounds(0, 448, 600, 124);
		setLayout(null);
		setVisible(true);
		
		JLabel label1 = new JLabel("�� �����ݾ�");
		label1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label1.setForeground(new Color(0, 0, 205));
		label1.setBounds(20, 6, 153, 44);
		add(label1);

		JLabel label2 = new JLabel("9000��");
		label2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label2.setForeground(new Color(0, 0, 205));
		label2.setBounds(406, 6, 142, 44);
		add(label2);

		JButton btn1 = new JButton("�� ��");
		btn1.setForeground(new Color(255, 0, 0));
		btn1.setBounds(135, 62, 117, 56);
		add(btn1);

		JButton btn2 = new JButton("�� ��");
		btn2.setForeground(new Color(0, 0, 255));
		btn2.setBounds(325, 62, 117, 56);
		add(btn2);
	}
}