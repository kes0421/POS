package products.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import products.model.dao.ProductsBasketsDAO;
import products.view.MainFrame;

public class DetailFrame extends JFrame{
	
	ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();
	JScrollPane scroll;
	MainFrame mF;
	
	public DetailFrame(JFrame mF) {
		super("DetailFrame");
		this.mF = (MainFrame)mF;
		setBounds(0,0,600,600);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		setVisible(true);

		plusFrame();
	}
	
	public void plusFrame() {
		Detail_P1 panel1 = new Detail_P1();
		Detail_P2 panel2 = new Detail_P2();
		ArrayList<Detail_P2_C> panel2_1 = new ArrayList<>();
		Detail_P3 panel3 = new Detail_P3(this, mF);
		ArrayList<Integer> prices = new ArrayList<>();
		
		if(pbDAO.basketList().size() == 0) {
			JPanel noData = new JPanel();
			noData.setBackground(new Color(255,254,230));
			JLabel msg = new JLabel("장바구니에 상품이 담겨있지 않습니다.");
			msg.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
			noData.add(msg);
			scroll = new JScrollPane(noData);
			add(scroll);
		
			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		} else {
			
			for(int i = 0; i < pbDAO.basketList().size(); ++i) {
				
				panel2_1.add(new Detail_P2_C(
						pbDAO.basketList().get(i).getImgPath(),
						pbDAO.basketList().get(i).getName(),
						pbDAO.basketList().get(i).getPrice(),
						pbDAO.basketList().get(i).getQuantity(),
						this, mF));
				
				panel2.add(panel2_1.get(i));
				
				prices.add(Integer.parseInt(pbDAO.basketList().get(i).getPrice()));
			}
			scroll = new JScrollPane(panel2);
			add(scroll);
			
			scroll.setBounds(0, 67, 600, 383);
			scroll.setVisible(true);
		}
		
		int allPrice = 0;
		for(int i = 0; i < prices.size(); ++i) {
			DecimalFormat formatter = new DecimalFormat("###,###");
			
			allPrice += prices.get(i);
			
			panel3.label2.setText(formatter.format(allPrice) + "원");
		}
		
		getContentPane().add(panel1);
		getContentPane().add(panel3);
	}
}