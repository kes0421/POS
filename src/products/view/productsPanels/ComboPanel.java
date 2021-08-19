package products.view.productsPanels;

import java.awt.GridLayout;

import javax.swing.JFrame;

import products.view.MainFrame;

public class ComboPanel extends ProductsPanel{

	public ComboPanel(JFrame mF) {
		
		setLayout(new GridLayout(3,2));
		
		selectType = typeOfproduct(list.pList(), "ÄÞº¸");
		
		addBtn((MainFrame)mF);
	}
}
