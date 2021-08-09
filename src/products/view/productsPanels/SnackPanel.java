package products.view.productsPanels;

import java.awt.GridLayout;

public class SnackPanel extends ProductsPanel{
	
	public SnackPanel() {
		
		setLayout(new GridLayout(6,2));
		
		selectType = typeOfproduct(list.pList(), "½º³¼´ÜÇ°");
		
		addBtn();
	}

}
