package pos.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainBtn3 extends JButton{
	
	public MainBtn3(JFrame mainP) {
		super("��ǰ����");
		setForeground(Color.BLACK);
		setFont(new Font("����", Font.BOLD, 30));
		setBounds(480, 471, 192, 180);
		addActionListener(new MainBtn3Act(getText(), mainP));
	}
}
