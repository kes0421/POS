package products.view.detail;

import java.awt.Color;

import javax.swing.JFrame;

public class DetailFrame extends JFrame{
	
	public DetailFrame() {
		setBackground(new Color(255, 255, 255));
		setBounds(0,0,600,600);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		
		Detail_P1 panel1 = new Detail_P1();
		Detail_P2 panel2 = new Detail_P2();
		Detail_P2_C panel2_1 = new Detail_P2_C();
		Detail_P3 panel3 = new Detail_P3();
		
		
		getContentPane().add(panel1);
		panel2.add(panel2_1);
		getContentPane().add(panel2);
		getContentPane().add(panel3);
	}
	
}