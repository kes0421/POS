package pos.advancedTicket.third;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class At3Label2 extends JLabel{
	public At3Label2() {
		super("아래에서 티켓을 확인해주세요");
		setHorizontalAlignment(SwingConstants.CENTER);
		setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		setForeground(Color.white);
		setBounds(62, 250, 564, 78);
	}
}
