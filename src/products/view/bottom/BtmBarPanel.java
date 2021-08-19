package products.view.bottom;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import pos.main.MainFrame;
import products.model.dao.ProductsBasketsDAO;
import products.view.detail.DetailFrame;
import util.DBUtill;

public class BtmBarPanel extends JPanel {

	public JButton basketBtn;
		
	public BtmBarPanel(JFrame frame) {
		// 하단 메뉴바 패널 
		setBackground(new Color(255,254,230));
		setBounds(1, 635, 699, 29);
		setLayout(null);
		setVisible(true);
		SetImgSize btnSize = new SetImgSize();

		// 하단메뉴 패널 구성요소 
		JButton homeBtn = new JButton();
		homeBtn.setBackground(new Color(255,254,230));
		homeBtn.setBounds(0, 0, 40, 30);
		btnSize.setImageSize("./img/mainFrame/홈버튼_블랙.png",homeBtn);
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
		originBtn.setIcon(makeImageIcon("./img/mainFrame/원산지.png"));
		add(originBtn);
		
		originBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new OriF();
			}
		});

		basketBtn = new JButton();
		basketBtn.setBackground(new Color(255,254,230));
		basketBtn.setBounds(593, 0, 45, 30);
		basketNum();
		basketBtn.setIcon(makeImageIcon("./img/mainFrame/장바구니.png"));
		add(basketBtn);
		
		basketBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new DetailFrame(frame);
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
	
	// 장바구니 버튼에 숫자 표시
	public void basketNum(){
		int count = 0;
	
		String sql = "Select pb_quantity from productsbaskets";
			
		try(
			Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();	
		){
		while (rs.next()) {
			count += rs.getInt("pb_quantity");
		}				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 장바구니 위에 숫자 표시
		basketBtn.setBorder(new TitledBorder(new LineBorder(Color.black), "" + count));
	}
}