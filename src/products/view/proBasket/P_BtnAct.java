package products.view.proBasket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import products.model.dto.Products;

public class P_BtnAct implements ActionListener{
	int i;
	ArrayList<Products> selectType;
	
	public P_BtnAct(int i, ArrayList<Products> selectType) {
		this.i = i;
		this.selectType = selectType;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ChkFrame(selectType.get(i).getImgPath(), selectType.get(i).getName(),
				selectType.get(i).getPrice());
	}

}