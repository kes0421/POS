package movie.view;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import movie.model.Movies;
import movie.model.Timetables;
import movie.selectmovie.DBList;

public class MidPanel extends JPanel  {
   ArrayList<Movies> moviesList = new DBList().moviesList();
   ArrayList<Timetables> timeTables = new DBList().timeTablesList();
   ArrayList<String> movies;
   
   public MidPanel() {
      setBackground(Color.GRAY);
      setBounds(0, 145, 700, 425);
      setLayout(null);

      String[] imgs = new String[3];
      String[] start = new String[3];
      String[] end = new String[3];

      SelectFastMovie sfm = new SelectFastMovie();

      movies = sfm.threeMovies(sfm.fastMovie());
      String fastMovies[] = new String[3];
      for (int i = 0; i < fastMovies.length; i++) {
         fastMovies[i] = movies.get(i);
      }

      for (int i = 0; i < fastMovies.length; i++) {
         if (fastMovies[i] == null) {
            start[i] = "시작 시간";
            end[i] = "종료 시간";
         } else {
            for (int j = 0; j < timeTables.size(); j++) {
               if (fastMovies[i].equals(timeTables.get(j).getT_code())) {
                  start[i] = timeTables.get(j).getT_start();
                  end[i] = timeTables.get(j).getT_end();
                  for (int k = 0; k < moviesList.size(); k++) {
                     if (timeTables.get(j).getM_code() == moviesList.get(k).getM_code()) {
                        if(moviesList.get(k).getM_code()==5) {
                           imgs[i] = moviesList.get(4).getM_poster_img();
                        }else {
                           imgs[i] = moviesList.get(k+1).getM_poster_img();
                        }
                     }
                  }
               }
            }
         }
      }

      MakeImg img1 = new MakeImg(imgs[0], 208, 312);
      img1.setBounds(16, 30, 208, 280);
      add(img1);

      MakeImg img2 = new MakeImg(imgs[1], 208, 312);
      img2.setBounds(244, 30, 208, 280);
      add(img2);

      MakeImg img3 = new MakeImg(imgs[2], 208, 312);
      img3.setBounds(473, 30, 208, 280);
      add(img3);

      MakeLabel startLabel1 = new MakeLabel("시작");
      startLabel1.setBounds(46, 333, 30, 16);
      add(startLabel1);

      MakeLabel endLabel1 = new MakeLabel("종료");
      endLabel1.setBounds(46, 357, 30, 16);
      add(endLabel1);

      JLabel startTime1 = new JLabel(start[0]);
      startTime1.setBounds(88, 333, 75, 16);
      add(startTime1);

      JLabel endTime1 = new JLabel(end[0]);
      endTime1.setBounds(88, 357, 75, 16);
      add(endTime1);

      MakeLabel startLabel2 = new MakeLabel("시작");
      startLabel2.setBounds(263, 333, 30, 16);
      add(startLabel2);

      MakeLabel endLabel2 = new MakeLabel("종료");
      endLabel2.setBounds(263, 357, 30, 16);
      add(endLabel2);

      JLabel startTime2 = new JLabel(start[1]);
      startTime2.setBounds(305, 333, 75, 16);
      add(startTime2);

      JLabel endTime2 = new JLabel(end[1]);
      endTime2.setBounds(305, 357, 75, 16);
      add(endTime2);

      MakeLabel startLabel3 = new MakeLabel("시작");
      startLabel3.setBounds(490, 333, 30, 16);
      add(startLabel3);

      MakeLabel endLabel3 = new MakeLabel("종료");
      endLabel3.setBounds(490, 357, 30, 16);
      add(endLabel3);

      JLabel startTime3 = new JLabel(start[2]);
      startTime3.setBounds(532, 333, 75, 16);
      add(startTime3);

      JLabel endTime3 = new JLabel(end[2]);
      endTime3.setBounds(532, 357, 75, 16);
      add(endTime3);

      ArrayList<JButton> reservation = new ArrayList<>();
      int x = 46;
      for(int i = 0; i < 3; i++) {
         reservation.add(new JButton());
         reservation.get(i).setBounds(x, 380, 117, 29);
         reservation.get(i).setText("예매 하기");
         reservation.get(i).setFont(new Font("Kannada MN", Font.BOLD, 15));
         reservation.get(i).addActionListener(new ReservationBtn(reservation.get(i),i));
         add(reservation.get(i));
         x += 220;
      }
   }

}
