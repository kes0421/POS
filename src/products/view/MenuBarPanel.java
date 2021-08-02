package products.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuBarPanel extends JPanel{

	public MenuBarPanel() {
		// 메뉴바 패널 
		setBackground(Color.WHITE);
		setBounds(0, 142, 700, 69);
		setLayout(null);
		setVisible(true);

		// 각 메뉴버튼들 
		JButton comboBtn = new JButton("Combo");
		comboBtn.setBackground(Color.ORANGE);
		comboBtn.setForeground(Color.CYAN);
		comboBtn.setBounds(21, 10, 117, 44);
		add(comboBtn);

		JButton popcornBtn = new JButton("Popcorn");
		popcornBtn.setForeground(Color.BLACK);
		popcornBtn.setBackground(Color.ORANGE);
		popcornBtn.setBounds(184, 11, 117, 44);
		add(popcornBtn);

		JButton snackBtn = new JButton("Snack");
		snackBtn.setBackground(Color.ORANGE);
		snackBtn.setBounds(371, 10, 117, 44);
		add(snackBtn);

		JButton bvgBtn = new JButton("Beverage");
		bvgBtn.setBackground(Color.ORANGE);
		bvgBtn.setBounds(546, 10, 117, 44);
		add(bvgBtn);
	}
}