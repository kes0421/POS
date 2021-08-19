package products.view.proBasket;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import products.model.dto.Products;
import products.view.MainFrame;

public class P_BtnAct implements ActionListener{
	int i;
	ArrayList<Products> selectType;
	MainFrame mF;
	
	public P_BtnAct(int i, ArrayList<Products> selectType, JFrame mF) {
		this.i = i;
		this.selectType = selectType;
		this.mF = (MainFrame)mF;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new ChkFrame(selectType.get(i).getImgPath(), selectType.get(i).getName(),
				selectType.get(i).getPrice(), mF);
	}

}