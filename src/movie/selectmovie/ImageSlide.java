package movie.selectmovie;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class ImageSlide extends JLabel{
   public static Timer tm;
   int x = 0;
   String[] image_list;
   
   public ImageSlide(String[] image_list) {
      this.image_list = image_list;
      setBounds(0,0,700,100);
      setImageSize(image_list.length - 1);
      
      tm = new Timer(5000, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            setImageSize(x);
            x += 1;
            
            if (x >= image_list.length) {
               x = 0;
            }
         }
         
      });
   }
   
   public void setImageSize(int i) {
      ImageIcon icon = new ImageIcon(image_list[i]);
      Image img = icon.getImage();
      Image newImg = img.getScaledInstance(this.getWidth(), this.getHeight(), Image.SCALE_SMOOTH);
      ImageIcon newImc = new ImageIcon(newImg);
      this.setIcon(newImc);
   }
   
   
}
