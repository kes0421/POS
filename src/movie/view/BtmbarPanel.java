package movie.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BtmbarPanel extends JPanel{
   static JButton goBackBtn;
   static JButton homeBtn ;
   public BtmbarPanel() {
      setBackground(new Color(128, 128, 128));
      setBounds(0, 620, 700, 52);
      setLayout(null);
      
      goBackBtn = new JButton();
      goBackBtn.setFont(new Font("Monaco", Font.BOLD, 13));
      goBackBtn.setBounds(6, 6, 45, 50);
      goBackBtn.setBackground(Color.gray);
      goBackBtn.setIcon(makeImageIcon("./img/At1Page/p_w.png"));
      add(goBackBtn);
      
      homeBtn = new JButton();
      homeBtn.setBounds(655, 6, 40, 50);
      homeBtn.setBackground(Color.gray);
      homeBtn.setIcon(makeImageIcon("./img/At1Page/home_b.png"));
      add(homeBtn);
   }
   
   private static ImageIcon homebtn(String path) {
      BufferedImage image;
      try {
         image = ImageIO.read(new File(path));
      } catch (IOException e) {
         e.printStackTrace();
         image = null;
      }
      
      return new ImageIcon(image.getScaledInstance(96,40, Image.SCALE_SMOOTH));
   }
   
   public static ImageIcon makeImageIcon(String path) {
      BufferedImage image;
      try {
         image = ImageIO.read(new File(path));
      } catch (IOException e) {
         e.printStackTrace();
         image = null;
      }

      return new ImageIcon(image.getScaledInstance(45, 50, Image.SCALE_SMOOTH));
   }
}