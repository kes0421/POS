package products.view.productsPanels;

import java.awt.GridLayout;

public class BeveragePanel extends ProductsPanel{

	public BeveragePanel() {
		
		setLayout(new GridLayout(5,3));
		
		selectType = typeOfproduct(list.pList(), "�����ǰ");
		
//		JScrollPane scroll = new JScrollPane();
//		scroll.add(this);
		
		addBtn();
	}
}