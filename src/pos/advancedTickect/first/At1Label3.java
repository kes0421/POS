package pos.advancedTickect.first;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class At1Label3 extends JLabel{
	
	public At1Label3() {
		super("뒷자리(11자리)를 입력해주세요.");
		setFont(new Font("굴림", Font.BOLD, 30));
		setHorizontalAlignment(SwingConstants.LEFT);
		setBounds(189, 166, 411, 65);
	}
}
