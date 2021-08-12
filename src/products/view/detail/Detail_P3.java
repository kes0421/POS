package products.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import admin.model.dao.ProductsInventoryDAO;
import admin.model.dto.ProductsInventory;
import css.RoundedButton;
import products.model.dao.ProductsBasketsDAO;
import products.model.dao.ProductsSalesDAO;
import products.model.dto.ProductsBasket;
import products.model.dto.ProductsSales;

public class Detail_P3 extends JPanel{
	
	ProductsBasketsDAO proBasketDAO = new ProductsBasketsDAO();
	ProductsInventoryDAO proInventoryDAO = new ProductsInventoryDAO(); 
	
	JLabel label2;
	
	public Detail_P3(JFrame frame) {
		setBackground(new Color(255,254,230));
		setBounds(0, 448, 600, 124);
		setLayout(null);
		setVisible(true);
		
		JLabel label1 = new JLabel("�� �����ݾ�");
		label1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label1.setForeground(new Color(87,149,255));
		label1.setBounds(20, 6, 153, 44);
		add(label1);

		label2 = new JLabel();
		label2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label2.setForeground(new Color(87,149,255));
		label2.setBounds(406, 6, 142, 44);
		add(label2);

		JButton preBtn = new RoundedButton("�� ��");
		preBtn.setForeground(new Color(255, 0, 0));
		preBtn.setBounds(135, 62, 117, 56);
		preBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		add(preBtn);

		JButton payBtn = new RoundedButton("�� ��");
		payBtn.setForeground(new Color(0, 0, 255));
		payBtn.setBounds(325, 62, 117, 56);
		payBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<ProductsBasket> basketList = proBasketDAO.basketList();
				ArrayList<String> pName = new ArrayList<>();
				ArrayList<String> piCodeList = new ArrayList<>();
				
				if(basketList.size() == 0) {
					new NoPayFrame();
				}
				// ��ٱ��� DB DELETE ���ֱ�
				new ProductsBasketsDAO().basketAllDelete();
				
				// ��ǰ ���� ���̺� INSERT ���ֱ�
				for(int i = 0; i < basketList.size(); ++i) {
					new ProductsSalesDAO().salseInsert(new ProductsSales(
																basketList.get(i).getName(),
																basketList.get(i).getPrice(),
																basketList.get(i).getQuantity()
																));
				}
				
				// ��ٱ��� List���� name�� ArrayList�� �־��ֱ�
				for(int i = 0; i < basketList.size(); ++i) {
					pName.add(basketList.get(i).getName());
				}
				
				// �����ϱ� ��ư ���� �� ������̺��� ��� ���̳ʽ� ���ִ� �ݺ���
				for(int i = 0; i< pName.size(); ++i) {
					// ������̺��� ���̳ʽ� �� ��¥ SELECT ���ֱ�
					piCodeList = new ProductsInventoryDAO().minDateSelect(pName.get(i));
					int quantity = Integer.parseInt(basketList.get(i).getQuantity());
					
					// ���� �� ������ ��� ���̺��� ���̳ʽ� ���ֱ�
					new ProductsInventoryDAO().inventoryQuantityUpdate(pName.get(i), quantity, piCodeList.get(0));
				}
			}
		});
		
		add(payBtn);
	}
}