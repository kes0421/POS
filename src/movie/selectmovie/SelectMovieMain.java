package movie.selectmovie;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import movie.CgvFrame;

public class SelectMovieMain extends CgvFrame {
	public static SelectMovieMain frame;
	public SelectMovieMain() {
		super();	
		
		getContentPane().setLayout(null);
		getContentPane().setBackground(Color.darkGray);
		
		JLabel adver = new JLabel("±¤°í ºÎºÐ");
		adver.setBounds(0, 0, 700, 100);
		adver.setOpaque(true);
		adver.setBackground(Color.white);
		getContentPane().add(adver);				
		
		ArrayList<JPanel> movieInfo = new MakeMoviePanel().moviePanel();
		for(int i=0; i < movieInfo.size(); i++) {
			getContentPane().add(movieInfo.get(i));
		}
			
	}
	
	
	public static void main(String[] args) {
		frame = new SelectMovieMain();
		frame.setDefaultOptions();
	}
}






