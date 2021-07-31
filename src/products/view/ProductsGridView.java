package products.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import products.model.dao.ProductsListDAO;
import products.model.dto.Products;

public class ProductsGridView extends JFrame{
	
	ProductsListDAO list = new ProductsListDAO();
	
	// 선택한 타입 넣어놓음
	ArrayList<Products> selectType = new ArrayList<>();

	// 제품 이름, 가격, 이미지주소 넣어놓음
	ArrayList<String> name = new ArrayList<>();
	ArrayList<Integer> price = new ArrayList<>();
	ArrayList<String> imgPath = new ArrayList<>();

	ArrayList<ImageIcon> imgIcon = new ArrayList<>();
	ArrayList<String> text = new ArrayList<>();
	ArrayList<JButton> btns = new ArrayList<>();
	
	public ProductsGridView() {
		super();
		
		JPanel productsPanel = new JPanel();
		JScrollPane scroll = new JScrollPane(productsPanel);
		
		add(scroll, "Center");
		
		productsPanel.setLayout(new GridLayout(4,2));
		
		selectType = typeOfproduct(list.pList(),"팝콘단품");

		for(int i = 0; i < selectType.size(); ++i) {
			name.add(selectType.get(i).getName());
			price.add(selectType.get(i).getPrice());
			imgPath.add(selectType.get(i).getImgPath());
		}
		
		imgIcon = makeImageIconArray(imgPath);
		text = p_text(name, price);
		btns = btn_list(imgIcon, text);
		
		for(int i = 0; i< btns.size(); ++i) {
			productsPanel.add(btns.get(i));	
		}
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,600);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static ArrayList<String> p_text(ArrayList<String> name, ArrayList<Integer> price) {
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < name.size(); ++i) {
			result.add("<HTML>" + name.get(i) + "<br>" + price.get(i) + "</HTML>");
		}

		return result;
	}

	public static ArrayList<ImageIcon> makeImageIconArray(ArrayList<String> image_paths) {
		ArrayList<ImageIcon> icons = new ArrayList<>();

		for (String path : image_paths) {
			ImageIcon originIcon = new ImageIcon(path);
			Image resizeIcon = originIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
			
			icons.add(new ImageIcon(resizeIcon));
		}

		return icons;
	}

	public static ArrayList<JButton> btn_list(ArrayList<ImageIcon> icons, ArrayList<String> texts){
		ArrayList<JButton> btns = new ArrayList<>();
		
		for (int i = 0; i < icons.size(); ++i) {
			btns.add(new JButton(texts.get(i),icons.get(i)));
			btns.get(i).setBackground(Color.white);
		}
		
		return btns;
	}

	public static ArrayList<Products> typeOfproduct(ArrayList<Products> products, String typeName){
		ArrayList<Products> array = new ArrayList<>();

		for (int i = 0; i < products.size(); ++i) {
			if (products.get(i).getType().equals(typeName)) {
				array.add(products.get(i));
			}
		}

		return array;
	}
	
	public static void main(String[] args) {
		ProductsGridView frame = new ProductsGridView();
	}
	
	
}
