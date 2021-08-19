package pos.main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import products.view.MainFrame;


public class MainBtn3Act implements ActionListener, MouseListener{
	String text;
	JFrame mainF;
	
	public MainBtn3Act(String text, JFrame mainF) {	
		this.text = text;
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		mainF.dispose();
		new MainFrame().setVisible(true);
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
