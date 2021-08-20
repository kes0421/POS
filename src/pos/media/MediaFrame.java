package pos.media;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import pos.main.MainFrame;

public class MediaFrame extends JFrame implements MouseListener{
	JLabel mediaL;
	JPanel mediaP;
		
	public MediaFrame() {
		setLayout(null);
		mediaL = new JLabel();
		mediaL.setBounds(40, 0, 700, 650);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		mediaP = (JPanel)getContentPane();
		mediaP.setLayout(null);
		mediaP.setBackground(Color.black);
		setBounds(0, 0, 700, 700);
		ImageIcon i = new ImageIcon("./img/media/video.gif");
		mediaL.setIcon(i);
		mediaL.addMouseListener(this);
		add(mediaL);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MediaFrame();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		this.dispose();
		new MainFrame();
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
