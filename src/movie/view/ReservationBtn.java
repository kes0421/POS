package movie.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import movie.model.Movies;
import movie.model.Timetables;
import movie.peopleCheck_ui.PeopleCheck;
import movie.selectmovie.DBList;
import movie.selectmovie.DateJList;
import movie.selectmovie.MakeMoviePanel;
import movie.selectmovie.SelectMovieMain;

public class ReservationBtn implements ActionListener{
   JButton btn;
   int index;
   int pri ;
   int mCode;

   ArrayList<Movies> movies = new DBList().moviesList();
   ArrayList<Timetables> timeTables = new DBList().timeTablesList();

   public ReservationBtn(JButton btn, int index) {
      this.btn = btn;
      this.index = index;
   }

   public void show() {
      MidPanel mp = new MidPanel();

      if(index==0) {
         for(int i=0; i< timeTables.size(); i++) {
            if(timeTables.get(i).getT_code().equals(mp.movies.get(index))) {
               pri = i;
               mCode = timeTables.get(i).getM_code();
            }
         }
      } else if(index==1) {
         for(int i=0; i< timeTables.size(); i++) {
            if(timeTables.get(i).getT_code().equals(mp.movies.get(index))) {
               pri = i;
               mCode = timeTables.get(i).getM_code();
            }
         }
      } else if(index==2) {
         for(int i=0; i< timeTables.size(); i++) {
            if(timeTables.get(i).getT_code().equals(mp.movies.get(index))) {
               pri = i;
               mCode = timeTables.get(i).getM_code();
            }
         }
      }

      SelectMovieMain.movie_name = movies.get(mCode).getM_name();
      SelectMovieMain.movie_start_time =  Integer.parseInt(timeTables.get(pri).getT_start().substring(0, 2));
      SelectMovieMain.time_code = timeTables.get(pri).getT_code();
      PeopleCheck.th_num_check = timeTables.get(pri).getT_name().charAt(0) - '0';
      PeopleCheck.time = timeTables.get(pri).getT_code();
      DateJList.movie_date = MakeMoviePanel.userDate.substring(5);
      
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      show();
      PeopleCheck.state = 1;
      PeopleCheck frame = new PeopleCheck();
      frame.getContentPane().setBackground(new Color(0x404040));
      frame.setDefaultOptions();
   }
}
