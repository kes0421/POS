package products.view.detail;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;

import products.model.dao.ProductsBasketsDAO;

public class DetailFrame extends JFrame{
	
	ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();
	
	public DetailFrame() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,600,600);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		
		Detail_P1 panel1 = new Detail_P1();
		Detail_P2 panel2 = new Detail_P2();
//		Detail_P2_C[] panel2_1;
		ArrayList<Detail_P2_C> panel2_1 = new ArrayList<>();
		Detail_P3 panel3 = new Detail_P3();
		Detail_P2_C panel2_c;
		
		for(int i = 0; i < pbDAO.basketList().size(); ++i) {
			
//			panel2_c = new Detail_P2_C(
//					pbDAO.basketList().get(i).getImgPath(),
//					pbDAO.basketList().get(i).getName(),
//					pbDAO.basketList().get(i).getPrice(),
//					pbDAO.basketList().get(i).getQuantity());
//			
			panel2_1.add(new Detail_P2_C(
					pbDAO.basketList().get(i).getImgPath(),
					pbDAO.basketList().get(i).getName(),
					pbDAO.basketList().get(i).getPrice(),
					pbDAO.basketList().get(i).getQuantity()));
			
		}
		
		for(int i = 0; i < panel2_1.size(); ++i) {
			panel2_1.get(i).setBounds(0, 0, 600, (i+1) * 100);
			add(panel2_1.get(i));
		}
		
		getContentPane().add(panel1);
		getContentPane().add(panel2);
		getContentPane().add(panel3);
	}
	
}