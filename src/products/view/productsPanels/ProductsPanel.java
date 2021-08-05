package products.view.productsPanels;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import products.model.dao.ProductsListDAO;
import products.model.dto.Products;
import products.view.ckeckFrame.P_BtnAct;

public class ProductsPanel extends JPanel{
	public ProductsListDAO list = new ProductsListDAO();
	
	// 선택한 타입 넣어놓음
	public ArrayList<Products> selectType = new ArrayList<>();

	// 제품 이름, 가격, 이미지주소 넣어놓음
	public ArrayList<String> name = new ArrayList<>();
	public ArrayList<Integer> price = new ArrayList<>();
	public ArrayList<String> imgPath = new ArrayList<>();

	public ArrayList<ImageIcon> imgIcon = new ArrayList<>();
	public ArrayList<String> text = new ArrayList<>();
	public ArrayList<JButton> btns = new ArrayList<>();
	
	public ProductsPanel() {
		// 상품들어갈 패널 콤보제외 
		setBackground(Color.white);
		setBounds(0, 210, 700, 425);
		setVisible(true);
		
		// 스크롤 집어넣을때 사용해라
		//JScrollPane scroll = new JScrollPane();
		//scroll.add(this);
		
	}
	
	public void addBtn() {
		for(int i = 0; i < selectType.size(); ++i) {
			name.add(selectType.get(i).getName());
			price.add(selectType.get(i).getPrice());
			imgPath.add(selectType.get(i).getImgPath());
		}
		
		imgIcon = makeImageIconArray(imgPath);
		text = p_text(name, price);
		btns = btn_list(imgIcon, text);
		
		for(int i = 0; i < btns.size(); ++i) {
			add(btns.get(i));	
			
			btns.get(i).addActionListener(new P_BtnAct(i, selectType));
		}
	}
	
	public ArrayList<String> p_text(ArrayList<String> name, ArrayList<Integer> price) {
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < name.size(); ++i) {
			result.add("<HTML>" + name.get(i) + "<br>" + price.get(i) + "</HTML>");
		}

		return result;
	}

	public ArrayList<ImageIcon> makeImageIconArray(ArrayList<String> image_paths) {
		ArrayList<ImageIcon> icons = new ArrayList<>();

		for (String path : image_paths) {
			ImageIcon originIcon = new ImageIcon(path);
			Image resizeIcon = originIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			
			icons.add(new ImageIcon(resizeIcon));
		}

		return icons;
	}

	public ArrayList<JButton> btn_list(ArrayList<ImageIcon> icons, ArrayList<String> texts){
		ArrayList<JButton> btns = new ArrayList<>();
		
		for (int i = 0; i < icons.size(); ++i) {
			btns.add(new JButton(texts.get(i),icons.get(i)));
			btns.get(i).setBackground(Color.white);
		}
		
		return btns;
	}

	public ArrayList<Products> typeOfproduct(ArrayList<Products> products, String typeName){
		ArrayList<Products> array = new ArrayList<>();

		for (int i = 0; i < products.size(); ++i) {
			if (products.get(i).getType().equals(typeName)) {
				array.add(products.get(i));
			}
		}

		return array;
	}
	
}