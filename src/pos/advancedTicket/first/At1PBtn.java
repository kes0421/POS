package pos.advancedTicket.first;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import pos.main.MainFrame;

public class At1PBtn extends JButton implements ActionListener{
	JFrame At1F;
	
	public At1PBtn(JFrame At1F) {
		super();
		this.At1F = At1F;
		setBounds(0,600,91,63);
		setBackground(Color.black);
		setImageSize();
		setBorder(null);
		addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new MainFrame();
		At1F.dispose();
	}
	
	private void setImageSize() {
		ImageIcon icon = new ImageIcon("./img/At1Page/p_w.png");
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		this.setIcon(newImc);
	}
}
