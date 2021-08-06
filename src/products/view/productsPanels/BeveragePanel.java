package products.view.productsPanels;

import java.awt.GridLayout;

public class BeveragePanel extends ProductsPanel{

	public BeveragePanel() {
		
		setLayout(new GridLayout(8,2));
		
		selectType = typeOfproduct(list.pList(), "음료단품");
		
		addBtn();
	}
}