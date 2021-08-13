package pos.admin.sales.second;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class S2Panel2 extends JPanel{
	JLabel l1, l2, l3;
	
	public S2Panel2() {
		setBounds(12, 85, 362, 134);
		setLayout(null);
		setBackground(Color.cyan);
		l1 = new JLabel("¿µ È­");
		l2 = new JLabel("¼ö·® : ");
		l3 = new JLabel("°¡°Ý : ");
		l1.setFont(new Font("±¼¸²", Font.PLAIN, 50));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(12, 10, 140, 114);
		
		l2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		l2.setBounds(164, 10, 93, 50);
		
		l3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		l3.setBounds(164, 70, 98, 50);
		
		add(l1);
		add(l2);
		add(l3);
	}
}
