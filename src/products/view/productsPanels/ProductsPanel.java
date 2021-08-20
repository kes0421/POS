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
	
	// ������ Ÿ�� �־����
	public ArrayList<Products> selectType = new ArrayList<>();
	
	// ��ǰ ������ �̸�, ����, �̹����ּ� �־����
	public ArrayList<String> name = new ArrayList<>();
	public ArrayList<Integer> price = new ArrayList<>();
	public ArrayList<String> imgPath = new ArrayList<>();
	
	public ArrayList<ImageIcon> imgIcon = new ArrayList<>();
	public ArrayList<String> text = new ArrayList<>();
	public ArrayList<JButton> btns = new ArrayList<>();
	
	public ProductsPanel() {
		// ��ǰ�� �г� �޺����� 
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
		products���� �̸��� ���ݸ� gui�� �����ֱ����� html�� Ȱ���� text�� �������.
		@param name : ��ǰ�� �̸�
		@param price : ��ǰ�� ����
		@return : ArrayList<String>
	 */
	public ArrayList<String> p_text(ArrayList<String> name, ArrayList<Integer> price) {
		ArrayList<String> result = new ArrayList<>();

		for (int i = 0; i < name.size(); ++i) {
			DecimalFormat formatter = new DecimalFormat("###,###");
			
			result.add("<HTML>" + name.get(i) + "<br>" + formatter.format(price.get(i)) + "��</HTML>");
		}
		return result;
	}
	
	/**
		ImageIcon ArrayList�� img_path�� ������ �־��ش�.
		img����� �پ���
	 	@param image_paths : ���� �̹��� path���� �� ����
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
		img�� ������ ���� name, price�ִ� text�� ������ �������� ��ư �����
		@param icons : ������ ��ǰ img���� ����ִ�.
		@param texts : ������ ��ǰ name, price���� ����ִ�.
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
	 	Ÿ�Կ� �´� products���� ���� �����ͼ� ArrayList�� ����ֱ�
	 	@param products ArrayList�� ��ǰ ���� ���
	 	@param typeName ���õ� ��ǰ type
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
	��ư�� ���콺 �ø������� �� �ٲ��ֱ�
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