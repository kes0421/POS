package pos.admin.first;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import pos.main.MainFrame;

public class Ad1HBtn extends JButton implements ActionListener{
	JFrame Ad1F;
	
	public Ad1HBtn(JFrame Ad1F) {
		this.Ad1F = Ad1F;
		setBounds(0, 320, 50, 40);
		setBackground(new Color(244,232,232));
		addActionListener(this); 
		setImageSize();
		setBorder(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//new MainFrame();
		Ad1F.dispose();
	}
	
	private void setImageSize() {
		ImageIcon icon = new ImageIcon("./img/At1Page/home_b.png");
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		this.setIcon(newImc);
	}
}
