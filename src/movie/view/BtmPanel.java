package movie.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class BtmPanel extends JPanel{
	static JButton btmBtn;
	public BtmPanel() {
		setBackground(new Color(128, 128, 128));
		setBounds(0, 569, 700, 52);
		setLayout(null);
		
		btmBtn = new JButton("전체 상영 시간표 보러갈래요 ");
		btmBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		btmBtn.setFont(new Font("Lantinghei SC", Font.BOLD, 22));
		btmBtn.setForeground(new Color(220, 220, 220));
		btmBtn.setBackground(Color.DARK_GRAY);
		btmBtn.setBounds(167, 6, 341, 40);
		add(btmBtn);
	}
}
