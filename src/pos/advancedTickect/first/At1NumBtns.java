package pos.advancedTickect.first;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class At1NumBtns extends JButton{
	String text;
	
	public At1NumBtns(String text, JLabel at1L3) {
		super(text);
		this.text = text;
		setFont(new Font("±¼¸²", Font.BOLD, 40));
		setBackground(Color.white);
		addActionListener(new At1NumbtnsAct(getText(), at1L3));
	}
}
