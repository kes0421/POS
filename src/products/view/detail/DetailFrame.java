package products.view.detail;

import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import products.model.dao.ProductsBasketsDAO;

public class DetailFrame extends JFrame{
	
	ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();
	JScrollPane scroll;
	
	public DetailFrame() {
		
		setBounds(0,0,600,600);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		
		plusFrame();
	}
	
	public void plusFrame() {
		Detail_P1 panel1 = new Detail_P1();
		Detail_P2 panel2 = new Detail_P2();
		ArrayList<Detail_P2_C> panel2_1 = new ArrayList<>();
		Detail_P3 panel3 = new Detail_P3(this);
		ArrayList<Integer> prices = new ArrayList<>();
		
		for(int i = 0; i < pbDAO.basketList().size(); ++i) {
			
			panel2_1.add(new Detail_P2_C(
					pbDAO.basketList().get(i).getImgPath(),
					pbDAO.basketList().get(i).getName(),
					pbDAO.basketList().get(i).getPrice(),
					pbDAO.basketList().get(i).getQuantity(),
					this));
			
			panel2.add(panel2_1.get(i));
			
			prices.add(Integer.parseInt(pbDAO.basketList().get(i).getPrice()));
		}
		scroll = new JScrollPane(panel2);
		add(scroll);
		
		scroll.setBounds(0, 67, 600, 383);
		scroll.setVisible(true);
		
		int allPrice = 0;
		for(int i = 0; i < prices.size(); ++i) {
			DecimalFormat formatter = new DecimalFormat("###,###");
			
			allPrice += prices.get(i);
			
			panel3.label2.setText(formatter.format(allPrice) + "¿ø");
		}
		
		getContentPane().add(panel1);
		getContentPane().add(panel3);
	}
}