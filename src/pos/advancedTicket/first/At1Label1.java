package pos.advancedTicket.first;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class At1Label1 extends JLabel{
	
	public At1Label1() {
		super("예매번호");
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		setForeground(Color.white);
		setBounds(50, 25, 588, 106);
	}
}
