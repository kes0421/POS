package movie.movieinfo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import movie.model.Movies;
import movie.model.Timetables;
import movie.peopleCheck_ui.PeopleCheck;
import movie.selectmovie.DBList;
import movie.selectmovie.SelectMovieMain;

public class BlackWidow implements ActionListener {
   
   JButton btn;
   
   ArrayList<Movies> movies = new DBList().moviesList();
   ArrayList<Timetables> timeTables = new DBList().timeTablesList();
   
   
   public BlackWidow(JButton btn) {
      this.btn = btn;
   }
   
   public void showInfo() {
      int pri=0;
      for(int i=0; i<timeTables.size(); i++) {
         if(timeTables.get(i).getM_code()==3 && timeTables.get(i).getT_start().equals(btn.getText())) {
            pri = i;
         }
      }
      
      SelectMovieMain.movie_name = movies.get(2).getM_name();
      SelectMovieMain.movie_start_time =  Integer.parseInt(timeTables.get(pri).getT_start().substring(0, 2));
      SelectMovieMain.time_code = timeTables.get(pri).getT_code();
      
      System.out.println(movies.get(2).getM_name());
      System.out.println(movies.get(2).getM_genre());
      System.out.println(movies.get(2).getM_grade());
      System.out.println(timeTables.get(pri).getT_name().getClass().getName());
      System.out.println(timeTables.get(pri).getT_start());
      System.out.println(timeTables.get(pri).getT_end());
      System.out.println();
      
      PeopleCheck.th_num_check = timeTables.get(pri).getT_name().charAt(0) - '0';
      PeopleCheck.time = timeTables.get(pri).getT_code();
      
   }
   
   public void actionPerformed(ActionEvent e) {
      showInfo();
      PeopleCheck frame = new PeopleCheck();
      frame.getContentPane().setBackground(new Color(0x404040));
      frame.setDefaultOptions();
      
   }   
}















