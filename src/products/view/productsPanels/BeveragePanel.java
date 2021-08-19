package products.view.productsPanels;

import java.awt.GridLayout;

import javax.swing.JFrame;

import products.view.MainFrame;

public class BeveragePanel extends ProductsPanel{

	public BeveragePanel(JFrame mF) {
		setLayout(new GridLayout(8,2));
		
		selectType = typeOfproduct(list.pList(), "음료단품");
		
		addBtn((MainFrame)mF);
	}
}