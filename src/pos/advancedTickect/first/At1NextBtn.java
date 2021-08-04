package pos.advancedTickect.first;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class At1NextBtn extends JButton{
	
	public At1NextBtn(JFrame at1F, JLabel at1L3) {
		super("Next");
		setFont(new Font("±¼¸²", Font.BOLD, 40));
		setBackground(Color.white);
		addActionListener(new At1NextBtnAct(at1F, at1L3));
	}
}
