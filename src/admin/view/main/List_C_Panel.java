package admin.view.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import admin.model.dao.ProductsInventoryDAO;
import admin.model.dto.ProductsInventory;
import admin.view.MainFrame;
import admin.view.detail.UpdateFrame;

public class List_C_Panel extends JPanel{
	
	// width : 품목코드 300 / 상품명 200 / 수량 100 / 금액 200 / 관리 200 
	JLabel label;
	
	public List_C_Panel(String code, String name, int quantity, int price, JFrame frame) {
		LineBorder lineColor = new LineBorder(Color.black);
		setLayout(new BorderLayout());
		setBorder(lineColor);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(null);
		
		JLabel codeLabel = makeLabel(0,0,300,30);
		codeLabel.setText(code);
		
		JLabel nameLabel = makeLabel(300,0,200,30);
		nameLabel.setText(name);
		
		JLabel quanLabel = makeLabel(500,0,100,30);
		quanLabel.setText(quantity+"ea");
		
		JLabel priLabel = makeLabel(600,0,200,30);
		priLabel.setText(price+"원");
		
		JButton updateBtn = new JButton("수정");
		updateBtn.setBounds(800,0,60,30);
		updateBtn.setForeground(Color.BLUE);
		
		updateBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new UpdateFrame(code, name, quantity, price);
			}
		});
		
		JButton delBtn = new JButton("삭제");
		delBtn.setBounds(900,0,100,30);
		delBtn.setForeground(Color.RED);
		
		delBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsInventoryDAO().productInventoryDelete(new ProductsInventory(codeLabel.getText()));
				frame.setVisible(false);
				new MainFrame().setVisible(true);
			}
		});
		
		centerPanel.add(codeLabel);
		centerPanel.add(nameLabel);
		centerPanel.add(quanLabel);
		centerPanel.add(priLabel);
		centerPanel.add(updateBtn);
		
		add(centerPanel,"Center");
		add(delBtn,"East");
	}
	
	private JLabel makeLabel(int x, int y, int width, int height) {
		label = new JLabel();
		label.setBounds(x, y, width, height);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 15));

		return label;
	}
}
