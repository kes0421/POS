package products.view.bottom;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import pos.main.MainFrame;
import products.view.detail.DetailFrame;

public class BtmBarPanel extends JPanel {

	public BtmBarPanel(JFrame frame) {
		// �ϴ� �޴��� �г� 
		setBackground(new Color(255,254,230));
		setBounds(1, 635, 699, 29);
		setLayout(null);
		setVisible(true);
		
		SetImgSize btnSize = new SetImgSize();

		// �ϴܸ޴� �г� ������� 
		JButton homeBtn = new JButton();
		homeBtn.setBackground(new Color(255,254,230));
		homeBtn.setBounds(0, 0, 40, 30);
		btnSize.setImageSize("./img/mainFrame/Ȩ��ư_��.png",homeBtn);
		add(homeBtn);
		
		homeBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MainFrame().setVisible(true);
				frame.dispose();
			}
		});

		JButton originBtn = new JButton();
		originBtn.setBackground(new Color(255,254,230));
		originBtn.setBounds(643, 0, 40, 30);
		originBtn.setIcon(makeImageIcon("./img/mainFrame/������.png"));
		add(originBtn);
		
		originBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new OriF();
			}
		});

		JButton basketBtn = new JButton();
		basketBtn.setBackground(new Color(255,254,230));
		basketBtn.setBounds(593, 0, 45, 30);
		basketBtn.setIcon(makeImageIcon("./img/mainFrame/��ٱ���.png"));
		add(basketBtn);
		
		basketBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DetailFrame();
			}
		});
	}

	// �̹��� �ּ� �Ű������� �Է¹����� image �� ���� 
	public static ImageIcon makeImageIcon(String path) {
		BufferedImage image;
		try {
			image = ImageIO.read(new File(path));
		} catch (IOException e) {
			e.printStackTrace();
			image = null;
		}

		return new ImageIcon(image.getScaledInstance(45, 30, Image.SCALE_SMOOTH));
	}
	
}