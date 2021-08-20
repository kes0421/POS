package pos.advancedTicket.second;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class At2Frame extends JFrame{
	JPanel at2P1, at2P2;
	JLabel at2L6;
	
	public At2Frame(String rNum) {
		super("At2Frame");
		at2L6 = new At2Label6();
		setBounds(0, 0, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.black);
		setResizable(false);
		
		at2P1 = new At2Panel1(this, rNum);
		at2P2 = new At2Panel2(this);
		
		getContentPane().add(at2P1);
		getContentPane().add(at2P2);
		getContentPane().add(at2L6);
		setVisible(true);
	}
}
