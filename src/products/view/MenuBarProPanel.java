package products.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import products.model.dao.ProductsListDAO;
import products.model.dto.Products;

public class MenuBarProPanel extends JPanel{
	ProductsListDAO list;
	
	JPanel menuBarP;
	JButton comboBtn;
	
	// 선택한 타입 넣어놓음
	ArrayList<Products> selectType;

	// 제품 이름, 가격, 이미지주소 넣어놓음
	ArrayList<String> name;
	ArrayList<Integer> price;
	ArrayList<String> imgPath;

	ArrayList<ImageIcon> imgIcon;
	ArrayList<String> text;
	ArrayList<JButton> btns;
	
	ArrayList<JButton> comboBtns;
	
	String menuBarTxt;
	
	public MenuBarProPanel() {
		
		// 상품들어갈 패널 콤보제외 
		setBackground(Color.white);
		setBounds(0, 210, 700, 432);
		setVisible(true);
		
		// menuBarPanel
		menuBarP = new JPanel();
		menuBarP.setBackground(Color.WHITE);
		menuBarP.setBounds(0, 142, 700, 69);
		menuBarP.setLayout(null);
		menuBarP.setVisible(true);
		
		addMenuBar();

		// 스크롤 집어넣을때 사용해라
		//JScrollPane scroll = new JScrollPane();
		//scroll.add(this);
		
		menuBarTxt = "스낵단품";
		
		actionBtn();
		
	}
	
	public void addMenuBar() {
		// 각 메뉴버튼들 
		//JButton comboBtn = new JButton("Combo");
		comboBtn = new JButton("콤보");
		comboBtn.setBackground(Color.ORANGE);
		//comboBtn.setForeground(Color.CYAN);
		comboBtn.setBounds(21, 10, 117, 44);
		menuBarP.add(comboBtn);
		
		comboBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				menuBarTxt = "콤보";
				
				actionBtn();
				
				setVisible(true);
			}
		});
		
		//JButton popcornBtn = new JButton("Popcorn");
		JButton popcornBtn = new JButton("팝콘단품");
		popcornBtn.setForeground(Color.BLACK);
		popcornBtn.setBackground(Color.ORANGE);
		popcornBtn.setBounds(184, 11, 117, 44);
		menuBarP.add(popcornBtn);
		
		popcornBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				menuBarTxt = "팝콘단품";
				
				actionBtn();
				
				setVisible(true);
			}
		});
		
		//JButton snackBtn = new JButton("Snack");
		JButton snackBtn = new JButton("스낵단품");
		snackBtn.setBackground(Color.ORANGE);
		snackBtn.setBounds(371, 10, 117, 44);
		menuBarP.add(snackBtn);

		//JButton bvgBtn = new JButton("Beverage");
		JButton bvgBtn = new JButton("음료단품");
		bvgBtn.setBackground(Color.ORANGE);
		bvgBtn.setBounds(546, 10, 117, 44);
		menuBarP.add(bvgBtn);
				
	}
	
	public void actionBtn() {
		list = new ProductsListDAO();
		
		selectType = new ArrayList<>();
		name = new ArrayList<>();
		price = new ArrayList<>();
		imgPath = new ArrayList<>();

		imgIcon = new ArrayList<>();
		text = new ArrayList<>();
		btns = new ArrayList<>();
		
		setLayout(new GridLayout(4,4));
		
		selectType = typeOfproduct(list.pList(), menuBarTxt);
		
		for(int i = 0; i < selectType.size(); ++i) {
			name.add(selectType.get(i).getName());
			price.add(selectType.get(i).getPrice());
			imgPath.add(selectType.get(i).getImgPath());
		}
		
		imgIcon = makeImageIconArray(imgPath);
		text = p_text(name, price);
		btns = btn_list(imgIcon, text);
		
		for(int i = 0; i< btns.size(); ++i) {
			add(btns.get(i));	
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
