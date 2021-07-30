package products.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import products.controller.ProductsListController;
import products.model.Products;

public class MakeProducts extends DefaultFrame{

	static ProductsListController list = new ProductsListController();

	public MakeProducts() {
		super();

		JMenuBar bar = new JMenuBar();

		JMenu combo = new JMenu("Combo");
		JMenu popcorn = new JMenu("Popcorn");
		JMenu beverage = new JMenu("Beverage");
		JMenu snack = new JMenu("Snack");

		bar.add(combo);
		bar.add(popcorn);
		bar.add(beverage);
		bar.add(snack);

		setJMenuBar(bar);

		ArrayList<Products> selectOpt = new ArrayList<>();

		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> price = new ArrayList<>();
		ArrayList<String> imgPath = new ArrayList<>();

		ArrayList<ImageIcon> imgIcon = new ArrayList<>();
		ArrayList<String> text = new ArrayList<>();
		ArrayList<JButton> btns = new ArrayList<>();

		selectOpt = typeOfproduct(list.pList(),"ÆËÄÜ´ÜÇ°");

		for(int i = 0; i < selectOpt.size(); ++i) {
			name.add(selectOpt.get(i).getName());
			price.add(selectOpt.get(i).getPrice());
			imgPath.add(selectOpt.get(i).getImgPath());
		}

		imgIcon = makeImageIconArray(imgPath);
		text = p_text(name, price);
		btns = btn_list(imgIcon, text);

		JPanel panel = new JPanel();
		add(panel, "Center");
		panel.add(btns.get(0));

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
			icons.add(new ImageIcon(path));
		}

		return icons;
	}

	public static ArrayList<JButton> btn_list(ArrayList<ImageIcon> icons, ArrayList<String> texts){
		ArrayList<JButton> btns = new ArrayList<>();

		for (int i = 0; i <icons.size(); ++i) {
			btns.add(new JButton(texts.get(i),icons.get(i)));
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
		MakeProducts frame = new MakeProducts();
		frame.setDefaultOptions();



	}
}
