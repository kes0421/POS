package products.view.productsPanels;

import java.awt.GridLayout;

import javax.swing.JScrollPane;

public class PopcornPanel extends ProductsPanel{

	public PopcornPanel() {
		
		setLayout(new GridLayout(4,2));
		
		selectType = typeOfproduct(list.pList(), "ÆËÄÜ´ÜÇ°");
		
		addBtn();
	}
}
