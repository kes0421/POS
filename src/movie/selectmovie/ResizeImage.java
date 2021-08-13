package movie.selectmovie;

import java.awt.Image;

import javax.swing.ImageIcon;

public class ResizeImage {
	public ImageIcon resizeImg(String path) {
		ImageIcon pic = new ImageIcon(path);
		Image img = pic.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		ImageIcon image = new ImageIcon(img);
		
		return image;
	}
}
