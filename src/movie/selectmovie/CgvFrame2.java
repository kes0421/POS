package movie.selectmovie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class CgvFrame2 extends JFrame {
	
	public void setDefaultOptions() {
		getContentPane().setBackground(Color.darkGray);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(new Point(500, 100));
		setSize(new Dimension(700, 700));
		setVisible(true);
	}

}
