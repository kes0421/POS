package pos.admin.first;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ad1Frame extends JFrame{
	JButton adBtn1;
	JButton adBtn2;
	JLabel label1;
	JLabel label2;
	public Ad1Frame() {
		setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		adBtn1 = new AdBtn1(this);
		getContentPane().add(adBtn1);
		adBtn2 = new AdBtn2(this);
		getContentPane().add(adBtn2);
		label1 = new AdLabel("매출 현황");
		getContentPane().add(label1);
		label2 = new AdLabel("재고 현황");
		getContentPane().add(label2);
		getContentPane().setBackground(Color.white);	
	}
}
