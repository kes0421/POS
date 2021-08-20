package products.view.productsPanels;

import java.awt.Color;
import java.awt.Image;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import products.model.dao.ProductsListDAO;
import products.model.dto.Products;
import products.view.MainFrame;
import products.view.proBasket.P_BtnAct;

import java.awt.event.*;

public class ProductsPanel extends JPanel{
	
	public ProductsListDAO list = new ProductsListDAO();
	
	// 선택한 타입 넣어놓음
	public ArrayList<Products> selectType = new ArrayList<>();
	
	// 제품 각각의 이름, 가격, 이미지주소 넣어놓음
	public ArrayList<String> name = new ArrayList<>();
	public ArrayList<Integer> price = new ArrayList<>();
	public ArrayList<String> imgPath = new ArrayList<>();
	
	public ArrayList<ImageIcon> imgIcon = new ArrayList<>();
	public ArrayList<String> text = new ArrayList<>();
	public ArrayList<JButton> btns = new ArrayList<>();
	
	public ProductsPanel() {
		// 상품들어갈 패널 콤보제외 
		setBackground(Color.white);
	}
	
	public void addBtn(MainFrame mF) {
		
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
			
			btns.get(i).addActionListener(new P_BtnAct(i, selectType, mF));
			
			MyMouseListener listener = new MyMouseListener();
			
			btns.get(i).addMouseListener(listener);
		}
	}
	
	/**
		products들의 이름과 가격를 gui에 보여주기위해 html를 활용해 text를 만들었다.
		@param name : 제품들 이름
		@param price : 제품들 가격
		@return : ArrayList<String>
	 */
	public ArrayList<String> p_text(ArrayList<String> name, ArrayList<Integer> price) {
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < name.size(); ++i) {
			DecimalFormat formatter = new DecimalFormat("###,###");
			
			result.add("<HTML>" + name.get(i) + "<br>" + formatter.format(price.get(i)) + "원</HTML>");
		}
		return result;
	}
	
	/**
		ImageIcon ArrayList에 img_path의 사진을 넣어준다.
		img사이즈도 줄어줌
	 	@param image_paths : 여러 이미지 path들이 들어가 있음
		@return ArrayList<ImageIcon>
	 */
	public ArrayList<ImageIcon> makeImageIconArray(ArrayList<String> image_paths) {
		ArrayList<ImageIcon> icons = new ArrayList<>();

		for (String path : image_paths) {
			ImageIcon originIcon = new ImageIcon(path);
			Image resizeIcon = originIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			
			icons.add(new ImageIcon(resizeIcon));
		}
		return icons;
	}
	
	/**
		img와 위에서 만든 name, price있는 text를 가지고 여러개의 번튼 만들기
		@param icons : 각각의 제품 img들이 들어있다.
		@param texts : 각각의 제품 name, price들이 들어있다.
		@return ArrayList<JButton>
	*/
	public ArrayList<JButton> btn_list(ArrayList<ImageIcon> icons, ArrayList<String> texts){
		ArrayList<JButton> btns = new ArrayList<>();
		
		for (int i = 0; i < icons.size(); ++i) {
			btns.add(new JButton(texts.get(i),icons.get(i)));
			btns.get(i).setBackground(Color.white);
		}
		return btns;
	}

	/**
	 	타입에 맞는 products들의 정보 가져와서 ArrayList에 담아주기
	 	@param products ArrayList에 제품 정보 담기
	 	@param typeName 선택된 상품 type
	 	@return ArrayList<Products>
	*/
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

/**
	버튼에 마우스 올릴때마다 색 바꿔주기
*/
class MyMouseListener extends MouseAdapter{

	@Override
	public void mouseEntered(MouseEvent e) {
		JButton b = (JButton)e.getSource();
		b.setBackground(new Color(254,255,96));
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.white);
	}
	
}