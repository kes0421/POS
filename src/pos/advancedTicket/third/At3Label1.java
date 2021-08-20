package pos.advancedTicket.third;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class At3Label1 extends JLabel{
	
	public At3Label1() {
		super("티켓출력이 완료되었습니다");
		setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		setHorizontalAlignment(SwingConstants.CENTER);
		setForeground(Color.white);
		setBounds(131, 200, 424, 78);
	}
}
