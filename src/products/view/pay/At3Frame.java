package products.view.pay;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import pos.main.MainFrame;

public class At3Frame extends JFrame{
	JPanel at3P;
	Timer tm;
	
	public At3Frame() {
		at3P = new At3Panel1();
		setBounds(0, 0, 700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBackground(Color.black);
		getContentPane().setLayout(null);
		getContentPane().add(at3P);
		setResizable(false);
		
		setVisible(true);
		setCount();
	}
	
	private void setCount() {
		tm = new Timer(5000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new MainFrame();
			}
		});
		tm.setRepeats(false);
		tm.start();
	}
	
}
