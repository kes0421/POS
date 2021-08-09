package products.view.productsPanels;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import css.RoundedButton;

public class MenuBarPanel extends JPanel{
	
	public JButton comboBtn;
	public JButton popcornBtn;
	public JButton snackBtn;
	public JButton bvgBtn;
	
	public MenuBarPanel() {
		// 메뉴바 패널 
		setBackground(new Color(255,254,230));
		setBounds(0, 142, 700, 69);
		setLayout(null);
		setVisible(true);

		// 각 메뉴버튼들 
		comboBtn = new RoundedButton("Combo");
		comboBtn.setBackground(Color.ORANGE);
		comboBtn.setForeground(Color.CYAN);
		comboBtn.setBounds(21, 10, 117, 44);
		add(comboBtn);
		
		popcornBtn = new RoundedButton("Popcorn");
		popcornBtn.setForeground(Color.BLACK);
		popcornBtn.setBackground(Color.ORANGE);
		popcornBtn.setBounds(184, 11, 117, 44);
		add(popcornBtn);
		
		snackBtn = new RoundedButton("Snack");
		snackBtn.setBackground(Color.ORANGE);
		snackBtn.setBounds(371, 10, 117, 44);
		add(snackBtn);

		bvgBtn = new RoundedButton("Beverage");
		bvgBtn.setBackground(Color.ORANGE);
		bvgBtn.setBounds(546, 10, 117, 44);
		add(bvgBtn);
		
	}
}