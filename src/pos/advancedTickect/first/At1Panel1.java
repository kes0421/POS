package pos.advancedTickect.first;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class At1Panel1 extends JPanel{
	JPanel at1P2;
	JLabel at1L3, at1L2, at1L1;
	
	public At1Panel1(JFrame at1F) {
		setBounds(12, 10, 600, 600);
		setLayout(null);
		setBackground(Color.white);
		at1L1 = new At1Label1();
		at1L2 = new At1Label2();
		at1L3 = new At1Label3();
		at1P2 = new At1Panel2(at1L3, at1F);
		add(at1L1);
		add(at1L2);
		add(at1L3);
		add(at1P2);
	}
}
