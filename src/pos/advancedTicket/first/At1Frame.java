package pos.advancedTicket.first;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.JButton;

public class At1Frame extends JFrame{
	At1Panel1 at1F1;
	JButton at1Btn1, at1Btn2;
	
	public At1Frame() {
		super("At1Frame");
		setBounds(0, 0, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		at1F1 = new At1Panel1(this);
		getContentPane().add(at1F1);
		getContentPane().setBackground(Color.black);
		setVisible(true);
	}
}
