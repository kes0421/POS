package pos.main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainPanel extends JPanel{
	JLabel mainL1, mainL2;
	JButton mainB1, mainB2, mainB3;
	
	public MainPanel(JFrame mainF) {
		mainL1 = new MainLabel1();
		mainL2 = new MainLabel2();
		mainB1 = new MainBtn1(mainF);
		mainB2 = new MainBtn2(mainF);
		mainB3 = new MainBtn3(mainF);
		
		add(mainL1);
		add(mainL2);
		add(mainB1);
		add(mainB2);
		add(mainB3);
		setBounds(0, 0, 684, 661);
		setLayout(null);
	}
}
