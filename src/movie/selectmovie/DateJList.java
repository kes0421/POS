package movie.selectmovie;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DateJList implements ListSelectionListener {
   JList list;
   String movieDate[];
   public static String selectedDate;   
   public static String movie_date = MakeMoviePanel.userDate;
   
   public JList dateList() {      
      SimpleDateFormat day = new SimpleDateFormat("yyyy-MM-dd");
      Calendar cal = Calendar.getInstance();
      
      movieDate = new String[8];      
      movieDate[0] = day.format(cal.getTime());
      for(int i=1; i<=7; i++) {
         cal.add(Calendar.DATE, i);
         movieDate[i] = day.format(cal.getTime());
         cal = Calendar.getInstance();
      }
      
      list = new JList(movieDate);
      list.setFont(new Font("±¼¸²", Font.BOLD,14));
      list.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
      //list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      list.addListSelectionListener(this);
      

      return list;
   }

   @Override
   public void valueChanged(ListSelectionEvent e) {
      selectedDate = (String)list.getSelectedValue();
      movie_date = ((String)list.getSelectedValue()).substring(5);

   }

}











