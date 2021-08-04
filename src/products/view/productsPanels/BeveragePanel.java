package products.view.productsPanels;

import java.awt.GridLayout;

import products.view.ProductsPanel;

public class BeveragePanel extends ProductsPanel{

	public BeveragePanel() {
		
		setLayout(new GridLayout(5,3));
		
		selectType = typeOfproduct(list.pList(), "음료단품");
		
//		JScrollPane scroll = new JScrollPane();
//		scroll.add(this);
		
		addBtn();
	}
}