package products.view.pay;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class At3Label2 extends JLabel{
	public At3Label2() {
		super("아래서 영수증을 확인해주세요");
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("나눔 고딕", Font.PLAIN, 40));
		setForeground(Color.black);
		setBounds(62, 250, 564, 78);
	}
}
