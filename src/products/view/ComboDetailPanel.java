package products.view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ComboDetailPanel extends JPanel{
	// �⺻���� �޺� ���̾ƿ� Ʋ // �� �޺����� ������� �������� ���ؾ��� 
	
	public ComboDetailPanel() {
		setBounds(0, 210, 700, 432);
		setLayout(null);
		setVisible(true);
		
		JScrollPane snackScroll = new JScrollPane();
		snackScroll.setBounds(301, 0, 233, 432);
		add(snackScroll);
		
		JLabel snackLabel = new JLabel("Select Snack");
		snackScroll.setColumnHeaderView(snackLabel);
		
		JScrollPane popcornScroll = new JScrollPane();
		popcornScroll.setBounds(0, 0, 302, 432);
		add(popcornScroll);
		
		JLabel popcornLabel = new JLabel("Select Popcorn");
		popcornScroll.setColumnHeaderView(popcornLabel);
		
		JScrollPane bvgScroll = new JScrollPane();
		bvgScroll.setBounds(534, 0, 166, 432);
		add(bvgScroll);
		
		JLabel bvgLabel = new JLabel("Select Beverage");
		bvgScroll.setColumnHeaderView(bvgLabel);
	}
}