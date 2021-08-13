package movie.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BtmbarPanel extends JPanel{
	
	public BtmbarPanel() {
		setBackground(new Color(128, 128, 128));
		setBounds(0, 620, 700, 52);
		setLayout(null);
		
		
		JButton goBackBtn = new JButton("<-");
		goBackBtn.setFont(new Font("Monaco", Font.BOLD, 13));
		goBackBtn.setBounds(6, 6, 65, 40);
		add(goBackBtn);
		
		JButton homeBtn = new JButton("Home");
		homeBtn.setBounds(598, 6, 96, 40);
//		homeBtn.setIcon(homebtn("./image/HomeButtonlmage2.jpg"));
		add(homeBtn);
	}
	
	private static ImageIcon homebtn(String path) {
		BufferedImage image;
		try {
			image = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}
		
		return new ImageIcon(image.getScaledInstance(96,40, Image.SCALE_SMOOTH));
	}
}
