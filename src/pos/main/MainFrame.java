package pos.main;

import javax.swing.JFrame;
import java.awt.Color;

public class MainFrame extends JFrame{
	MainPanel p;

	public MainFrame() {
		super("MainFrame");
		setBounds(0, 0, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setBackground(Color.WHITE);
		setResizable(false);
		
		p = new MainPanel(this);
		getContentPane().add(p);
		setVisible(true);
	}
}

