package pos.advancedTicket.second;

import javax.swing.JFrame;

public class At2Frame extends JFrame{
	
	public At2Frame() {
		super("At2Frame");
		setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new At2Frame(); 
	}
}
