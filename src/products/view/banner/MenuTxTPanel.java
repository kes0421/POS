package products.view.banner;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuTxTPanel extends JPanel{

	public MenuTxTPanel() {
		// 메뉴바 위에 라벨붙힐 패널 
		setBackground(new Color(255,254,230));
		setBounds(0, 114, 700, 29);
		setLayout(null);
		setVisible(true);

		// 메뉴라벨 
		JLabel titleLabel = new JLabel("Popcorn Factory");
		titleLabel.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN | Font.ITALIC, 12));
		titleLabel.setBounds(279, 6, 107, 16);
		add(titleLabel);
	}
}