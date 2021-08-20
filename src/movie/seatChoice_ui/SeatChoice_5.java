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
import movie.seatChoice_ui.th5_btn.Th5a_btn;
import movie.seatChoice_ui.th5_btn.Th5b_btn;
import movie.seatChoice_ui.th5_btn.Th5c_btn;
import movie.seatChoice_ui.th5_btn.Th5d_btn;
import movie.seatChoice_ui.th5_btn.Th5e_btn;
import movie.seatChoice_ui.th5_btn.Th5f_btn;
import movie.seatChoice_ui.th5_btn.Th5g_btn;
import movie.seatChoice_ui.th5_btn.Th5h_btn;
import movie.seatChoice_ui.th5_btn.Th5i_btn;
import movie.seatChoice_ui.th5_btn.Th5j_btn;
import movie.seatChoice_ui.th5_btn.Th5k_btn;
import movie.seatChoice_ui.th5_btn.Th5l_btn;
import movie.seatChoice_ui.th5_btn.Th5m_btn;
import movie.seatChoice_ui.th_payment_btn.Th5_payment_btn;
import movie.selectmovie.DBList;
import movie.selectmovie.DateSelectButton;
import movie.selectmovie.SelectMovieMain;
import pos.advancedTicket.third.At3Frame;

public class SeatChoice_5 extends CgvFrame {
   
    public static ArrayList<JButton> th5a_btn = new ArrayList<>();
    public static ArrayList<JButton> th5b_btn = new ArrayList<>();
    public static ArrayList<JButton> th5c_btn = new ArrayList<>();
    public static ArrayList<JButton> th5d_btn = new ArrayList<>();
    public static ArrayList<JButton> th5e_btn = new ArrayList<>();
    public static ArrayList<JButton> th5f_btn = new ArrayList<>();
    public static ArrayList<JButton> th5g_btn = new ArrayList<>();
    public static ArrayList<JButton> th5h_btn = new ArrayList<>();
    public static ArrayList<JButton> th5i_btn = new ArrayList<>();
    public static ArrayList<JButton> th5j_btn = new ArrayList<>();
    public static ArrayList<JButton> th5k_btn = new ArrayList<>();
    public static ArrayList<JButton> th5l_btn = new ArrayList<>();
    public static ArrayList<JButton> th5m_btn = new ArrayList<>();

   public static boolean[] th5a_btn_selected = new boolean[16];
   public static boolean[] th5b_btn_selected = new boolean[16];
   public static boolean[] th5c_btn_selected = new boolean[16];
   public static boolean[] th5d_btn_selected = new boolean[16];
   public static boolean[] th5e_btn_selected = new boolean[16];
   public static boolean[] th5f_btn_selected = new boolean[16];
   public static boolean[] th5g_btn_selected = new boolean[16];
   public static boolean[] th5h_btn_selected = new boolean[16];
   public static boolean[] th5i_btn_selected = new boolean[16];
   public static boolean[] th5j_btn_selected = new boolean[16];
   public static boolean[] th5k_btn_selected = new boolean[16];
   public static boolean[] th5l_btn_selected = new boolean[16];
   public static boolean[] th5m_btn_selected = new boolean[16];
   
   public static boolean[] th5a_btn_soldout;
   public static boolean[] th5b_btn_soldout;
   public static boolean[] th5c_btn_soldout;
   public static boolean[] th5d_btn_soldout;
   public static boolean[] th5e_btn_soldout;
   public static boolean[] th5f_btn_soldout;
   public static boolean[] th5g_btn_soldout;
   public static boolean[] th5h_btn_soldout;
   public static boolean[] th5i_btn_soldout;
   public static boolean[] th5j_btn_soldout;
   public static boolean[] th5k_btn_soldout;
   public static boolean[] th5l_btn_soldout;
   public static boolean[] th5m_btn_soldout;
   
   public static int[] th5a_btn_price;
   public static int[] th5b_btn_price;
   public static int[] th5c_btn_price;
   public static int[] th5d_btn_price;
   public static int[] th5e_btn_price;
   public static int[] th5f_btn_price;
   public static int[] th5g_btn_price;
   public static int[] th5h_btn_price;
   public static int[] th5i_btn_price;
   public static int[] th5j_btn_price;
   public static int[] th5k_btn_price;
   public static int[] th5l_btn_price;
   public static int[] th5m_btn_price;
   
   public static String[] th5a_btn_name;
   public static String[] th5b_btn_name;
   public static String[] th5c_btn_name;
   public static String[] th5d_btn_name;
   public static String[] th5e_btn_name;
   public static String[] th5f_btn_name;
   public static String[] th5g_btn_name;
   public static String[] th5h_btn_name;
   public static String[] th5i_btn_name;
   public static String[] th5j_btn_name;
   public static String[] th5k_btn_name;
   public static String[] th5l_btn_name;
   public static String[] th5m_btn_name;

   public static int selected_cnt;
   public static int peoples;
   public static int disable_btn_cnt;
   public static int ticket_price;
   public static JLabel price_label;
   
   static ArrayList<Seats> seats = new DBList().seatsList();


   public SeatChoice_5() {
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
      


      JButton back = new JButton("←");

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

      selected_cnt = 0;
      peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;

      select.setBounds(570, 160, 20, 20);
      select.setBackground(new Color(0xFF3333));
      select.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      select_label.setText("선택");
      select_label.setBounds(600, 160, 90, 20);
      select_label.setFont(new Font("    ", Font.PLAIN, 15));
      select_label.setForeground(Color.white);

      sold_out.setBounds(570, 190, 20, 20);
      sold_out.setBackground(new Color(0xC0C0C0));
      sold_out.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      sold_out_label.setText("예매완료");
      sold_out_label.setBounds(600, 190, 90, 20);
      sold_out_label.setFont(new Font("    ", Font.PLAIN, 15));
      sold_out_label.setForeground(Color.white);


      light_zone.setBounds(570, 250, 20, 20);
      light_zone.setBackground(new Color(0xFFB266));
      light_zone.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      light_zone_label.setText("Light Zone");
      light_zone_label.setBounds(600, 250, 90, 20);
      light_zone_label.setFont(new Font("    ", Font.PLAIN, 15));
      light_zone_label.setForeground(Color.white);


      normal.setBounds(570, 280, 20, 20);
      normal.setBackground(new Color(0x404040));
      normal.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      normal_label.setText("일반석");
      normal_label.setBounds(600, 280, 90, 20);
      normal_label.setFont(new Font("    ", Font.PLAIN, 15));
      normal_label.setForeground(Color.white);


      disable.setBounds(570, 310, 20, 20);
      disable.setBackground(new Color(0x4C9900));
      disable.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      disable_label.setText("장애인석");
      disable_label.setBounds(600, 310, 90, 20);
      disable_label.setFont(new Font("    ", Font.PLAIN, 15));
      disable_label.setForeground(Color.white);


      sweetBox.setBounds(570, 340, 20, 20);
      sweetBox.setBackground(new Color(0xFF66B2));
      sweetBox.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      sweetBox_label.setText("SWEETBOX");
      sweetBox_label.setBounds(600, 340, 90, 20);
      sweetBox_label.setFont(new Font("    ", Font.PLAIN, 15));
      sweetBox_label.setForeground(Color.white);


      JButton btn = new JButton();
      Th5_payment_btn payment = new Th5_payment_btn(btn);
      payment.setBounds(200,600, 200, 40);
      


      add(select);
      add(sold_out);
      add(light_zone);
      add(normal);
      add(disable);
      add(sweetBox);
      add(payment);

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
         Th5a_btn Th5a_btns = new Th5a_btn(btns1, i);
         th5a_btn.add(Th5a_btns);
         Th5b_btn Th5b_btns = new Th5b_btn(btns2, i);
         th5b_btn.add(Th5b_btns);
         Th5c_btn Th5c_btns = new Th5c_btn(btns3, i);
         th5c_btn.add(Th5c_btns);
         Th5d_btn Th5d_btns = new Th5d_btn(btns4, i);
         th5d_btn.add(Th5d_btns);
         Th5e_btn Th5e_btns = new Th5e_btn(btns5, i);
         th5e_btn.add(Th5e_btns);
         Th5f_btn Th5f_btns = new Th5f_btn(btns6, i);
         th5f_btn.add(Th5f_btns);
         Th5g_btn Th5g_btns = new Th5g_btn(btns7, i);
         th5g_btn.add(Th5g_btns);
         Th5h_btn Th5h_btns = new Th5h_btn(btns8, i);
         th5h_btn.add(Th5h_btns);
         Th5i_btn Th5i_btns = new Th5i_btn(btns9, i);
         th5i_btn.add(Th5i_btns);
         Th5j_btn Th5j_btns = new Th5j_btn(btns10, i);
         th5j_btn.add(Th5j_btns);
         Th5k_btn Th5k_btns = new Th5k_btn(btns11, i);
         th5k_btn.add(Th5k_btns);
         Th5l_btn Th5l_btns = new Th5l_btn(btns12, i);
         th5l_btn.add(Th5l_btns);
         Th5m_btn Th5m_btns = new Th5m_btn(btns13, i);
         th5m_btn.add(Th5m_btns);


         if(i >= 0 && i < 10) 
         {
            th5a_btn.get(i).setBounds(50 + k * i , 200  , 30 ,30);
            add(th5a_btn.get(i));

         }

         else if( i == 12 || i == 13)
         {
            th5a_btn.get(i).setBounds(50 + k * i , 200  , 30 ,30);
            th5a_btn.get(i).setBackground(new Color(0x4C9900));
            add(th5a_btn.get(i));
         }

         if (i >= 0 && i < 14) 
         {
            th5b_btn.get(i).setBounds(50 + k * i , 230  , 30 ,30);
            add(th5b_btn.get(i));
            th5c_btn.get(i).setBounds(50 + k * i, 260  , 30 ,30);
            add(th5c_btn.get(i));
            th5d_btn.get(i).setBounds(50 + k * i , 290  , 30 ,30);
            add(th5d_btn.get(i));
            th5e_btn.get(i).setBounds(50 + k * i , 320  , 30 ,30);
            add(th5e_btn.get(i));
            th5f_btn.get(i).setBounds(50 + k * i , 350  , 30 ,30);
            add(th5f_btn.get(i));
         }

         if(i > 1 && i < 14)
         {
            th5g_btn.get(i).setBounds(50 + k * i , 380  , 30 ,30);
            add(th5g_btn.get(i));
            th5h_btn.get(i).setBounds(50 + k * i , 410  , 30 ,30);
            add(th5h_btn.get(i));
            th5i_btn.get(i).setBounds(50 + k * i , 440  , 30 ,30);
            add(th5i_btn.get(i));
            th5j_btn.get(i).setBounds(50 + k * i , 470  , 30 ,30);
            add(th5j_btn.get(i));
            th5k_btn.get(i).setBounds(50 + k * i , 500  , 30 ,30);
            add(th5k_btn.get(i));
            th5l_btn.get(i).setBounds(50 + k * i , 530  , 30 ,30);
            add(th5l_btn.get(i));
            th5m_btn.get(i).setBounds(50 + k * i, 560  , 30 ,30);
            add(th5m_btn.get(i));
         }

         if(i == 14 || i == 15)
         {
            th5k_btn.get(i).setBounds(50 + k * (i + 1), 500  , 30 ,30);
            th5k_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th5k_btn.get(i));
            th5l_btn.get(i).setBounds(50 + k * (i + 1), 530  , 30 ,30);
            th5l_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th5l_btn.get(i));
            th5m_btn.get(i).setBounds(50 + k * (i + 1), 560  , 30 ,30);
            add(th5m_btn.get(i));

         }

      }
      
      th5a_btn_soldout = new boolean[16];
      th5b_btn_soldout = new boolean[16];
      th5c_btn_soldout = new boolean[16];
      th5d_btn_soldout = new boolean[16];
      th5e_btn_soldout = new boolean[16];
      th5f_btn_soldout = new boolean[16];
      th5g_btn_soldout = new boolean[16];
      th5h_btn_soldout = new boolean[16];
      th5i_btn_soldout = new boolean[16];
      th5j_btn_soldout = new boolean[16];
      th5k_btn_soldout = new boolean[16];
      th5l_btn_soldout = new boolean[16];
      th5m_btn_soldout = new boolean[16];
      
      soldout_update();
      
      ad.setBounds(0, 0, 700, 100);
      ad.setBackground(new Color(0x202020));
      price.setBounds(0, 100, 700, 40);
      price.setBackground(Color.black);
      price_label = new JLabel();
      price_label.setText(" Ϲ : " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "     : " + PeopleCheck.disable_cnt + "              " + "가격: " + ticket_price);
      price_label.setFont(new Font("   ", Font.BOLD | Font.PLAIN, 20));
      price_label.setForeground(Color.white);
      
      th5a_btn_price = new int[16];
      th5b_btn_price = new int[16];
      th5c_btn_price = new int[16];
      th5d_btn_price = new int[16];
      th5e_btn_price = new int[16];
      th5f_btn_price = new int[16];
      th5g_btn_price = new int[16];
      th5h_btn_price = new int[16];
      th5i_btn_price = new int[16];
      th5j_btn_price = new int[16];
      th5k_btn_price = new int[16];
      th5l_btn_price = new int[16];
      th5m_btn_price = new int[16];
      
      if(DateSelectButton.day_of_week == 7 || DateSelectButton.day_of_week == 1)
      {
         for(int i = 0; i < 16; i++) {
            if(i < 10 || i == 12 || i == 13) 
            {
               th5a_btn_price[i] = 12000;
            }
            if(i < 14) 
            {
               th5b_btn_price[i] = 12000;
               th5c_btn_price[i] = 13000;
               th5d_btn_price[i] = 13000;
               th5e_btn_price[i] = 13000;
               th5f_btn_price[i] = 13000;
            }
            if( i > 1 && i < 14)
            {
               th5g_btn_price[i] = 13000;
               th5h_btn_price[i] = 13000;
               th5i_btn_price[i] = 13000;
               th5j_btn_price[i] = 13000;
               th5k_btn_price[i] = 13000;
               th5l_btn_price[i] = 13000;
            }
            if( i > 1 && i < 14)
            {
               th5m_btn_price[i] = 14000;
            }
            if (i == 14 || i == 15)
            {
               th5k_btn_price[i] = 14000;
               th5l_btn_price[i] = 14000;
               th5m_btn_price[i] = 14000;
            }
            
         }
      }
      else
      {
         if(SelectMovieMain.movie_start_time >= 6 && SelectMovieMain.movie_start_time <= 10 )
         {
             for(int i = 0; i < 16; i++) {
                if(i < 10 || i == 12 || i == 13) 
                {
                   th5a_btn_price[i] = 9000;
                }
                if(i < 14) 
                {
                   th5b_btn_price[i] = 9000;
                   th5c_btn_price[i] = 9000;
                   th5d_btn_price[i] = 9000;
                   th5e_btn_price[i] = 9000;
                   th5f_btn_price[i] = 9000;
                }
                if( i > 1 && i < 14)
                {
                   th5g_btn_price[i] = 9000;
                   th5h_btn_price[i] = 9000;
                   th5i_btn_price[i] = 9000;
                   th5j_btn_price[i] = 9000;
                   th5k_btn_price[i] = 9000;
                   th5l_btn_price[i] = 9000;
                }
                if( i > 1 && i < 14)
                {
                   th5m_btn_price[i] = 9000;
                }
                if (i == 14 || i == 15)
                {
                   th5k_btn_price[i] = 9000;
                   th5l_btn_price[i] = 9000;
                   th5m_btn_price[i] = 9000;
                }
                
             }
         }
         else
         {
             for(int i = 0; i < 16; i++) {
                if(i < 10 || i == 12 || i == 13) 
                {
                   th5a_btn_price[i] = 11000;
                }
                if(i < 14) 
                {
                   th5b_btn_price[i] = 11000;
                   th5c_btn_price[i] = 12000;
                   th5d_btn_price[i] = 12000;
                   th5e_btn_price[i] = 12000;
                   th5f_btn_price[i] = 12000;
                }
                if( i > 1 && i < 14)
                {
                   th5g_btn_price[i] = 12000;
                   th5h_btn_price[i] = 12000;
                   th5i_btn_price[i] = 12000;
                   th5j_btn_price[i] = 12000;
                   th5k_btn_price[i] = 12000;
                   th5l_btn_price[i] = 12000;
                }
                if( i > 1 && i < 14)
                {
                   th5m_btn_price[i] = 13000;
                }
                if (i == 14 || i == 15)
                {
                   th5k_btn_price[i] = 13000;
                   th5l_btn_price[i] = 13000;
                   th5m_btn_price[i] = 13000;
                }
                
             }
         }
      }
      
      th5a_btn_name = new String[16];
      th5b_btn_name = new String[16];
      th5c_btn_name = new String[16];
      th5d_btn_name = new String[16];
      th5e_btn_name = new String[16];
      th5f_btn_name = new String[16];
      th5g_btn_name = new String[16];
      th5h_btn_name = new String[16];
      th5i_btn_name = new String[16];
      th5j_btn_name = new String[16];
      th5k_btn_name = new String[16];
      th5l_btn_name = new String[16];
      th5m_btn_name = new String[16];
      
      for(int i = 0 ; i < 16; i++) {
         if(i < 10)
         {
            th5a_btn_name[i] = "Light Zone";
         }

         if ( i == 12 || i == 13)
         {
            th5a_btn_name[i] = "장애인석";
         }
         if(i < 14)
         {
            th5b_btn_name[i] = "Light Zone";
            th5c_btn_name[i] = "일반석";
            th5d_btn_name[i] = "일반석";
            th5e_btn_name[i] = "일반석";
            th5f_btn_name[i] = "일반석";

         }
         if( i > 1 && i < 14)
         {
            th5g_btn_name[i] = "일반석";
            th5h_btn_name[i] = "일반석";
            th5i_btn_name[i] = "일반석";
            th5j_btn_name[i] = "일반석";
            th5k_btn_name[i] = "일반석";
            th5l_btn_name[i] = "일반석";
         }

         if( i > 1 && i < 14)
         {
            th5m_btn_name[i] = "SWEETBOX";
         }
         if (i == 14 || i == 15)
         {
            th5k_btn_name[i] = "SWEETBOX";
            th5l_btn_name[i] = "SWEETBOX";
            th5m_btn_name[i] = "SWEETBOX";
         }

      }
      
      price.add(price_label);
      label.setText("S C R E E N");
      label.setFont(new Font("    " , Font.BOLD, 20));
      label.setForeground(Color.WHITE);
      label.setBounds(250, 140, 700, 50);


      seat_a.setText("A");
      seat_a.setBounds(30, 200, 30, 30);
      seat_a.setFont(new Font("    ", Font.BOLD, 20));
      seat_a.setForeground(Color.white);

      seat_b.setText("B");
      seat_b.setBounds(30, 230, 30, 30);
      seat_b.setFont(new Font("    ", Font.BOLD, 20));
      seat_b.setForeground(Color.white);

      seat_c.setText("C");
      seat_c.setBounds(30, 260, 30, 30);
      seat_c.setFont(new Font("    ", Font.BOLD, 20));
      seat_c.setForeground(Color.white);

      seat_d.setText("D");
      seat_d.setBounds(30, 290, 30, 30);
      seat_d.setFont(new Font("    ", Font.BOLD, 20));
      seat_d.setForeground(Color.white);

      seat_e.setText("E");
      seat_e.setBounds(30, 320, 30, 30);
      seat_e.setFont(new Font("    ", Font.BOLD, 20));
      seat_e.setForeground(Color.white);

      seat_f.setText("F");
      seat_f.setBounds(30, 350, 30, 30);
      seat_f.setFont(new Font("    ", Font.BOLD, 20));
      seat_f.setForeground(Color.white);

      seat_g.setText("G");
      seat_g.setBounds(30, 380, 30, 30);
      seat_g.setFont(new Font("    ", Font.BOLD, 20));
      seat_g.setForeground(Color.white);

      seat_h.setText("H");
      seat_h.setBounds(30, 410, 30, 30);
      seat_h.setFont(new Font("    ", Font.BOLD, 20));
      seat_h.setForeground(Color.white);

      seat_i.setText("I");
      seat_i.setBounds(30, 440, 30, 30);
      seat_i.setFont(new Font("    ", Font.BOLD, 20));
      seat_i.setForeground(Color.white);

      seat_j.setText("J");
      seat_j.setBounds(30, 470, 30, 30);
      seat_j.setFont(new Font("    ", Font.BOLD, 20));
      seat_j.setForeground(Color.white);

      seat_k.setText("K");
      seat_k.setBounds(30, 500, 30, 30);
      seat_k.setFont(new Font("    ", Font.BOLD, 20));
      seat_k.setForeground(Color.white);

      seat_l.setText("L");
      seat_l.setBounds(30, 530, 30, 30);
      seat_l.setFont(new Font("    ", Font.BOLD, 20));
      seat_l.setForeground(Color.white);

      seat_m.setText("M");
      seat_m.setBounds(30, 560, 30, 30);
      seat_m.setFont(new Font("    ", Font.BOLD, 20));
      seat_m.setForeground(Color.white);


      back.setBounds(10, 140, 50, 50);
      back.setForeground(Color.white);
      back.setBackground(new Color(0x606060));
      back.setFont(new Font("    ", Font.BOLD, 45));
      back.setBorder(BorderFactory.createLineBorder(new Color(0x404040)));
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();

            if (PeopleCheck.state == 1)
            {
                movie.view.MovieFrame1.movieFrame.setVisible(true);
            }
            else if(PeopleCheck.state == 2) 
            {
                movie.selectmovie.SelectMovieMain.frame.setDefaultOptions();

            }
            
            for(int i = 0; i < th5a_btn_selected.length; i++) {
               if(th5a_btn_selected[i]) 
               {
                  th5a_btn.get(i).doClick();
               }
               if(th5b_btn_selected[i])
               {
                  th5b_btn.get(i).doClick();
               }
               if(th5c_btn_selected[i]) 
               {
                  th5c_btn.get(i).doClick();
               }
               if(th5d_btn_selected[i]) 
               {
                  th5d_btn.get(i).doClick();
               }
               if(th5e_btn_selected[i]) 
               {
                  th5e_btn.get(i).doClick();
               }
               if(th5f_btn_selected[i]) 
               {
                  th5f_btn.get(i).doClick();
               }
               if(th5g_btn_selected[i]) 
               {
                  th5g_btn.get(i).doClick();
               }
               if(th5h_btn_selected[i]) 
               {
                  th5h_btn.get(i).doClick();
               }
               if(th5i_btn_selected[i]) 
               {
                  th5i_btn.get(i).doClick();
               }
               if(th5j_btn_selected[i]) 
               {
                  th5j_btn.get(i).doClick();
               }
               if(th5k_btn_selected[i])
               {
                  th5k_btn.get(i).doClick();
               }
               if(th5l_btn_selected[i]) 
               {
                  th5l_btn.get(i).doClick();
               }
               if(th5m_btn_selected[i])
               {
                  th5m_btn.get(i).doClick();
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
   
   public static void soldout_update() {
      
       for(int i = 0; i < th5a_btn_selected.length; i++) {
           if(th5a_btn_selected[i]) 
           {
              th5a_btn.get(i).doClick();
           }
           if(th5b_btn_selected[i])
           {
              th5b_btn.get(i).doClick();
           }
           if(th5c_btn_selected[i]) 
           {
              th5c_btn.get(i).doClick();
           }
           if(th5d_btn_selected[i]) 
           {
              th5d_btn.get(i).doClick();
           }
           if(th5e_btn_selected[i]) 
           {
              th5e_btn.get(i).doClick();
           }
           if(th5f_btn_selected[i]) 
           {
              th5f_btn.get(i).doClick();
           }
           if(th5g_btn_selected[i]) 
           {
              th5g_btn.get(i).doClick();
           }
           if(th5h_btn_selected[i]) 
           {
              th5h_btn.get(i).doClick();
           }
           if(th5i_btn_selected[i]) 
           {
              th5i_btn.get(i).doClick();
           }
           if(th5j_btn_selected[i]) 
           {
              th5j_btn.get(i).doClick();
           }
           if(th5k_btn_selected[i])
           {
              th5k_btn.get(i).doClick();
           }
           if(th5l_btn_selected[i]) 
           {
              th5l_btn.get(i).doClick();
           }
           if(th5m_btn_selected[i])
           {
              th5m_btn.get(i).doClick();
           }

        }
       seats = new DBList().seatsList();
       
       
       for(int i = 0; i < seats.size(); i++) {
           if(PeopleCheck.time.equals(seats.get(i).getT_code()))
           {
              int number = Integer.parseInt(seats.get(i).getS_name().substring(1, 3));
              char seat_location = seats.get(i).getS_name().charAt(0);
              switch(seat_location) {
              
              case 'A':
                 th5a_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5a_btn_soldout[number -1] = true;
                 break;
                 
              case 'B':
                 th5b_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5b_btn_soldout[number -1] = true;
                 break;
                 
              case 'C':
                 th5c_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5c_btn_soldout[number -1] = true;
                 break;
                 
              case 'D':
                 th5d_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5d_btn_soldout[number -1] = true;
                 break;
                 
              case 'E':
                 th5e_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5e_btn_soldout[number -1] = true;
                 break;
                 
              case 'F':
                 th5f_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5f_btn_soldout[number -1] = true;
                 break;
                 
              case 'G':
                 th5g_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5g_btn_soldout[number -1] = true;
                 break;
                 
              case 'H':
                 th5h_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5h_btn_soldout[number -1] = true;
                 break;
                 
              case 'I':
                 th5i_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5i_btn_soldout[number -1] = true;
                 break;
                 
              case 'J':
                 th5j_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5j_btn_soldout[number -1] = true;
                 break;
                 
              case 'K':
                 th5k_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5k_btn_soldout[number -1] = true;
                 break;
              
              case 'L':
                 th5l_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5l_btn_soldout[number -1] = true;
                 break;
                 
              case 'M':
                 th5m_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
                 th5m_btn_soldout[number -1] = true;
                 break;
              }
              
              
        
           }
        }

     }
      
   
   public static void main(String[] args) {
      SeatChoice_5 frame = new SeatChoice_5();
      frame.setDefaultOptions();
      frame.getContentPane().setBackground(new Color(0x202020));
   }}