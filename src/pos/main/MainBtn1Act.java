package pos.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import movie.view.MovieFrame1;
import pos.advancedTicket.first.At1Frame;

public class MainBtn1Act implements ActionListener, MouseListener{
	String text;
	JFrame mainF;
	
	public MainBtn1Act(String text, JFrame mainF) {	
		this.text = text;
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		MovieFrame1.movieFrame = new MovieFrame1();
        MovieFrame1.movieFrame.setVisible(true);
		mainF.dispose();
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
		JButton b = (JButton)e.getSource();
        b.setBackground(Color.gray);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton)e.getSource();
        b.setBackground(Color.black);
	}
}
