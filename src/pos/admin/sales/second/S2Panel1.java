package pos.admin.sales.second;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class S2Panel1 extends JPanel{
	JLabel l;
	
	public S2Panel1(String date) {
		setBounds(12, 10, 362, 64);
		setLayout(null);
		l = new JLabel(date + "�ϸ���");
		l.setHorizontalAlignment(SwingConstants.CENTER);
		l.setFont(new Font("����", Font.PLAIN, 30));
		l.setBounds(12, 10, 338, 44);
		add(l);
	}
}
