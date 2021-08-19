package pos.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import pos.advancedTicket.first.At1Frame;

public class MainBtn2Act implements ActionListener, MouseListener{
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
			mainF.dispose();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.gray);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton btn = (JButton)e.getSource();
		btn.setBackground(Color.black);
	}
}
