package pos.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class MainBtn3 extends JButton{
	
	public MainBtn3(JFrame mainF) {
		super("ªÛ«∞");
		setForeground(Color.white);
		setBackground(Color.black);
		setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 30));
		setBounds(480, 471, 192, 180);
		LineBorder lb = new LineBorder(Color.LIGHT_GRAY, 5, true);
		setBorder(lb);
		addActionListener(new MainBtn3Act(getText(), mainF));
	    addMouseListener(new MainBtn3Act(getText(), mainF));
	}
}
