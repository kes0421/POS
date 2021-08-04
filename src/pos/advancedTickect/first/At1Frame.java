package pos.advancedTickect.first;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class At1Frame extends JFrame{
	At1Panel1 at1P1;
	At1Panel2 at1P2;

	public At1Frame() {
		super("At1Frame");
		setBounds(100, 100, 700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		at1P1 = new At1Panel1(this);
		getContentPane().add(at1P1);
		setVisible(true);
	}


}
