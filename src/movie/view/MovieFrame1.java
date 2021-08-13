package movie.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import movie.selectmovie.SelectMovieMain;

public class MovieFrame1 extends JFrame{
	
	public MovieFrame1() {	
		setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel adPanel = new JPanel();
		adPanel.setBounds(0, 0, 700, 100);
		getContentPane().add(adPanel);

		TopPanel titlePanel = new TopPanel();
		getContentPane().add(titlePanel);

		MidPanel midPanel = new MidPanel();
		getContentPane().add(midPanel);

		BtmPanel btmPanel = new BtmPanel();
		getContentPane().add(btmPanel);

		BtmbarPanel btmBarPanel = new BtmbarPanel();
		getContentPane().add(btmBarPanel);

		BtmPanel.btmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				SelectMovieMain.frame = new SelectMovieMain();
				SelectMovieMain.frame.setDefaultOptions();
			}
			
		});
	}

	public static void main(String[] args) {
		MovieFrame1 abc = new MovieFrame1();
		abc.setVisible(true);
	}
}
