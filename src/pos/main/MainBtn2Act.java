package pos.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import pos.advancedTickect.first.At1Frame;

public class MainBtn2Act implements ActionListener{
	String text;
	JFrame mainF;
	
	public MainBtn2Act(String text, JFrame mainF) {	
		this.text = text;
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(text.equals("예매티켓출력")) {
			new At1Frame();
			mainF.setVisible(false);
		}
	}
}
