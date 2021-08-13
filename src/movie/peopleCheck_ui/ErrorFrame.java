package movie.peopleCheck_ui;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class ErrorFrame extends JFrame{
	public void setDefaultOptions() {
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setLocation(new Point(200, 200));
		setSize(new Dimension(500, 300));
		setVisible(true);
	}

}
