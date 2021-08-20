package pos.advancedTicket.second;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class At2Label5 extends JLabel{
	
	public At2Label5() {
		
		setBounds(310, 20, 180, 260);
	}
	
	public void setImageSize(String path) {
		ImageIcon icon = new ImageIcon(path);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		this.setIcon(newImc);
	}
}
