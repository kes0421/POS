package pos.main;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	JLabel mainL1, mainL2, mainL3;
	JButton mainB1, mainB2, mainB3;
	
	public MainPanel(JFrame mainF) {
		mainL1 = new MainLabel1(mainF);
		mainL2 = new MainLabel2();
		mainL3 = new MainLabel3();
		mainB1 = new MainBtn1(mainF);
		mainB2 = new MainBtn2(mainF);
		mainB3 = new MainBtn3(mainF);
		setBackground(Color.black);
		add(mainL1);
		add(mainL2);
		add(mainL3);
		add(mainB1);
		add(mainB2);
		add(mainB3);
		setBounds(0, 0, 684, 661);
		setLayout(null);
	}
}
