package products.view.banner;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuTxTPanel extends JPanel{

	public MenuTxTPanel() {
		// �޴��� ���� �󺧺��� �г� 
		setBackground(new Color(255,254,230));
		setBounds(0, 114, 700, 29);
		setLayout(null);
		setVisible(true);

		// �޴��� 
		JLabel titleLabel = new JLabel("Popcorn Factory");
		titleLabel.setFont(new Font("�޸յձ�������", Font.BOLD | Font.ITALIC, 12));
		titleLabel.setBounds(279, 6, 107, 16);
		add(titleLabel);
	}
}