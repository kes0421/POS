package products.view.productsPanels;

import java.awt.GridLayout;

import javax.swing.JFrame;

import products.view.MainFrame;

public class SnackPanel extends ProductsPanel{

	public SnackPanel(JFrame mF) {

		setLayout(new GridLayout(6,2));
		
		selectType = typeOfproduct(list.pList(), "������ǰ");
		
		addBtn((MainFrame)mF);
	}

}
