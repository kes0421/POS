package pos.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import pos.advancedTicket.first.At1Frame;

public class MainBtn2Act implements ActionListener{
	String text;
	JFrame mainF;
	
	public MainBtn2Act(String text, JFrame mainF) {	
		this.text = text;
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(text.equals("����Ƽ�����")) {
			new At1Frame();
			mainF.dispose();
		}
	}
}