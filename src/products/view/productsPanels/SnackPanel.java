package products.view.productsPanels;

import java.awt.GridLayout;

public class SnackPanel extends ProductsPanel{
	
	public SnackPanel() {
		
		setLayout(new GridLayout(4,2));
		
		selectType = typeOfproduct(list.pList(), "������ǰ");
		
		addBtn();
		
	}

}
