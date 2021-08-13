package pos.advancedTicket.second;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class At2Label6 extends JLabel{
	private static String[] image_list = {"./img/mainPage/mainPage1.png", "./img/mainPage/mainPage2.png", "./img/mainPage/mainPage3.png"};
	private int x = 0;
	private Timer tm;
	
	public At2Label6() {
		setBounds(0, 0, 684, 250);
		setImage();
	}
	
	private void setImage() {
		setImageSize(image_list.length - 1);
		tm = new Timer(5000, new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				setImageSize(x);
				x += 1;
				if(x >= image_list.length) {
					x = 0;
				}
			}
		});
		tm.start();
	}
	
	private void setImageSize(int i) {
		ImageIcon icon = new ImageIcon(image_list[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		this.setIcon(newImc);
	}
}
