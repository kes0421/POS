package pos.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class MainBtn1 extends JButton{
	
	public MainBtn1(JFrame mainF) {
		super("영화예매");
		setForeground(Color.white);
		setBackground(Color.black);
		setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30));
		setBounds(10, 471, 192, 180);
		LineBorder lb = new LineBorder(Color.LIGHT_GRAY, 5, true);
		setBorder(lb);
		addActionListener(new MainBtn1Act(getText(), mainF));
		addMouseListener(new MainBtn1Act(getText(), mainF));
	}
}