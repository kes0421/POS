package pos.admin.first;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class AdBtn1 extends JButton{
	
	public AdBtn1(JFrame mainF) {
		setForeground(Color.white);
		setBackground(Color.black);
		LineBorder lb = new LineBorder(Color.black,5,true);
		setBorder(lb);
		setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 20));
		setBounds(30, 100, 150, 150);
		setImageSize();
		addActionListener(new AdBtn1Act(mainF));
		addMouseListener(new AdBtn1Act(mainF));
	}
	
	private void setImageSize() {
		ImageIcon icon = new ImageIcon("./img/Ad1Page/cash.jpg");
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		this.setIcon(newImc);
	}
}
