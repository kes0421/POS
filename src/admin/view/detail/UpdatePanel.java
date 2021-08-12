package admin.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import admin.model.dao.ProductsInventoryDAO;
import admin.model.dto.ProductsInventory;

public class UpdatePanel extends JPanel{
	JLabel label;
	JTextField txt;
	
	JTextField code;
	JTextField name;
	JTextField quantity;
	JTextField price;
	
	public UpdatePanel(JFrame frame, String piCode, String piName, int piQuantity, int piPrice) {
		setBounds(0, 65, 450, 359);
		setBackground(new Color(160,255,154));
		setLayout(null);
		
		NumCheck numCheck;
		
		JLabel label1 = makeLabel("품목코드 :",35);
		code = makeTxtField(40);
		code.setText(piCode);
		code.setEnabled(false);
		
		JLabel label2 = makeLabel("상품명 :",110);
		name = makeTxtField(115);
		name.setText(piName);
		
		JLabel label3 = makeLabel("수량(ea) :",185);
		quantity = makeTxtField(190);
		
		numCheck = new NumCheck();
		quantity.addKeyListener(numCheck);
		add(numCheck.msg);
		numCheck.msg.setBounds(110, 220, 285, 30);
		
		quantity.setText(piQuantity+"");
		
		JLabel label4 = makeLabel("금액(ea) :",260);
		price = makeTxtField(265);
		
		numCheck = new NumCheck();
		price.addKeyListener(numCheck);
		add(numCheck.msg);
		numCheck.msg.setBounds(110, 290, 285, 30);
		
		price.setText(piPrice+"");
		
		add(label1);
		add(code);
		add(label2);
		add(name);
		add(label3);
		add(quantity);
		add(label4);
		add(price);
		
		JButton btn1 = new JButton("확인");
		btn1.setForeground(Color.BLUE);
		btn1.setBounds(365, 310, 60, 30);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int qua = Integer.parseInt(quantity.getText());
				int pri = Integer.parseInt(price.getText());
				
				new ProductsInventoryDAO().productsInvetoryUpdate(new ProductsInventory(
						name.getText(),
						qua,
						pri,
						code.getText()
						));
				frame.dispose();
			}
		});
		
		add(btn1);
		
		JButton btn2 = new JButton("취소");
		btn2.setForeground(Color.RED);
		btn2.setBounds(300, 310, 60, 30);
		
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
			
		});
		
		add(btn2);
	}
	
	private JLabel makeLabel(String name,int y) {
		label = new JLabel(name);
		label.setBounds(5, y, 90, 35);
		label.setFont(new Font("Menlo", Font.BOLD, 17));
		
		return label;
	}
	
	private JTextField makeTxtField(int y) {
		txt = new JTextField();
		txt.setBounds(110, y, 285, 30);
		txt.setColumns(10);
		
		return txt;
	}
}
