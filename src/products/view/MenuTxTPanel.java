package products.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuTxTPanel extends JPanel{

	public MenuTxTPanel() {
		// �޴��� ���� �󺧺��� �г� 
		setBackground(Color.YELLOW);
		setBounds(0, 114, 700, 29);
		setLayout(null);
		setVisible(true);

		// �޴��� 
		JLabel titleLabel = new JLabel("Popcorn Factory");
		titleLabel.setFont(new Font("Mukta Mahee", Font.BOLD | Font.ITALIC, 15));
		titleLabel.setBounds(279, 6, 107, 16);
		add(titleLabel);
	}
}