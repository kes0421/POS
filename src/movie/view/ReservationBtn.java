package movie.view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ReservationBtn extends JButton implements ActionListener{
	
	public ReservationBtn() {
		setText("예매 하기");
		setFont(new Font("Kannada MN", Font.BOLD, 15));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
