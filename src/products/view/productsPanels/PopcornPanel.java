package products.view.productsPanels;

import java.awt.GridLayout;

import javax.swing.JFrame;

import products.view.MainFrame;

public class PopcornPanel extends ProductsPanel{

	public PopcornPanel(JFrame mF) {
		
		setLayout(new GridLayout(4,2));
		
		selectType = typeOfproduct(list.pList(), "ÆËÄÜ´ÜÇ°");
		
		addBtn((MainFrame)mF);
	}
}
