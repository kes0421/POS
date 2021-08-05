package products.view.ckeckFrame;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ChkImg extends JLabel{
	
	public ChkImg(String path) {
		setIcon(makeImageIcon(path));
	}
	
	private static ImageIcon makeImageIcon(String path) {
		BufferedImage image;
		try {
			image = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
		return new ImageIcon(image.getScaledInstance(165, 160, Image.SCALE_SMOOTH));
	}
}