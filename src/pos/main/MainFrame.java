package pos.main;

import javax.swing.JFrame;
import java.awt.Color;

public class MainFrame extends JFrame{
	MainPanel p;

	public static void main(String[] args) {
		MainFrame window = new MainFrame();
	}

	public MainFrame() {
		super("MainFrame");
		setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		p = new MainPanel(this);
		getContentPane().add(p);
		setVisible(true);
	}
}

