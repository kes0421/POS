package pos.login;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import pos.admin.first.Ad1Frame;

public class LBtn1 extends JButton implements ActionListener{
    static final String ID = "admin";
    static final String PW = "1234";
    TextField lT1;
    TextField lT2;
    JFrame lF;
    
    public LBtn1(TextField lT12, TextField lT2, JFrame lF) {
        super("Login");
        this.lT1 = lT12;
        this.lT2 = lT2;
        this.lF = lF;
        setBounds(87, 160, 125, 40);
        addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(lT1.getText().equals(ID) && lT2.getText().equals(PW)) {
            lF.dispose();
        	new Ad1Frame();
        }else {
            JOptionPane.showMessageDialog(null, "다시 입력해주세요.");
            lT1.setText("");
            lT2.setText("");
        }
    }
}