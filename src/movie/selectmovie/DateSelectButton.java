package movie.selectmovie;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DateSelectButton implements ActionListener{
   String date;
   public static int day_of_week;
   public static JButton dateButton;
   
   public JButton dateSelect() {
      dateButton = new JButton();
      dateButton.setBounds(210, 100, 30, 40);
      dateButton.setBackground(Color.darkGray);
      dateButton.setIcon(makeImageIcon("./image/movie/select1.png"));
      dateButton.setVisible(true);
      dateButton.addActionListener(this);
      
      return dateButton;
   }
   
   public void setDay() throws ParseException  {
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      Date day = format.parse(date);
      Calendar cal = Calendar.getInstance();
      cal.setTime(day);
      day_of_week = cal.get(Calendar.DAY_OF_WEEK);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      DateJList dl = new DateJList();
      date = dl.selectedDate;
      try {
         setDay();
      } catch (ParseException e1) {
         e1.printStackTrace();
      }
      
      MakeMoviePanel mmp = new MakeMoviePanel();
      mmp.userDate = dl.selectedDate;
      
      SelectMovieMain.frame.dispose();
      
      SelectMovieMain.frame = new SelectMovieMain();
      SelectMovieMain.frame.setDefaultOptions();   
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
