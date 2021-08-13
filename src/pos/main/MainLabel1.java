package pos.main;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

import pos.login.LoginFrame;

public class MainLabel1 extends JLabel implements MouseListener{
	private static String[] image_list = {"./img/mainPage/mainPage1.png", "./img/mainPage/mainPage2.png", "./img/mainPage/mainPage3.png"};
	private int x = 0;
	private Timer tm;
	JFrame mF;
	
	public MainLabel1(JFrame mF) {
		this.mF = mF;
		setBounds(0, 0, 684, 250);
		setImage();
		addMouseListener(this);
	}
	
	private void setImage() {
		setImageSize(image_list.length - 1);
		tm = new Timer(5000, new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				setImageSize(x);
				x += 1;
				if(x >= image_list.length) {
					x = 0;
				}
			}
		});
		tm.start();
	}
	
	private void setImageSize(int i) {
		ImageIcon icon = new ImageIcon(image_list[i]);
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
		ImageIcon newImc = new ImageIcon(newImg);
		this.setIcon(newImc);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		new LoginFrame();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
