package products.view.proBasket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import products.model.dto.Products;
import products.view.productsPanels.ProductsPanel;

public class ProductBtn extends JFrame implements ActionListener{
//	
//	ProductsPanel proP = new ProductsPanel();
	JButton btn;
	int i;
	
	public ProductBtn(int i, ArrayList<Products> selectType) {
		this.i = i;
		btn = new JButton();
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		new ChkFrame(proP.selectType.get(i).getImgPath(), 
//					proP.selectType.get(i).getName(),
//					proP.selectType.get(i).getPrice());
	}

}