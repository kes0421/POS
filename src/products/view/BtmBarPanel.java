package products.view;

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
		// �ϴ� �޴��� �г� 
		setBackground(Color.LIGHT_GRAY);
		setBounds(1, 635, 699, 29);
		setLayout(null);
		setVisible(true);

		// �ϴܸ޴� �г� ������� 
		makeImageIcon("./img/mainFrame/Ȩ��ư.png");

		JButton homeBtn = new JButton("Home");
		homeBtn.setBackground(Color.LIGHT_GRAY);
		homeBtn.setBounds(0, 0, 40, 30);
		homeBtn.setIcon(makeImageIcon("./img/mainFrame/Ȩ��ư.png"));
		add(homeBtn);

		JButton originBtn = new JButton("������");
		originBtn.setBackground(Color.LIGHT_GRAY);
		originBtn.setBounds(643, 0, 40, 30);
		originBtn.setIcon(makeImageIcon("./img/mainFrame/������.png"));
		add(originBtn);
		
		originBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new OriF();
			}
		});

		JButton jangbaguniBtn = new JButton("��ٱ���");
		jangbaguniBtn.setBackground(Color.LIGHT_GRAY);
		jangbaguniBtn.setBounds(593, 0, 40, 30);
		jangbaguniBtn.setIcon(makeImageIcon("./img/mainFrame/��ٱ���.png"));
		add(jangbaguniBtn);
		
		jangbaguniBtn.addActionListener(new ActionListener() {
			
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

		return new ImageIcon(image.getScaledInstance(46, 30, Image.SCALE_SMOOTH));
	}
}