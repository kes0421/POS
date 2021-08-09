package products.view.bottom;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SetImgSize extends JButton{
	
	public void setImageSize(String path, JButton btn) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(btn.getWidth(), btn.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        btn.setIcon(newImc);
    }
}
