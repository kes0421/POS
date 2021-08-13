package pos.advancedTicket.second;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import pos.advancedTicket.third.At3Frame;

public class At2Btn1 extends JButton implements ActionListener{
    JFrame at2Frame;

    public At2Btn1(JFrame at2Frame) {
        super("Æ¼ÄÏ Ãâ·Â");
        this.at2Frame = at2Frame;
        setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
        setBackground(Color.red);
        setForeground(Color.white);
        setBounds(170, 330, 150, 84);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        at2Frame.dispose();
        new At3Frame();
    }
}
