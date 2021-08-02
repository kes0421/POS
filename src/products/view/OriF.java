package products.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.CompoundBorder;

public class OriF extends JFrame{

	public OriF() {
		
		setBackground(Color.LIGHT_GRAY);
		setBounds(258, 230, 400, 400);
		setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(true);

		JLabel title = new JLabel("������ ǥ����");
		title.setFont(new Font("Lao MN", Font.BOLD, 15));
		title.setBounds(147, 18, 109, 26);
		add(title);

		String[] columnNames = {"����","������"};
		String[][] data = {
				{"����","������[�̱���]"},
				{"����","������[�̱���]"},
				{"�򷯽�","��[�̱���]"},
				{"�ֵ��� �ҽ���","�������[������]"},
				{"�����̽� �ҽ���","����[������]"},
				{"�ֵ��� ��","��[�̱���,ĳ���ٻ�]"},
				{"��¡�� ����","��¡��[ĥ����]"},
				{"��¡�� �ٸ�","��¡��[������]"},
				{"����ġŲ","�߰��[�±���]"},
				{"������","��¡��[����]"},
				{"��Ʈ��ġ��","ġ��[�̱���]"},
				{"������","������[�̱���]"}
				
		};

		JTable table = new JTable(data, columnNames);
		table.setBorder(new CompoundBorder());
		table.setCellSelectionEnabled(true);
		table.setEnabled(true);
		table.setRowHeight(25);
		table.setShowGrid(true);
		table.setFont(new Font("����", Font.PLAIN, 20));

		table.setBounds(38, 72, 330, 299);
		add(table);

		JLabel division = new JLabel("����");
		division.setBounds(100, 44, 61, 16);
		add(division);

		JLabel origin = new JLabel("������");
		origin.setBounds(260, 44, 61, 16);
		add(origin);
	}
}
