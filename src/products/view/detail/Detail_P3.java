package products.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import css.RoundedButton;

public class Detail_P3 extends JPanel{
	
	JLabel label2;
	
	public Detail_P3(JFrame frame) {
		setBackground(new Color(255,254,230));
		setBounds(0, 448, 600, 124);
		setLayout(null);
		setVisible(true);
		
		JLabel label1 = new JLabel("총 결제금액");
		label1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label1.setForeground(new Color(87,149,255));
		label1.setBounds(20, 6, 153, 44);
		add(label1);

		label2 = new JLabel();
		label2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label2.setForeground(new Color(87,149,255));
		label2.setBounds(406, 6, 142, 44);
		add(label2);

		JButton preBtn = new RoundedButton("이 전");
		preBtn.setForeground(new Color(255, 0, 0));
		preBtn.setBounds(135, 62, 117, 56);
		preBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		add(preBtn);

		JButton nextBtn = new RoundedButton("다 음");
		nextBtn.setForeground(new Color(0, 0, 255));
		nextBtn.setBounds(325, 62, 117, 56);
		add(nextBtn);
	}
}