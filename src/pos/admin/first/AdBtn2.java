package pos.admin.first;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

public class AdBtn2 extends JButton{
   
   public AdBtn2(JFrame mainF) {
   setForeground(Color.white);
   setBackground(Color.black);
   setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 20));
   LineBorder lb = new LineBorder(Color.black,5,true);
   setBorder(lb);
   setBounds(200,100,150,150);
   setImageSize();
   addActionListener(new AdBtn2Act(mainF));
   addMouseListener(new AdBtn2Act(mainF));
}
   
   private void setImageSize() {
      ImageIcon icon = new ImageIcon("./img/Ad1Page/stock.jpg");
      Image img = icon.getImage();
      Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon newImc = new ImageIcon(newImg);
      this.setIcon(newImc);
   }
   
}