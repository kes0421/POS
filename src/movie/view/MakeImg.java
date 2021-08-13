package movie.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MakeImg extends JLabel{
	
	public MakeImg(String path, int width, int height) {
		if(path==null) {
			String nullPath = "./img/movie/no.png";
			ImageIcon img = makeImageIcon(nullPath, width, height);
			this.setIcon(img);
		}else {
			ImageIcon img = makeImageIcon(path, width, height);
			this.setIcon(img);
		}
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
