package pos.advancedTicket.first;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

import pos.button.RoundedButton;

public class At1NumBtns extends RoundedButton{
	String text;
	
	public At1NumBtns(String text, JLabel at1L3) {
		super(text);
		this.text = text;
		setFont(new Font("±¼¸²", Font.BOLD, 40));
		addActionListener(new At1NumbtnsAct(getText(), at1L3));
	}
}
