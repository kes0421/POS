package movie.seatChoice_ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import movie.CgvFrame;
import movie.model.Seats;
import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.th3_btn.Th3a_btn;
import movie.seatChoice_ui.th3_btn.Th3b_btn;
import movie.seatChoice_ui.th3_btn.Th3c_btn;
import movie.seatChoice_ui.th3_btn.Th3d_btn;
import movie.seatChoice_ui.th3_btn.Th3e_btn;
import movie.seatChoice_ui.th3_btn.Th3f_btn;
import movie.seatChoice_ui.th3_btn.Th3g_btn;
import movie.seatChoice_ui.th3_btn.Th3h_btn;
import movie.seatChoice_ui.th3_btn.Th3i_btn;
import movie.seatChoice_ui.th3_btn.Th3j_btn;
import movie.seatChoice_ui.th3_btn.Th3k_btn;
import movie.seatChoice_ui.th3_btn.Th3l_btn;
import movie.seatChoice_ui.th3_btn.Th3m_btn;
import movie.selectmovie.DBList;
import movie.selectmovie.SelectMovieMain;

public class SeatChoice_3 extends CgvFrame {

   public static boolean[] th3a_btn_selected = new boolean[16];
   public static boolean[] th3b_btn_selected = new boolean[16];
   public static boolean[] th3c_btn_selected = new boolean[16];
   public static boolean[] th3d_btn_selected = new boolean[16];
   public static boolean[] th3e_btn_selected = new boolean[16];
   public static boolean[] th3f_btn_selected = new boolean[16];
   public static boolean[] th3g_btn_selected = new boolean[16];
   public static boolean[] th3h_btn_selected = new boolean[16];
   public static boolean[] th3i_btn_selected = new boolean[16];
   public static boolean[] th3j_btn_selected = new boolean[16];
   public static boolean[] th3k_btn_selected = new boolean[16];
   public static boolean[] th3l_btn_selected = new boolean[16];
   public static boolean[] th3m_btn_selected = new boolean[16];
   
   public static boolean[] th3a_btn_soldout;
   public static boolean[] th3b_btn_soldout;
   public static boolean[] th3c_btn_soldout;
   public static boolean[] th3d_btn_soldout;
   public static boolean[] th3e_btn_soldout;
   public static boolean[] th3f_btn_soldout;
   public static boolean[] th3g_btn_soldout;
   public static boolean[] th3h_btn_soldout;
   public static boolean[] th3i_btn_soldout;
   public static boolean[] th3j_btn_soldout;
   public static boolean[] th3k_btn_soldout;
   public static boolean[] th3l_btn_soldout;
   public static boolean[] th3m_btn_soldout;

   public static int selected_cnt;
   public static int peoples;
   public static int disable_btn_cnt;
   
   static ArrayList<Seats> seats = new DBList().seatsList();

   public SeatChoice_3() {
      JPanel ad = new JPanel();
      JPanel price = new JPanel();
      JLabel label = new JLabel();
      JLabel label2 = new JLabel();

      JLabel seat_a = new JLabel();
      JLabel seat_b = new JLabel();
      JLabel seat_c = new JLabel();
      JLabel seat_d = new JLabel();
      JLabel seat_e = new JLabel();
      JLabel seat_f = new JLabel();
      JLabel seat_g = new JLabel();
      JLabel seat_h = new JLabel();
      JLabel seat_i = new JLabel();
      JLabel seat_j = new JLabel();
      JLabel seat_k = new JLabel();
      JLabel seat_l = new JLabel();
      JLabel seat_m = new JLabel();

      ArrayList<JButton> btns1 = new ArrayList<>();
      ArrayList<JButton> btns2 = new ArrayList<>();
      ArrayList<JButton> btns3 = new ArrayList<>();
      ArrayList<JButton> btns4 = new ArrayList<>();
      ArrayList<JButton> btns5 = new ArrayList<>();
      ArrayList<JButton> btns6 = new ArrayList<>();
      ArrayList<JButton> btns7 = new ArrayList<>();
      ArrayList<JButton> btns8 = new ArrayList<>();
      ArrayList<JButton> btns9 = new ArrayList<>();
      ArrayList<JButton> btns10 = new ArrayList<>();
      ArrayList<JButton> btns11 = new ArrayList<>();
      ArrayList<JButton> btns12 = new ArrayList<>();
      ArrayList<JButton> btns13 = new ArrayList<>();
      
      ArrayList<JButton> th3a_btn = new ArrayList<>();
      ArrayList<JButton> th3b_btn = new ArrayList<>();
      ArrayList<JButton> th3c_btn = new ArrayList<>();
      ArrayList<JButton> th3d_btn = new ArrayList<>();
      ArrayList<JButton> th3e_btn = new ArrayList<>();
      ArrayList<JButton> th3f_btn = new ArrayList<>();
      ArrayList<JButton> th3g_btn = new ArrayList<>();
      ArrayList<JButton> th3h_btn = new ArrayList<>();
      ArrayList<JButton> th3i_btn = new ArrayList<>();
      ArrayList<JButton> th3j_btn = new ArrayList<>();
      ArrayList<JButton> th3k_btn = new ArrayList<>();
      ArrayList<JButton> th3l_btn = new ArrayList<>();
      ArrayList<JButton> th3m_btn = new ArrayList<>();

      JButton back = new JButton("¡ç");

      JButton select = new JButton("");
      JLabel select_label = new JLabel();

      JButton sold_out = new JButton("");
      JLabel sold_out_label = new JLabel();

      JButton light_zone = new JButton("");
      JLabel light_zone_label = new JLabel();

      JButton normal = new JButton("");
      JLabel normal_label = new JLabel();

      JButton disable = new JButton("");
      JLabel disable_label = new JLabel();

      JButton sweetBox = new JButton("");
      JLabel sweetBox_label = new JLabel();

      JButton complete = new JButton("°áÁ¦ÇÒ·¡¿ä");

      peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;

      select.setBounds(570, 160, 20, 20);
      select.setBackground(new Color(0xFF3333));
      select.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      select_label.setText("¼±ÅÃ");
      select_label.setBounds(600, 160, 90, 20);
      select_label.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
      select_label.setForeground(Color.white);

      sold_out.setBounds(570, 190, 20, 20);
      sold_out.setBackground(new Color(0xC0C0C0));
      sold_out.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      sold_out_label.setText("¿¹¸Å¿Ï·á");
      sold_out_label.setBounds(600, 190, 90, 20);
      sold_out_label.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
      sold_out_label.setForeground(Color.white);

      light_zone.setBounds(570, 250, 20, 20);
      light_zone.setBackground(new Color(0xFFB266));
      light_zone.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      light_zone_label.setText("Light Zone");
      light_zone_label.setBounds(600, 250, 90, 20);
      light_zone_label.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
      light_zone_label.setForeground(Color.white);

      normal.setBounds(570, 280, 20, 20);
      normal.setBackground(new Color(0x404040));
      normal.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      normal_label.setText("ÀÏ¹Ý¼®");
      normal_label.setBounds(600, 280, 90, 20);
      normal_label.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
      normal_label.setForeground(Color.white);

      disable.setBounds(570, 310, 20, 20);
      disable.setBackground(new Color(0x4C9900));
      disable.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      disable_label.setText("Àå¾ÖÀÎ¼®");
      disable_label.setBounds(600, 310, 90, 20);
      disable_label.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
      disable_label.setForeground(Color.white);

      sweetBox.setBounds(570, 340, 20, 20);
      sweetBox.setBackground(new Color(0xFF66B2));
      sweetBox.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      sweetBox_label.setText("SWEETBOX");
      sweetBox_label.setBounds(600, 340, 90, 20);
      sweetBox_label.setFont(new Font("µ¸¿ò", Font.PLAIN, 15));
      sweetBox_label.setForeground(Color.white);

      complete.setBounds(200,600, 200, 40);
      complete.setBackground(new Color(0xFF3333));
      complete.setForeground(Color.white);
      complete.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      complete.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      complete.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            if(peoples == selected_cnt)
            {

            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("¼±ÅÃÀÎ¿øÀÌ "+ peoples + "¸íº¸´Ù Àû½À´Ï´Ù.");
               label.setFont(new Font("µ¸¿ò", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }
      });

      add(select);
      add(sold_out);
      add(light_zone);
      add(normal);
      add(disable);
      add(sweetBox);
      add(complete);

      add(select_label);
      add(sold_out_label);
      add(light_zone_label);
      add(normal_label);
      add(disable_label);
      add(sweetBox_label);

      for(int i = 0; i < 16 ;i++) {
         btns1.clear();
         btns1.add(new JButton());
         btns2.add(new JButton());
         btns3.add(new JButton());
         btns4.add(new JButton());
         btns5.add(new JButton());
         btns6.add(new JButton());
         btns7.add(new JButton());
         btns8.add(new JButton());
         btns9.add(new JButton());
         btns10.add(new JButton());
         btns11.add(new JButton());
         btns12.add(new JButton());
         btns13.add(new JButton());
      }

      int k = 31;

      for (int i = 0 ; i < 16; i++) {
         Th3a_btn Th3a_btns = new Th3a_btn(btns1, i);
         th3a_btn.add(Th3a_btns);
         Th3b_btn Th3b_btns = new Th3b_btn(btns2, i);
         th3b_btn.add(Th3b_btns);
         Th3c_btn Th3c_btns = new Th3c_btn(btns3, i);
         th3c_btn.add(Th3c_btns);
         Th3d_btn Th3d_btns = new Th3d_btn(btns4, i);
         th3d_btn.add(Th3d_btns);
         Th3e_btn Th3e_btns = new Th3e_btn(btns5, i);
         th3e_btn.add(Th3e_btns);
         Th3f_btn Th3f_btns = new Th3f_btn(btns6, i);
         th3f_btn.add(Th3f_btns);
         Th3g_btn Th3g_btns = new Th3g_btn(btns7, i);
         th3g_btn.add(Th3g_btns);
         Th3h_btn Th3h_btns = new Th3h_btn(btns8, i);
         th3h_btn.add(Th3h_btns);
         Th3i_btn Th3i_btns = new Th3i_btn(btns9, i);
         th3i_btn.add(Th3i_btns);
         Th3j_btn Th3j_btns = new Th3j_btn(btns10, i);
         th3j_btn.add(Th3j_btns);
         Th3k_btn Th3k_btns = new Th3k_btn(btns11, i);
         th3k_btn.add(Th3k_btns);
         Th3l_btn Th3l_btns = new Th3l_btn(btns12, i);
         th3l_btn.add(Th3l_btns);
         Th3m_btn Th3m_btns = new Th3m_btn(btns13, i);
         th3m_btn.add(Th3m_btns);

         if(i >= 0 && i < 10) 
         {
            th3a_btn.get(i).setBounds(50 + k * i , 200  , 30 ,30);
            add(th3a_btn.get(i));
         }

         else if( i == 12 || i == 13)
         {
            th3a_btn.get(i).setBounds(50 + k * i , 200  , 30 ,30);
            th3a_btn.get(i).setBackground(new Color(0x4C9900));
            add(th3a_btn.get(i));
         }

         if (i >= 0 && i < 14) 
         {
            th3b_btn.get(i).setBounds(50 + k * i , 230  , 30 ,30);
            add(th3b_btn.get(i));
            th3c_btn.get(i).setBounds(50 + k * i, 260  , 30 ,30);
            add(th3c_btn.get(i));
            th3d_btn.get(i).setBounds(50 + k * i , 290  , 30 ,30);
            add(th3d_btn.get(i));
            th3e_btn.get(i).setBounds(50 + k * i , 320  , 30 ,30);
            add(th3e_btn.get(i));
            th3f_btn.get(i).setBounds(50 + k * i , 350  , 30 ,30);
            add(th3f_btn.get(i));
         }

         if(i > 1 && i < 14)
         {
            th3g_btn.get(i).setBounds(50 + k * i , 380  , 30 ,30);
            add(th3g_btn.get(i));
            th3h_btn.get(i).setBounds(50 + k * i , 410  , 30 ,30);
            add(th3h_btn.get(i));
            th3i_btn.get(i).setBounds(50 + k * i , 440  , 30 ,30);
            add(th3i_btn.get(i));
            th3j_btn.get(i).setBounds(50 + k * i , 470  , 30 ,30);
            add(th3j_btn.get(i));
            th3k_btn.get(i).setBounds(50 + k * i , 500  , 30 ,30);
            add(th3k_btn.get(i));
            th3l_btn.get(i).setBounds(50 + k * i , 530  , 30 ,30);
            add(th3l_btn.get(i));
            th3m_btn.get(i).setBounds(50 + k * i, 560  , 30 ,30);
            add(th3m_btn.get(i));
         }

         if(i == 14 || i == 15)
         {
            th3k_btn.get(i).setBounds(50 + k * (i + 1), 500  , 30 ,30);
            th3k_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th3k_btn.get(i));
            th3l_btn.get(i).setBounds(50 + k * (i + 1), 530  , 30 ,30);
            th3l_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th3l_btn.get(i));
            th3m_btn.get(i).setBounds(50 + k * (i + 1), 560  , 30 ,30);
            add(th3m_btn.get(i));
         }
      }
      
      th3a_btn_soldout = new boolean[16];
      th3b_btn_soldout = new boolean[16];
      th3c_btn_soldout = new boolean[16];
      th3d_btn_soldout = new boolean[16];
      th3e_btn_soldout = new boolean[16];
      th3f_btn_soldout = new boolean[16];
      th3g_btn_soldout = new boolean[16];
      th3h_btn_soldout = new boolean[16];
      th3i_btn_soldout = new boolean[16];
      th3j_btn_soldout = new boolean[16];
      th3k_btn_soldout = new boolean[16];
      th3l_btn_soldout = new boolean[16];
      th3m_btn_soldout = new boolean[16];
      
      for(int i = 0; i < seats.size(); i++) {
         if(PeopleCheck.time.equals(seats.get(i).getT_code()))
         {
            int number = Integer.parseInt(seats.get(i).getS_name().substring(1, 3));
            char seat_location = seats.get(i).getS_name().charAt(0);
            switch(seat_location) {
            
            case 'A':
               th3a_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3a_btn_soldout[number -1] = true;
               break;
               
            case 'B':
               th3b_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3b_btn_soldout[number -1] = true;
               break;
               
            case 'C':
               th3c_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3c_btn_soldout[number -1] = true;
               break;
               
            case 'D':
               th3d_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3d_btn_soldout[number -1] = true;
               break;
               
            case 'E':
               th3e_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3e_btn_soldout[number -1] = true;
               break;
               
            case 'F':
               th3f_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3f_btn_soldout[number -1] = true;
               break;
               
            case 'G':
               th3g_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3g_btn_soldout[number -1] = true;
               break;
               
            case 'H':
               th3h_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3h_btn_soldout[number -1] = true;
               break;
               
            case 'I':
               th3i_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3i_btn_soldout[number -1] = true;
               break;
               
            case 'J':
               th3j_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3j_btn_soldout[number -1] = true;
               break;
               
            case 'K':
               th3k_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3k_btn_soldout[number -1] = true;
               break;
            
            case 'L':
               th3l_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3l_btn_soldout[number -1] = true;
               break;
               
            case 'M':
               th3m_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th3m_btn_soldout[number -1] = true;
               break;
            }
            
         }
      }

      ad.setBounds(0, 0, 700, 100);
      ad.setBackground(Color.white);
      price.setBounds(0, 100, 700, 40);
      price.setBackground(Color.black);
      JLabel price_label = new JLabel();
      price_label.setText("ÀÏ¹Ý: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "Àå¾ÖÀÎ: " + PeopleCheck.disable_cnt);
      price_label.setFont(new Font("°íµñ", Font.BOLD | Font.PLAIN, 20));
      price_label.setForeground(Color.white);
      
      price.add(price_label);
      label.setText("S C R E E N");
      label.setFont(new Font("µ¸¿ò" , Font.BOLD, 20));
      label.setForeground(Color.WHITE);
      label.setBounds(250, 140, 700, 50);

      seat_a.setText("A");
      seat_a.setBounds(30, 200, 30, 30);
      seat_a.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_a.setForeground(Color.white);

      seat_b.setText("B");
      seat_b.setBounds(30, 230, 30, 30);
      seat_b.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_b.setForeground(Color.white);

      seat_c.setText("C");
      seat_c.setBounds(30, 260, 30, 30);
      seat_c.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_c.setForeground(Color.white);

      seat_d.setText("D");
      seat_d.setBounds(30, 290, 30, 30);
      seat_d.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_d.setForeground(Color.white);

      seat_e.setText("E");
      seat_e.setBounds(30, 320, 30, 30);
      seat_e.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_e.setForeground(Color.white);

      seat_f.setText("F");
      seat_f.setBounds(30, 350, 30, 30);
      seat_f.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_f.setForeground(Color.white);

      seat_g.setText("G");
      seat_g.setBounds(30, 380, 30, 30);
      seat_g.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_g.setForeground(Color.white);

      seat_h.setText("H");
      seat_h.setBounds(30, 410, 30, 30);
      seat_h.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_h.setForeground(Color.white);

      seat_i.setText("I");
      seat_i.setBounds(30, 440, 30, 30);
      seat_i.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_i.setForeground(Color.white);

      seat_j.setText("J");
      seat_j.setBounds(30, 470, 30, 30);
      seat_j.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_j.setForeground(Color.white);

      seat_k.setText("K");
      seat_k.setBounds(30, 500, 30, 30);
      seat_k.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_k.setForeground(Color.white);

      seat_l.setText("L");
      seat_l.setBounds(30, 530, 30, 30);
      seat_l.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_l.setForeground(Color.white);

      seat_m.setText("M");
      seat_m.setBounds(30, 560, 30, 30);
      seat_m.setFont(new Font("µ¸¿ò", Font.BOLD, 20));
      seat_m.setForeground(Color.white);

      back.setBounds(10, 140, 50, 50);
      back.setForeground(Color.white);
      back.setBackground(new Color(0x606060));
      back.setFont(new Font("µ¸¿ò", Font.BOLD, 45));
      back.setBorder(BorderFactory.createLineBorder(new Color(0x404040)));
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            
            SelectMovieMain.frame.setDefaultOptions();

            for(int i = 0; i < th3a_btn_selected.length; i++) {
               if(th3a_btn_selected[i]) 
               {
                  th3a_btn.get(i).doClick();
               }
               if(th3b_btn_selected[i])
               {
                  th3b_btn.get(i).doClick();
               }
               if(th3c_btn_selected[i]) 
               {
                  th3c_btn.get(i).doClick();
               }
               if(th3d_btn_selected[i]) 
               {
                  th3d_btn.get(i).doClick();
               }
               if(th3e_btn_selected[i]) 
               {
                  th3e_btn.get(i).doClick();
               }
               if(th3f_btn_selected[i]) 
               {
                  th3f_btn.get(i).doClick();
               }
               if(th3g_btn_selected[i]) 
               {
                  th3g_btn.get(i).doClick();
               }
               if(th3h_btn_selected[i]) 
               {
                  th3h_btn.get(i).doClick();
               }
               if(th3i_btn_selected[i]) 
               {
                  th3i_btn.get(i).doClick();
               }
               if(th3j_btn_selected[i]) 
               {
                  th3j_btn.get(i).doClick();
               }
               if(th3k_btn_selected[i])
               {
                  th3k_btn.get(i).doClick();
               }
               if(th3l_btn_selected[i]) 
               {
                  th3l_btn.get(i).doClick();
               }
               if(th3m_btn_selected[i])
               {
                  th3m_btn.get(i).doClick();
               }

            }

         }
      });

      add(ad);
      add(price);
      add(label);
      add(back);

      add(seat_a);
      add(seat_b);
      add(seat_c);
      add(seat_d);
      add(seat_e);
      add(seat_f);
      add(seat_g);
      add(seat_h);
      add(seat_i);
      add(seat_j);
      add(seat_k);
      add(seat_l);
      add(seat_m);

      add(label2);
   }
   public static void main(String[] args) {
      SeatChoice_3 frame = new SeatChoice_3();
      frame.setDefaultOptions();
      frame.getContentPane().setBackground(new Color(0x202020));
   }
}















