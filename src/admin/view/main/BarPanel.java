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

// width : 품목코드 300 / 상품명 200 / 수량 100 / 금액 200 / 관리 200 
		JLabel label1 = makeLabel("품목코드",0,0,300,70);
		add(label1);

		JLabel label2 = makeLabel("상품명",300,0,200,70);
		add(label2);

		JLabel label3 = makeLabel("수량(ea)",500,0,100,70);
		add(label3);

		JLabel label4 = makeLabel("금액(개당)",600,0,200,70);
		add(label4);

		JLabel label5 = makeLabel("관리",800,0,200,70);
		add(label5);
	}

	private JLabel makeLabel(String name, int x, int y, int width, int height) {
		label = new JLabel(name);
		label.setBounds(x, y, width, height);
		label.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));

		return label;
	}
	
}