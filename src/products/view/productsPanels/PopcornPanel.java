package products.view.productsPanels;

import java.awt.GridLayout;

import products.view.ProductsPanel;

public class PopcornPanel extends ProductsPanel{

	public PopcornPanel() {
		
		setLayout(new GridLayout(4,3));
		
		selectType = typeOfproduct(list.pList(), "ÆËÄÜ´ÜÇ°");
		
		addBtn();
	}
}
