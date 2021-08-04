package products.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuBarPanel extends JPanel{
	
	JButton comboBtn;
	JButton popcornBtn;
	JButton snackBtn;
	JButton bvgBtn;
	
	public MenuBarPanel() {
		// 메뉴바 패널 
		setBackground(Color.WHITE);
		setBounds(0, 142, 700, 69);
		setLayout(null);
		setVisible(true);

		// 각 메뉴버튼들 
		//JButton comboBtn = new JButton("Combo");
		comboBtn = new JButton("콤보");
		comboBtn.setBackground(Color.ORANGE);
		comboBtn.setForeground(Color.CYAN);
		comboBtn.setBounds(21, 10, 117, 44);
		add(comboBtn);
		
		//JButton popcornBtn = new JButton("Popcorn");
		popcornBtn = new JButton("팝콘단품");
		popcornBtn.setForeground(Color.BLACK);
		popcornBtn.setBackground(Color.ORANGE);
		popcornBtn.setBounds(184, 11, 117, 44);
		add(popcornBtn);
		
		
		//JButton snackBtn = new JButton("Snack");
		snackBtn = new JButton("스낵단품");
		snackBtn.setBackground(Color.ORANGE);
		snackBtn.setBounds(371, 10, 117, 44);
		add(snackBtn);

		//JButton bvgBtn = new JButton("Beverage");
		bvgBtn = new JButton("음료단품");
		bvgBtn.setBackground(Color.ORANGE);
		bvgBtn.setBounds(546, 10, 117, 44);
		add(bvgBtn);
		
	}
}