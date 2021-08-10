package products.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import css.RoundedButton;

public class NoPayFrame extends JFrame{

	public NoPayFrame() {
		
		setBounds(200,200,300,200);
		setLayout(null);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		setVisible(true);
		getContentPane().setBackground(new Color(255,254,230));
		
		JLabel msg = new JLabel("결제할 상품이 없습니다.");
		
		msg.setFont(new Font("굴림" , Font.BOLD , 20));
		msg.setBounds(22 , 8, 300, 80);
		add(msg);
		
		JButton okBtn = new RoundedButton("확 인");
		
		okBtn.setBounds(100, 100, 50, 50);
		
		okBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		add(okBtn);
		
	}
}
