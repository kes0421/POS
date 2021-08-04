package pos.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainBtn1 extends JButton{
	
	public MainBtn1(JFrame mainP) {
		super("티켓구매");
		setForeground(Color.BLACK);
		setFont(new Font("굴림", Font.BOLD, 30));
		setBounds(10, 471, 192, 180);	
		addActionListener(new MainBtn1Act(getText(), mainP));
	}
}
