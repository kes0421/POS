package admin.view.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BarPanel extends JPanel{

	JLabel label;

	public BarPanel() {
		setBounds(0, 100, 1000, 70);
		setBackground(new Color(255,250,154));
		setLayout(null);

// width : ǰ���ڵ� 300 / ��ǰ�� 200 / ���� 100 / �ݾ� 200 / ���� 200 
		JLabel label1 = makeLabel("ǰ���ڵ�",0,0,300,70);
		add(label1);

		JLabel label2 = makeLabel("��ǰ��",300,0,200,70);
		add(label2);

		JLabel label3 = makeLabel("����(ea)",500,0,100,70);
		add(label3);

		JLabel label4 = makeLabel("�ݾ�(����)",600,0,200,70);
		add(label4);

		JLabel label5 = makeLabel("����",800,0,200,70);
		add(label5);
	}

	private JLabel makeLabel(String name, int x, int y, int width, int height) {
		label = new JLabel(name);
		label.setBounds(x, y, width, height);
		label.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setFont(new Font("Lucida Grande", Font.BOLD, 20));

		return label;
	}
	
	
}
