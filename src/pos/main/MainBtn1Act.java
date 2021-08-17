package pos.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import movie.view.MovieFrame1;

public class MainBtn1Act implements ActionListener{
	String text;
	JFrame mainF;
	
	public MainBtn1Act(String text, JFrame mainF) {	
		this.text = text;
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new MovieFrame1().setVisible(true);
		mainF.dispose();
	}
}
