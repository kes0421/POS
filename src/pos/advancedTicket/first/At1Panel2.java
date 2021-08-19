package pos.advancedTicket.first;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class At1Panel2 extends JPanel{
	ArrayList<JButton> numBtnsList = new ArrayList<>();
	JButton del, next;
	
	public At1Panel2(JLabel at1L3, JFrame at1F) {
		setBounds(200, 250, 300, 314);
		setLayout(new GridLayout(0, 3, 0, 0));
		setBackground(Color.black);
		for(int i = 0; i < 9; ++i) {
			numBtnsList.add(new At1NumBtns("" + (i + 1), at1L3, at1F));
			add(numBtnsList.get(i));
		}
		del = new At1DelBtn(at1L3);
		next = new At1NextBtn(at1F, at1L3);
		setBorder(null);
		add(del);
		add(new At1NumBtns("" + 0, at1L3, at1F));
		add(next);
	}
}
