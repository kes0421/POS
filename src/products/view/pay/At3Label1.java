package products.view.pay;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class At3Label1 extends JLabel{
	
	public At3Label1() {
		super("상품이 결제중입니다");
		setFont(new Font("나눔 고딕", Font.BOLD, 30));
		setHorizontalAlignment(SwingConstants.CENTER);
		setForeground(Color.black);
		setBounds(131, 200, 424, 78);
	}
}
