package pos.admin.sales.second;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class S2Frame extends JFrame{
	JPanel s2P1, s2P2, s2P3;
	
	public S2Frame(String date) {
		s2P1 = new S2Panel1(date);
		s2P2 = new S2Panel2();
		s2P3 = new S2Panel3();
		setBounds(0, 0, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		getContentPane().add(s2P1);
		getContentPane().add(s2P2);
		getContentPane().add(s2P3);
	}
}
