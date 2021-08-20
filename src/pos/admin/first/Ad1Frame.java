package pos.admin.first;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ad1Frame extends JFrame{
	JButton adBtn1;
	JButton adBtn2;
	JButton ad1HBtn;
	JLabel label1;
	JLabel label2;
	
	public Ad1Frame() {
		setBounds(100, 100, 400, 400);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(244,232,232));
		setVisible(true);
		setResizable(false);
		
		adBtn1 = new AdBtn1(this);
		getContentPane().add(adBtn1);
		adBtn2 = new AdBtn2(this);
		getContentPane().add(adBtn2);
		label1 = new AdLabel("매출 현황");
		getContentPane().add(label1);
		label2 = new AdLabel("재고 현황");
		getContentPane().add(label2);
		ad1HBtn = new Ad1HBtn(this);
	    getContentPane().add(ad1HBtn);
		
	}
}
