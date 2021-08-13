package pos.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class MainBtn1 extends JButton{
	
	public MainBtn1(JFrame mainP) {
		super("¿µÈ­¿¹¸Å");
		setForeground(Color.white);
		setBackground(Color.black);
		setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 30));
		setBounds(10, 471, 192, 180);
		LineBorder lb = new LineBorder(Color.LIGHT_GRAY, 5, true);
		setBorder(lb);
		addActionListener(new MainBtn1Act(getText(), mainP));
	}
}
