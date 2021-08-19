package products.view.pay;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class At3Panel1 extends JPanel{
	JLabel at3L1, at3L2, at3L3, at3L4;
	
	public At3Panel1() {
		at3L1 = new At3Label1();
		at3L2 = new At3Label2();
		at3L3 = new At3Label3();
		at3L4 = new At3Label4();
		setBounds(0, 0, 686, 686);
		setLayout(null);
		setBackground(Color.white);
		add(at3L1);
		add(at3L2);
		add(at3L3);
		add(at3L4);
	}
}
