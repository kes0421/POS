package pos.advancedTickect.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import pos.advancedTicket.second.At2Frame;

public class At1NextBtnAct implements ActionListener{
	JFrame at1Frame;
	JLabel at1L3;
	
	public At1NextBtnAct(JFrame at1Frame, JLabel at1L3) {
		this.at1Frame = at1Frame;
		this.at1L3 = at1L3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(at1L3.getText().length() == 11) {
			new At2Frame();
			at1Frame.setVisible(false);
		}
	}
}
