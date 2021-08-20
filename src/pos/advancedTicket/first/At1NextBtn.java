package pos.advancedTicket.first;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import pos.button.RoundedButton;

public class At1NextBtn extends RoundedButton{
	
	public At1NextBtn(JFrame at1F, JLabel at1L3) {
		super("Next");
		setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 40));
		setBorder(null);
		setBackground(Color.gray);
		setForeground(Color.white);
		addActionListener(new At1NextBtnAct(at1F, at1L3));
	}
}
