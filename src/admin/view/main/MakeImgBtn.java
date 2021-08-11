package admin.view.main;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MakeImgBtn extends JButton{
	
	public MakeImgBtn(String path, int width, int height) {
		ImageIcon img = makeImageIcon(path, width, height);
		this.setIcon(img);
	}
	
	private static ImageIcon makeImageIcon(String path,int width, int heigth) {
		BufferedImage image;
		try {
			image = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
		return new ImageIcon(image.getScaledInstance(width, heigth, Image.SCALE_SMOOTH));
	}
}
