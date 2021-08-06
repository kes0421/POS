package products.view.productsPanels;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuBarPanel extends JPanel{
	
	public JButton comboBtn;
	public JButton popcornBtn;
	public JButton snackBtn;
	public JButton bvgBtn;
	
	public MenuBarPanel() {
		// �޴��� �г� 
		setBackground(Color.WHITE);
		setBounds(0, 142, 700, 69);
		setLayout(null);
		setVisible(true);

		// �� �޴���ư�� 
		comboBtn = new JButton("Combo");
		comboBtn.setBackground(Color.ORANGE);
		comboBtn.setForeground(Color.CYAN);
		comboBtn.setBounds(21, 10, 117, 44);
		add(comboBtn);
		
		popcornBtn = new JButton("Popcorn");
		popcornBtn.setForeground(Color.BLACK);
		popcornBtn.setBackground(Color.ORANGE);
		popcornBtn.setBounds(184, 11, 117, 44);
		add(popcornBtn);
		
		snackBtn = new JButton("Snack");
		snackBtn.setBackground(Color.ORANGE);
		snackBtn.setBounds(371, 10, 117, 44);
		add(snackBtn);

		bvgBtn = new JButton("Beverage");
		bvgBtn.setBackground(Color.ORANGE);
		bvgBtn.setBounds(546, 10, 117, 44);
		add(bvgBtn);
		
	}
}