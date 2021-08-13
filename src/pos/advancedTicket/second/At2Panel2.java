package pos.advancedTicket.second;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class At2Panel2 extends JPanel{
    JButton At2PBtn, At2HBtn;
    JFrame At2F;
    public At2Panel2(JFrame At2F) {
        this.At2F = At2F;
        setLayout(null);
        At2PBtn = new At2PBtn(At2F);
        At2HBtn = new At2HBtn(At2F);
        setBounds(0, 595, 686, 100);
        setBackground(Color.BLACK);
        add(At2PBtn);
        add(At2HBtn);
        setVisible(true);
    }
}