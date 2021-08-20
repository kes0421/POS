package movie.selectmovie;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import movie.CgvFrame;
import movie.peopleCheck_ui.PeopleCheck;

public class SelectMovieMain extends CgvFrame {
   public static SelectMovieMain frame;
   public static String movie_name;
   public static String time_code;
   public static int movie_start_time;

   public SelectMovieMain() {
      super();
      String[] slide = {"./image/movie/모가디슈포스터1.jpg","./image/movie/보스베이비2포스터.jpg","./image/movie/모가디슈포스터2.jpg","./image/movie/블랙위도우포스터.jpg","./image/movie/포스터1.jpg"};
      PeopleCheck.state = 2;
      getContentPane().setLayout(null);
      getContentPane().setBackground(Color.darkGray);

      JPanel main = new JPanel();
      main.setLayout(new GridLayout(0,1));


      JLabel adver = new ImageSlide(slide);
      getContentPane().add(adver);
      adver.setVisible(true);
      ImageSlide.tm.start();

      ArrayList<JPanel> movieInfo = new MakeMoviePanel().moviePanel();
      for(int i=0; i < movieInfo.size(); i++) {
         main.add(movieInfo.get(i));
      }
      JScrollPane dateScroll = new JScrollPane(new DateJList().dateList());
      getContentPane().add(dateScroll);
      dateScroll.setBounds(0, 100, 200, 40);
      dateScroll.setVisible(true);

      JButton listSelect = new DateSelectButton().dateSelect();
      getContentPane().add(listSelect);


      JScrollPane scroll = new JScrollPane(main);
      getContentPane().add(scroll);
      scroll.setBounds(0, 140, 700, 480);
      scroll.setVisible(true);

      BtmBar bar = new BtmBar(this);
      bar.setLayout(null);
      bar.setBounds(0, 620, 700, 80);
      getContentPane().add(bar);
      bar.setVisible(true);

      DateSelectButton sButton = new DateSelectButton();
      sButton.dateButton.addActionListener(new ActionListener() {         
         @Override
         public void actionPerformed(ActionEvent e) {
            SelectMovieMain.frame = new SelectMovieMain();
            SelectMovieMain.frame.setDefaultOptions();   
            dispose();
         }
      });


   }


   public static void main(String[] args) {
      frame = new SelectMovieMain();
      frame.setDefaultOptions();
   }
}

