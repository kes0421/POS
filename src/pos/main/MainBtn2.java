package pos.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import pos.advancedTickect.first.At1Frame;

public class MainBtn2 extends JButton{	
	public MainBtn2(JFrame mainF) {
		super("����Ƽ�����");
		setForeground(Color.BLACK);
		setFont(new Font("����", Font.BOLD, 25));
		setBounds(253, 471, 192, 180);
		addActionListener(new MainBtn2Act(getText(), mainF));
	}
}
