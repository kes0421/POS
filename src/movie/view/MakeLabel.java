package movie.view;

import java.awt.Font;

import javax.swing.JLabel;

public class MakeLabel extends JLabel{
	
	public MakeLabel(String name) {
		setText(name);
		setFont(new Font("Lucida Grande", Font.BOLD, 13));
	}
}
