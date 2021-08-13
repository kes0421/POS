package pos.login;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class LoginFrame extends JFrame{
	JLabel lL1, lL2;
	TextField lT1, lT2;
	JButton lBtn1;
	public LoginFrame() {
		setBounds(0, 0, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		lL1 = new LLabel1();
		lL2 = new LLabel2();
		lT1 = new LText1();
		lT2 = new LText2();
		lBtn1 = new LBtn1(lT1, lT2, this);
		getContentPane().add(lL1);
		getContentPane().add(lL2);
		getContentPane().add(lT1);
		getContentPane().add(lT2);
		getContentPane().add(lBtn1);
		setVisible(true);
	}
}
