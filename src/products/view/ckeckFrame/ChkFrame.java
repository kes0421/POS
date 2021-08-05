package products.view.ckeckFrame;

import javax.swing.JFrame;
import javax.swing.JLabel;

import products.model.dao.ProductsBasketsDAO;
import products.model.dto.ProductsBasket;
import products.view.detail.Detail_P2_C;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChkFrame extends JFrame{

	public ArrayList<ProductsBasket> basketList = new ArrayList<>();;
	
	public ChkFrame() {}
	
	public ChkFrame(String img_path, String name, int price) {
		setBounds(100, 100, 500, 200);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);

		ChkImg img = new ChkImg(img_path);
		img.setBounds(6, 6, 165, 160);
		getContentPane().add(img);
		
		JLabel titleTxT = new JLabel("장바구니에 담으시겠습니까?");
		titleTxT.setForeground(Color.GRAY);
		titleTxT.setBounds(289, 6, 205, 16);
		getContentPane().add(titleTxT);	
		
		JLabel p_name = new JLabel(name);
		p_name.setBounds(200, 6, 77, 16);
		getContentPane().add(p_name);

		JLabel quantity = new JLabel("수 량");
		quantity.setBounds(260, 54, 61, 16);
		getContentPane().add(quantity);

		JLabel label1 = new JLabel("금 액");
		label1.setBounds(260, 97, 61, 16);
		getContentPane().add(label1);

		JLabel label4 = new JLabel("개");
		label4.setBounds(414, 54, 19, 16);
		getContentPane().add(label4);

		JLabel label5 = new JLabel("원");
		label5.setBounds(414, 97, 20, 16);
		getContentPane().add(label5);
		
		JLabel quan_count = new JLabel("1");
		quan_count.setBounds(355, 54, 19, 16);
		getContentPane().add(quan_count);
		
		JLabel p_price = new JLabel(price + "");
		p_price.setBounds(325, 97, 61, 16);
		getContentPane().add(p_price);
		
		JButton plusBtn = new JButton("+");
		plusBtn.setForeground(Color.BLUE);
		plusBtn.setBackground(Color.WHITE);
		plusBtn.setBounds(290, 49, 42, 29);
		plusBtn.addActionListener(new ActionListener() {
			
			int pri = Integer.parseInt(p_price.getText());
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int quantity = Integer.parseInt(quan_count.getText());
				int resultPri = 0;
				quantity++;
				resultPri = pri * quantity;
				quan_count.setText(quantity + "");
				p_price.setText(resultPri+"");
			}
			
		});
		getContentPane().add(plusBtn);
		
		JButton minusBtn = new JButton("-");
		minusBtn.setForeground(Color.RED);
		minusBtn.setBounds(373, 49, 42, 29);
		minusBtn.addActionListener(new ActionListener() {
			
			
			int pri = Integer.parseInt(p_price.getText());
		
			@Override
			public void actionPerformed(ActionEvent e) {
				int resultPri = 0;
				
				int quantity = Integer.parseInt(quan_count.getText());
				
				if (quantity > 0) {
					quantity--;
				} 
				resultPri = pri * quantity;
				
				quan_count.setText(quantity + "");
				p_price.setText(resultPri + "");
			}
			
		});
		getContentPane().add(minusBtn);
		
		JButton chkBtn = new JButton("확 인");
		chkBtn.setForeground(Color.BLUE);
		chkBtn.setBounds(315, 137, 90, 29);
		chkBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 장바구니 DB에 상품이름 가격 수량 넣어야함
				//basketList.add(new ProductsBasket(p_name.getText(), img_path, p_price.getText(), quan_count.getText()));
				
				new ProductsBasketsDAO().basketInsert(new ProductsBasket(p_name.getText(), img_path, p_price.getText(), quan_count.getText()));
				
				
				setVisible(false);
			}
			
		});
		getContentPane().add(chkBtn);

		JButton cancleBtn = new JButton("취 소");
		cancleBtn.setForeground(Color.RED);
		cancleBtn.setBounds(404, 137, 90, 29);
		cancleBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		getContentPane().add(cancleBtn);
	}
	
	
}