package products.view.productsPanels;

import java.awt.GridLayout;

public class ComboPanel extends ProductsPanel{

	
	public ComboPanel() {
		
		setLayout(new GridLayout(3,2));
		
		selectType = typeOfproduct(list.pList(), "ÄÞº¸");
		
		addBtn();
	}
}
