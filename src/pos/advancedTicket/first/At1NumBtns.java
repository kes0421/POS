package pos.advancedTicket.first;

import java.awt.Font;


import javax.swing.JFrame;
import javax.swing.JLabel;

import pos.button.RoundedButton;

public class At1NumBtns extends RoundedButton{
	String text;
	
	public At1NumBtns(String text, JLabel at1L3, JFrame at1F) {
		super(text);
		this.text = text;
		setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 40));
		addActionListener(new At1NumbtnsAct(getText(), at1L3, at1F));
	}
}
