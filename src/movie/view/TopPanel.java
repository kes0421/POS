package movie.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel{
	
	public TopPanel() {
		setBackground(new Color(128, 128, 128));
		setBounds(0, 100, 700, 45);
		setLayout(null);
		
		JLabel titleTxt = new JLabel("가장 빨리 볼수 있는 영화 TOP3");
		titleTxt.setFont(new Font("Lao MN", Font.BOLD, 21));
		titleTxt.setBounds(201, 6, 313, 49);
		add(titleTxt);
	}
}
