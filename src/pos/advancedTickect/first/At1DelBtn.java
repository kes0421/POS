package pos.advancedTickect.first;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;

public class At1DelBtn extends JButton{
	JLabel at1L3;
	
	public At1DelBtn(JLabel at1L3) {
		super("DEL");
		setFont(new Font("±¼¸²", Font.BOLD, 40));
		setBackground(Color.white);
		addActionListener(new At1DelBtnAct(at1L3));
	}
}
