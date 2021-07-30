package products.view;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class DefaultFrame extends JFrame{
	
	public void setDefaultOptions() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(new Point(100,100));
		setSize(new Dimension(1000,1000));
		setVisible(true);
	}
}