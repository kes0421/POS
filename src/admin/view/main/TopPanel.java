package admin.view.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import admin.model.dao.ProductsInventoryDAO;
import admin.model.dto.ProductsInventory;
import admin.view.MainFrame;

public class TopPanel extends JPanel{
	
	public TopPanel(JFrame frame) {
		setBackground(new Color(160,255,154));
		setBounds(0, 0, 1000, 100);
		setLayout(null);
		
		JLabel img = new MakeImageLabel("./img/admin/포스기아이콘.png",95,100);
		img.setBounds(0, 0, 95, 100);
		add(img);
		
		JLabel textLabel1 = new JLabel("재고 관리 페이지");
		textLabel1.setForeground(Color.GRAY);
		textLabel1.setBounds(900, 0, 95, 23);
		add(textLabel1);
		
		JLabel textLabel2 = new JLabel("상품 목록");
		textLabel2.setForeground(Color.WHITE);
		textLabel2.setFont(new Font("Lucida Grande", Font.BOLD, 32));
		textLabel2.setBounds(105, 15, 140, 60);
		add(textLabel2);
		
		JLabel textLabel3 = new JLabel("상품명으로 검색해주세요");
		textLabel3.setForeground(Color.GRAY);
		textLabel3.setBounds(750, 55, 140, 15);
		add(textLabel3);
		
		JTextField textField = new JTextField();
		textField.setBounds(750, 70, 180, 30);
		textField.setColumns(10);
		add(textField);
		
		JButton btn = new MakeImgBtn("./img/admin/새로고침2.png",70,40);
		btn.setBackground(new Color(160,255,154));
		btn.setBounds(930, 23, 70, 40);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				new MainFrame().setVisible(true);;
			}
			
		});
		add(btn);
		
		JButton btn1 = new JButton("검색");
		btn1.setBounds(930, 68, 70, 30);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<ProductsInventory> piList;
				piList = new ProductsInventoryDAO().productsSearchSelect(textField.getText());
				frame.dispose();
				new MainFrame(piList).setVisible(true);
			}
			
		});
		add(btn1);
	}
}