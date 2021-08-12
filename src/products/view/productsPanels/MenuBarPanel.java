package products.view.productsPanels;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		setBounds(0, 142, 700, 50);
		setLayout(null);
		setVisible(true);
		
		// 각 메뉴버튼들 
		// 콤보 패널 + 콤보 버튼
		JPanel comboPanel = new JPanel();
		comboPanel.setBounds(0,0,175,50);
		comboPanel.setBackground(new Color(255,185,141));
		
		comboBtn = new RoundedButton("Combo");
		comboBtn.setBounds(21, 30, 117, 44);
		comboPanel.add(comboBtn);
		
		// 팝콘 패널 + 팝콘 버튼
		JPanel popcornPanel = new JPanel();
		popcornPanel.setBounds(175,0,175,50);
		popcornPanel.setBackground(new Color(255,254,230));
		
		popcornBtn = new RoundedButton("Popcorn");
		popcornBtn.setBounds(184, 20, 117, 44);
		popcornPanel.add(popcornBtn);
		
		// 스낵 패널 + 스낵 버튼
		JPanel snackPanel = new JPanel();
		snackPanel.setBounds(350,0,175,50);
		snackPanel.setBackground(new Color(255,254,230));
		
		snackBtn = new RoundedButton("Snack");
		snackBtn.setBounds(371, 20, 117, 44);
		snackPanel.add(snackBtn);
		
		// 음료 패널 + 음료 버튼
		JPanel bvgPanel = new JPanel();
		bvgPanel.setBounds(525,0,175,50);
		bvgPanel.setBackground(new Color(255,254,230));
		
		bvgBtn = new RoundedButton("Beverage");
		bvgBtn.setBounds(546, 20, 117, 44);
		bvgPanel.add(bvgBtn);
		
		// 메뉴 버튼 누를때 마다 누른 버튼 색 바꿔주기
		comboBtn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				comboPanel.setBackground(new Color(255,185,141));
				
				popcornPanel.setBackground(new Color(255,254,230));
				snackPanel.setBackground(new Color(255,254,230));
				bvgPanel.setBackground(new Color(255,254,230));
			}
		});
		
		popcornBtn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				popcornPanel.setBackground(new Color(255,185,141));
				
				comboPanel.setBackground(new Color(255,254,230));
				snackPanel.setBackground(new Color(255,254,230));
				bvgPanel.setBackground(new Color(255,254,230));
			}
		});
		
		snackBtn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				snackPanel.setBackground(new Color(255,185,141));
				
				comboPanel.setBackground(new Color(255,254,230));
				popcornPanel.setBackground(new Color(255,254,230));
				bvgPanel.setBackground(new Color(255,254,230));
			}
		});
	
		bvgBtn.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				bvgPanel.setBackground(new Color(255,185,141));
				
				comboPanel.setBackground(new Color(255,254,230));
				snackPanel.setBackground(new Color(255,254,230));
				popcornPanel.setBackground(new Color(255,254,230));
			}
		});
		
		comboPanel.setVisible(true);
		popcornPanel.setVisible(true);
		snackPanel.setVisible(true);
		bvgPanel.setVisible(true);
		
		add(comboPanel);
		add(popcornPanel);
		add(snackPanel);
		add(bvgPanel);
	}
}