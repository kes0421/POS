package products.view.detail;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class Detail_P2_C extends JPanel{

	public Detail_P2_C() {
		LineBorder lineColor = new LineBorder(Color.LIGHT_GRAY);

		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 600, 99);
		setBorder(lineColor);
		setLayout(null);
		
		JLabel label1 = new JLabel("메뉴 이미지");
		label1.setBounds(6, 6, 94, 87);
		add(label1);

		JLabel label2 = new JLabel("메뉴 이름");
		label2.setFont(new Font("Lao MN", Font.BOLD | Font.ITALIC, 15));
		label2.setForeground(new Color(0, 0, 205));
		label2.setBounds(125, 20, 107, 30);
		add(label2);

		JLabel label3 = new JLabel("메뉴 가격");
		label3.setBounds(125, 62, 78, 31);
		add(label3);

		JButton btn1 = new JButton("-");
		btn1.setForeground(new Color(255, 0, 0));
		btn1.setBounds(324, 64, 46, 29);
		add(btn1);

		JButton btn2 = new JButton("+");
		btn2.setForeground(new Color(0, 0, 255));
		btn2.setBounds(421, 64, 46, 29);
		add(btn2);

		JLabel label4 = new JLabel("수량");
		label4.setBounds(382, 69, 32, 16);
		add(label4);

		JButton btn3 = new JButton("Delete");
		btn3.setForeground(new Color(255, 0, 0));
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setBounds(479, 36, 117, 29);
		add(btn3);
	}
}