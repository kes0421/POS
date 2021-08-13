package pos.advancedTicket.second;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class At2Panel1 extends JPanel{
	JLabel at2L1, at2L2, at2L3, at2L4, at2L5;
	JButton at2Btn1;
	
	public At2Panel1(JFrame at2F) {
		setBounds(90, 250, 504, 442);
		setBackground(Color.gray);
		setLayout(null);
		at2L1 = new At2Label1();
		at2L2 = new At2Label2();
		at2L3 = new At2Label3();
		at2L4 = new At2Label4();
		at2L5 = new At2Label5();
		at2Btn1 = new At2Btn1(at2F);
		add(at2L1);
		add(at2L2);
		add(at2L3);
		add(at2L4);
		add(at2L5);
		add(at2Btn1);
		at2Btn1 = new At2Btn1(at2F);
	}
}
