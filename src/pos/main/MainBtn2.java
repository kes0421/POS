package pos.main;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class MainBtn2 extends JButton{	
	public MainBtn2(JFrame mainF) {
		super("예매티켓출력");
		setForeground(Color.white);
		setBackground(Color.black);
		setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 25));
		setBounds(253, 471, 192, 180);
		LineBorder lb = new LineBorder(Color.LIGHT_GRAY, 5, true);
		setBorder(lb);
		addActionListener(new MainBtn2Act(getText(), mainF));
		addMouseListener(new MainBtn2Act(getText(), mainF));
	}
}
