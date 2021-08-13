package pos.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import products.view.MainFrame;


public class MainBtn3Act implements ActionListener{
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
}
