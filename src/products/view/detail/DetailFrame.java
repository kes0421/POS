package products.view.detail;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import products.model.dao.ProductsBasketsDAO;

public class DetailFrame extends JFrame{
	
	ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();
	JScrollPane scroll;
	public DetailFrame() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,600,600);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		
		Detail_P1 panel1 = new Detail_P1();
		Detail_P2 panel2 = new Detail_P2();
		ArrayList<Detail_P2_C> panel2_1 = new ArrayList<>();
		Detail_P3 panel3 = new Detail_P3(this);
		ArrayList<Integer> prices = new ArrayList<>();
		
		scroll = new JScrollPane(panel2);
		add(scroll);
		
		for(int i = 0; i < pbDAO.basketList().size(); ++i) {
			
			panel2_1.add(new Detail_P2_C(
					pbDAO.basketList().get(i).getImgPath(),
					pbDAO.basketList().get(i).getName(),
					pbDAO.basketList().get(i).getPrice(),
					pbDAO.basketList().get(i).getQuantity(),
					this));
			if (i == 0) {
				panel2_1.get(i).setBounds(0, 0, 600, 100);
			} else {
				panel2_1.get(i).setBounds(0, (i) * 100, 600, 100);
			}
			
			//panel2_1.get(i).setBounds(0, (i+1) * 100, 600, 100);
			
			panel2.add(panel2_1.get(i));
			
			prices.add(Integer.parseInt(pbDAO.basketList().get(i).getPrice()));
		}
		
		
		
		scroll.setBounds(0, 100, 600, 350);
		scroll.setVisible(true);
		
		int allPrice = 0;
		for(int i = 0; i < prices.size(); ++i) {
			
			allPrice += prices.get(i);
			
			panel3.label2.setText(allPrice + "¿ø");
		}
		
		getContentPane().add(panel1);
//		getContentPane().add(panel2);
		getContentPane().add(panel3);
	}
	
}