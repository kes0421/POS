package pos.advancedTicket.second;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import pos.main.MainFrame;

public class At2HBtn extends JButton implements ActionListener{
    JFrame At2F;

    public At2HBtn(JFrame At2F) {
        this.At2F = At2F;
        setBounds(595, 0, 91, 63);
        setBackground(Color.black);
        addActionListener(this);
        setImageSize();
        setBorder(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new MainFrame();
        At2F.setVisible(false);
    }

    private void setImageSize() {
        ImageIcon icon = new ImageIcon("./img/At1Page/home_w.png");
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        this.setIcon(newImc);
    }
}
