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
import javax.swing.JPanel;

import products.view.detail.DetailFrame;

public class BtmBarPanel extends JPanel {

	public BtmBarPanel() {
		// 하단 메뉴바 패널 
		setBackground(Color.lightGray);
		setBounds(1, 635, 699, 29);
		setLayout(null);
		setVisible(true);
		
		SetImgSize btnSize = new SetImgSize();

		// 하단메뉴 패널 구성요소 
		JButton homeBtn = new JButton();
		homeBtn.setBackground(Color.LIGHT_GRAY);
		homeBtn.setBounds(0, 0, 40, 30);
		btnSize.setImageSize("./img/mainFrame/홈버튼_블랙.png",homeBtn);
		add(homeBtn);

		JButton originBtn = new JButton();
		originBtn.setBackground(Color.LIGHT_GRAY);
		originBtn.setBounds(643, 0, 40, 30);
		originBtn.setIcon(makeImageIcon("./img/mainFrame/원산지.png"));
		add(originBtn);
		
		originBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new OriF();
			}
		});

		JButton basketBtn = new JButton();
		basketBtn.setBackground(Color.LIGHT_GRAY);
		basketBtn.setBounds(593, 0, 45, 30);
		basketBtn.setIcon(makeImageIcon("./img/mainFrame/장바구니.png"));
		add(basketBtn);
		
		basketBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DetailFrame();
			}
		});
	}

	// 이미지 주소 매개변수로 입력받으면 image 로 리턴 
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