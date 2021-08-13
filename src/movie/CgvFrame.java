package movie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class CgvFrame extends JFrame {
	
	public void setDefaultOptions() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(new Point(100, 100));
		setSize(new Dimension(700, 700));
		setVisible(true);
	}
}
