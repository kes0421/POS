package pos.advancedTicket.second;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import pos.advancedTicket.third.At3Frame;
import pos.button.TicketButton;

public class At2Btn1 extends TicketButton implements ActionListener,MouseListener{
	JFrame at2Frame;
	
	public At2Btn1(JFrame at2Frame) {
		super("티켓 출력");
		this.at2Frame = at2Frame;
		setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20)); 	 
		setBackground(Color.red);
		setForeground(Color.white);
		setBounds(170, 330, 150, 84);
		addActionListener(this);
		addMouseListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		at2Frame.setVisible(false);
		new At3Frame();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
        JButton b = (JButton)e.getSource();
        b.setBackground(Color.gray);
	}

	@Override
	public void mouseExited(MouseEvent e) {
	      JButton b = (JButton)e.getSource();
	      b.setBackground(Color.red);
		
	}
}
