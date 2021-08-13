package movie.peopleCheck_ui;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Disable_btn extends JButton {
	
	List<JButton> btns;
	int cnt;
	
	public Disable_btn(List<JButton> btns, int cnt) {
		this.btns = btns;
		this.cnt = cnt;
		setText("" + cnt);
		setFont(new Font("µ¸¿ò", Font.BOLD, 20));
		setForeground(Color.white);
		setBackground(new Color(0x404040));
		setBorder(BorderFactory.createLineBorder(new Color(0x404040)));
		addActionListener(new Disable_btn_action(this));
		
	}

}
