package pos.advancedTickect.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class At1DelBtnAct implements ActionListener{
	JLabel at1L3;
	
	public At1DelBtnAct(JLabel at1L3) {
		this.at1L3 = at1L3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		at1L3.setText(at1L3.getText().substring(0, at1L3.getText().length() -1));
	}
}
