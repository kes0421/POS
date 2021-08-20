package pos.advancedTicket.first;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

import pos.button.RoundedButton;

public class At1DelBtn extends RoundedButton{
	JLabel at1L3;
	
	public At1DelBtn(JLabel at1L3) {
		super("DEL");
		setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 40));
		setBorder(null);
		setBackground(Color.gray);
		setForeground(Color.white);
		addActionListener(new At1DelBtnAct(at1L3));
	}
}
