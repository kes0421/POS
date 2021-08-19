package products.view.pay;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class At3Label3 extends JLabel{
	
	public At3Label3() {
		setBounds(200, 300, 300, 320);
		setImageSize();
	}
	
	private void setImageSize() {
		ImageIcon icon = new ImageIcon("./image/At3Page/print.png");
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		this.setIcon(newImc);
	}
}
