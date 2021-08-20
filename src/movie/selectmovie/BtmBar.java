package movie.selectmovie;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import movie.view.MovieFrame1;
import pos.main.MainFrame;

public class BtmBar extends JPanel {   
   public BtmBar(JFrame frame) {
      setBackground(Color.darkGray);
      setLayout(null);
      setVisible(true);

      JButton homeBtn = new JButton();
      homeBtn.setBackground(Color.darkGray);
      homeBtn.setBounds(643, 0, 45, 45);
      homeBtn.setIcon(makeImageIcon("./img/At1Page/home_w.png"));
      add(homeBtn);
      
      homeBtn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new MainFrame().setVisible(true);
         }
      });

      JButton backBtn = new JButton();
      backBtn.setBackground(Color.darkGray);
      backBtn.setBounds(0, 0, 40, 45);
      backBtn.setIcon(makeImageIcon("./img/At1Page/p_w.png"));
      add(backBtn);
      
      backBtn.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            frame.dispose();
            new MovieFrame1().setVisible(true);
         }
      });
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