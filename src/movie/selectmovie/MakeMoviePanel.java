package movie.selectmovie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import movie.model.Movies;
import movie.model.Timetables;
import movie.movieinfo.BlackWidow;
import movie.movieinfo.BossBaby2;
import movie.movieinfo.JungleCruise;
import movie.movieinfo.Method;
import movie.movieinfo.Mogadishu;

public class MakeMoviePanel {
   ArrayList<List> buttonList;
   ArrayList<Movies> movies;
   ArrayList<Timetables> timeTables;
   
   static Calendar cal = Calendar.getInstance();
   static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
   public static String userDate = sf.format(cal.getTime());
   
   public ArrayList moviePanel() {
      movies = new DBList().moviesList();
      timeTables = new DBList().timeTablesList();
      
      ArrayList<JPanel> main = new ArrayList<>();
      EmptyBorder line = new EmptyBorder(0,0,5,0);

      ArrayList<JLabel> posters = new ArrayList<>();
      for(int i=0; i<movies.size(); i++) {
         posters.add(new JLabel());
         posters.get(i).setBounds(0, 0, 150, 150);
         posters.get(i).setIcon(new ResizeImage().resizeImg(movies.get(i).getM_poster_img()));
      }
      
      ArrayList<JLabel> names = new ArrayList<>();
      for(int i=0; i<movies.size(); i++) {
         names.add(new JLabel());
         names.get(i).setBounds(30, 0, 250, 30);
         names.get(i).setFont(new Font("굴림", Font.BOLD,18));
         names.get(i).setForeground(Color.white);
         names.get(i).setText(movies.get(i).getM_name());
      }
      
      ArrayList<JPanel> mainPanel = new ArrayList<>();
      int panelHeight = 140;
      for(int i=0; i<movies.size(); i++) {
         mainPanel.add(new JPanel());
         main.add(new JPanel());
         mainPanel.get(i).setBounds(0, panelHeight, 650, 150);
         mainPanel.get(i).setBackground(Color.DARK_GRAY);
         mainPanel.get(i).setLayout(null);
         main.get(i).setLayout(new BorderLayout());
         main.get(i).setBorder(line);
         
         main.get(i).add(mainPanel.get(i),"Center");         
         main.get(i).add(posters.get(i), "West");
         mainPanel.get(i).add(names.get(i));         
         panelHeight+=170;
      }
      ArrayList<JButton> timeButtons = new ArrayList<>();
      buttonList = new ArrayList<>();
      int timeWidth = 0;
      int timeHeight = 50;
      int count = 0;
      int space = 0;
      boolean check = true;
      
      
      String date;         
      
      for(int i=0; i<movies.size();i++) {         
         timeButtons.clear();
         for(int j=0; j<timeTables.size();j++) {
            date = sf.format(timeTables.get(j).getT_date());
            if(movies.get(i).getM_code() == timeTables.get(j).getM_code() && userDate.equals(date)) {               
               timeButtons.add(new JButton());
               timeButtons.get(count).setBounds(timeWidth, timeHeight, 100, 30);
               timeButtons.get(count).setFont(new Font("굴림",Font.BOLD,13));
               timeButtons.get(count).setForeground(Color.white);
               timeButtons.get(count).setBorderPainted(false);
               timeButtons.get(count).setContentAreaFilled(false);
               timeButtons.get(count).setText(timeTables.get(j).getT_start());
               if(movies.get(i).getM_code()==1) {
                  timeButtons.get(count).addActionListener(new Mogadishu(timeButtons.get(count)));
               }else if(movies.get(i).getM_code()==2) {
                  timeButtons.get(count).addActionListener(new BossBaby2(timeButtons.get(count)));
               }else if(movies.get(i).getM_code()==3) {
                  timeButtons.get(count).addActionListener(new BlackWidow(timeButtons.get(count)));
               }else if(movies.get(i).getM_code()==4) {
                  timeButtons.get(count).addActionListener(new Method(timeButtons.get(count)));
               }else{
                  timeButtons.get(count).addActionListener(new JungleCruise(timeButtons.get(count)));
               }
               mainPanel.get(i).add(timeButtons.get(count));
               timeWidth += 60;
               count++;
               space++;
               if(space % 8 == 0 && check) {
                  timeWidth = 0;
                  timeHeight += 50;
                  check = false;
               }
               check = true;
            }
         }
         timeWidth = 0;
         timeHeight = 50;
         space = 0;
         count = 0;
         buttonList.add(timeButtons);
      }   
      return main;
   }
}