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
import movie.seatChoice_ui.th2_btn.Th2a_btn;
import movie.seatChoice_ui.th2_btn.Th2b_btn;
import movie.seatChoice_ui.th2_btn.Th2c_btn;
import movie.seatChoice_ui.th2_btn.Th2d_btn;
import movie.seatChoice_ui.th2_btn.Th2e_btn;
import movie.seatChoice_ui.th2_btn.Th2f_btn;
import movie.seatChoice_ui.th2_btn.Th2g_btn;
import movie.seatChoice_ui.th2_btn.Th2h_btn;
import movie.seatChoice_ui.th2_btn.Th2i_btn;
import movie.seatChoice_ui.th2_btn.Th2j_btn;
import movie.seatChoice_ui.th2_btn.Th2k_btn;
import movie.selectmovie.DBList;
import movie.selectmovie.SelectMovieMain;

public class SeatChoice_2 extends CgvFrame {

   public static boolean[] th2a_btn_selected = new boolean[15];
   public static boolean[] th2b_btn_selected = new boolean[15];
   public static boolean[] th2c_btn_selected = new boolean[15];
   public static boolean[] th2d_btn_selected = new boolean[15];
   public static boolean[] th2e_btn_selected = new boolean[15];
   public static boolean[] th2f_btn_selected = new boolean[15];
   public static boolean[] th2g_btn_selected = new boolean[15];
   public static boolean[] th2h_btn_selected = new boolean[15];
   public static boolean[] th2i_btn_selected = new boolean[15];
   public static boolean[] th2j_btn_selected = new boolean[15];
   public static boolean[] th2k_btn_selected = new boolean[15];
   
   public static boolean[] th2a_btn_soldout;
   public static boolean[] th2b_btn_soldout;
   public static boolean[] th2c_btn_soldout;
   public static boolean[] th2d_btn_soldout;
   public static boolean[] th2e_btn_soldout;
   public static boolean[] th2f_btn_soldout;
   public static boolean[] th2g_btn_soldout;
   public static boolean[] th2h_btn_soldout;
   public static boolean[] th2i_btn_soldout;
   public static boolean[] th2j_btn_soldout;
   public static boolean[] th2k_btn_soldout;

   public static int selected_cnt;
   public static int peoples;
   public static int disable_btn_cnt;
   
   static ArrayList<Seats> seats = new DBList().seatsList();


   public SeatChoice_2() {
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
      
      ArrayList<JButton> th2a_btn = new ArrayList<>();
      ArrayList<JButton> th2b_btn = new ArrayList<>();
      ArrayList<JButton> th2c_btn = new ArrayList<>();
      ArrayList<JButton> th2d_btn = new ArrayList<>();
      ArrayList<JButton> th2e_btn = new ArrayList<>();
      ArrayList<JButton> th2f_btn = new ArrayList<>();
      ArrayList<JButton> th2g_btn = new ArrayList<>();
      ArrayList<JButton> th2h_btn = new ArrayList<>();
      ArrayList<JButton> th2i_btn = new ArrayList<>();
      ArrayList<JButton> th2j_btn = new ArrayList<>();
      ArrayList<JButton> th2k_btn = new ArrayList<>();

      JButton back = new JButton("��");

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

      JButton complete = new JButton("�����ҷ���");

      peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;

      select.setBounds(570, 160, 20, 20);
      select.setBackground(new Color(0xFF3333));
      select.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      select_label.setText("����");
      select_label.setBounds(600, 160, 90, 20);
      select_label.setFont(new Font("����", Font.PLAIN, 15));
      select_label.setForeground(Color.white);

      sold_out.setBounds(570, 190, 20, 20);
      sold_out.setBackground(new Color(0xC0C0C0));
      sold_out.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      sold_out_label.setText("���ſϷ�");
      sold_out_label.setBounds(600, 190, 90, 20);
      sold_out_label.setFont(new Font("����", Font.PLAIN, 15));
      sold_out_label.setForeground(Color.white);

      light_zone.setBounds(570, 250, 20, 20);
      light_zone.setBackground(new Color(0xFFB266));
      light_zone.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      light_zone_label.setText("Light Zone");
      light_zone_label.setBounds(600, 250, 90, 20);
      light_zone_label.setFont(new Font("����", Font.PLAIN, 15));
      light_zone_label.setForeground(Color.white);

      normal.setBounds(570, 280, 20, 20);
      normal.setBackground(new Color(0x404040));
      normal.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      normal_label.setText("�Ϲݼ�");
      normal_label.setBounds(600, 280, 90, 20);
      normal_label.setFont(new Font("����", Font.PLAIN, 15));
      normal_label.setForeground(Color.white);

      disable.setBounds(570, 310, 20, 20);
      disable.setBackground(new Color(0x4C9900));
      disable.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      disable_label.setText("����μ�");
      disable_label.setBounds(600, 310, 90, 20);
      disable_label.setFont(new Font("����", Font.PLAIN, 15));
      disable_label.setForeground(Color.white);

      sweetBox.setBounds(570, 340, 20, 20);
      sweetBox.setBackground(new Color(0xFF66B2));
      sweetBox.setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      sweetBox_label.setText("SWEETBOX");
      sweetBox_label.setBounds(600, 340, 90, 20);
      sweetBox_label.setFont(new Font("����", Font.PLAIN, 15));
      sweetBox_label.setForeground(Color.white);

      complete.setBounds(200,600, 200, 40);
      complete.setBackground(new Color(0xFF3333));
      complete.setForeground(Color.white);
      complete.setFont(new Font("����", Font.BOLD, 20));
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
               label.setText("�����ο��� "+ peoples + "������ �����ϴ�.");
               label.setFont(new Font("����", Font.PLAIN|Font.BOLD, 30));
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

      for(int i = 0; i < 15 ;i++) {
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

      }

      int k = 31;

      for (int i = 0 ; i < 15; i++) {
         Th2a_btn Th2a_btns = new Th2a_btn(btns1, i);
         th2a_btn.add(Th2a_btns);
         Th2b_btn Th2b_btns = new Th2b_btn(btns2, i);
         th2b_btn.add(Th2b_btns);
         Th2c_btn Th2c_btns = new Th2c_btn(btns3, i);
         th2c_btn.add(Th2c_btns);
         Th2d_btn Th2d_btns = new Th2d_btn(btns4, i);
         th2d_btn.add(Th2d_btns);
         Th2e_btn Th2e_btns = new Th2e_btn(btns5, i);
         th2e_btn.add(Th2e_btns);
         Th2f_btn Th2f_btns = new Th2f_btn(btns6, i);
         th2f_btn.add(Th2f_btns);
         Th2g_btn Th2g_btns = new Th2g_btn(btns7, i);
         th2g_btn.add(Th2g_btns);
         Th2h_btn Th2h_btns = new Th2h_btn(btns8, i);
         th2h_btn.add(Th2h_btns);
         Th2i_btn Th2i_btns = new Th2i_btn(btns9, i);
         th2i_btn.add(Th2i_btns);
         Th2j_btn Th2j_btns = new Th2j_btn(btns10, i);
         th2j_btn.add(Th2j_btns);
         Th2k_btn Th2k_btns = new Th2k_btn(btns11, i);
         th2k_btn.add(Th2k_btns);

         if(i > 5 && i < 13) 
         {
            th2a_btn.get(i).setBounds(50 + k * (i + 1), 200  , 30 ,30);
            add(th2a_btn.get(i));

         }

         else if( i == 2 || i == 3)
         {
            th2a_btn.get(i).setBounds(50 + k * (i + 1), 200  , 30 ,30);
            th2a_btn.get(i).setBackground(new Color(0x4C9900));
            add(th2a_btn.get(i));
         }

         if (i > 1 && i < 13) 
         {
            th2b_btn.get(i).setBounds(50 + k * (i + 1), 230  , 30 ,30);
            add(th2b_btn.get(i));
            th2c_btn.get(i).setBounds(50 + k * (i + 1), 260  , 30 ,30);
            add(th2c_btn.get(i));
            th2d_btn.get(i).setBounds(50 + k * (i + 1), 290  , 30 ,30);
            add(th2d_btn.get(i));
            th2e_btn.get(i).setBounds(50 + k * (i + 1), 320  , 30 ,30);
            add(th2e_btn.get(i));
            th2f_btn.get(i).setBounds(50 + k * (i + 1), 350  , 30 ,30);
            add(th2f_btn.get(i));
            th2g_btn.get(i).setBounds(50 + k * (i + 1), 380  , 30 ,30);
            add(th2g_btn.get(i));
            th2h_btn.get(i).setBounds(50 + k * (i + 1), 410  , 30 ,30);
            add(th2h_btn.get(i));
            th2i_btn.get(i).setBounds(50 + k * (i + 1), 440  , 30 ,30);
            add(th2i_btn.get(i));
            th2j_btn.get(i).setBounds(50 + k * (i + 1), 470  , 30 ,30);
            add(th2j_btn.get(i));
            if(i != 12) 
            {
               th2k_btn.get(i).setBounds(50 + k * (i + 1), 500  , 30 ,30);
               add(th2k_btn.get(i));
            }
         }

         if(i == 0 || i == 1)
         {
            th2i_btn.get(i).setBounds(50 + k * i, 440  , 30 ,30);
            th2i_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th2i_btn.get(i));
            th2j_btn.get(i).setBounds(50 + k * i, 470  , 30 ,30);
            th2j_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th2j_btn.get(i));
            th2k_btn.get(i).setBounds(50 + k * i, 500  , 30 ,30);
            add(th2k_btn.get(i));

         }

      }
      
      th2a_btn_soldout = new boolean[15];
      th2b_btn_soldout = new boolean[15];
      th2c_btn_soldout = new boolean[15];
      th2d_btn_soldout = new boolean[15];
      th2e_btn_soldout = new boolean[15];
      th2f_btn_soldout = new boolean[15];
      th2g_btn_soldout = new boolean[15];
      th2h_btn_soldout = new boolean[15];
      th2i_btn_soldout = new boolean[15];
      th2j_btn_soldout = new boolean[15];
      th2k_btn_soldout = new boolean[15];
      
      for(int i = 0; i < seats.size(); i++) {
         if(PeopleCheck.time.equals(seats.get(i).getT_code()))
         {
            int number = Integer.parseInt(seats.get(i).getS_name().substring(1, 3));
            char seat_location = seats.get(i).getS_name().charAt(0);
            switch(seat_location) {
            
            case 'A':
               th2a_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2a_btn_soldout[number -1] = true;
               break;
               
            case 'B':
               th2b_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2b_btn_soldout[number -1] = true;
               break;
               
            case 'C':
               th2c_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2c_btn_soldout[number -1] = true;
               break;
               
            case 'D':
               th2d_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2d_btn_soldout[number -1] = true;
               break;
               
            case 'E':
               th2e_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2e_btn_soldout[number -1] = true;
               break;
               
            case 'F':
               th2f_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2f_btn_soldout[number -1] = true;
               break;
               
            case 'G':
               th2g_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2g_btn_soldout[number -1] = true;
               break;
               
            case 'H':
               th2h_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2h_btn_soldout[number -1] = true;
               break;
               
            case 'I':
               th2i_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2i_btn_soldout[number -1] = true;
               break;
               
            case 'J':
               th2j_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2j_btn_soldout[number -1] = true;
               break;
               
            case 'K':
               th2k_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th2k_btn_soldout[number -1] = true;
               break;
            }
      
         }
      }

      ad.setBounds(0, 0, 700, 100);
      ad.setBackground(Color.white);
      price.setBounds(0, 100, 700, 40);
      price.setBackground(Color.black);
      JLabel price_label = new JLabel();
      price_label.setText("�Ϲ�: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "�����: " + PeopleCheck.disable_cnt);
      price_label.setFont(new Font("����", Font.BOLD | Font.PLAIN, 20));
      price_label.setForeground(Color.white);
      
      price.add(price_label);
      label.setText("S C R E E N");
      label.setFont(new Font("����" , Font.BOLD, 20));
      label.setForeground(Color.WHITE);
      label.setBounds(250, 140, 700, 50);

      seat_a.setText("A");
      seat_a.setBounds(30, 200, 30, 30);
      seat_a.setFont(new Font("����", Font.BOLD, 20));
      seat_a.setForeground(Color.white);

      seat_b.setText("B");
      seat_b.setBounds(30, 230, 30, 30);
      seat_b.setFont(new Font("����", Font.BOLD, 20));
      seat_b.setForeground(Color.white);

      seat_c.setText("C");
      seat_c.setBounds(30, 260, 30, 30);
      seat_c.setFont(new Font("����", Font.BOLD, 20));
      seat_c.setForeground(Color.white);

      seat_d.setText("D");
      seat_d.setBounds(30, 290, 30, 30);
      seat_d.setFont(new Font("����", Font.BOLD, 20));
      seat_d.setForeground(Color.white);

      seat_e.setText("E");
      seat_e.setBounds(30, 320, 30, 30);
      seat_e.setFont(new Font("����", Font.BOLD, 20));
      seat_e.setForeground(Color.white);

      seat_f.setText("F");
      seat_f.setBounds(30, 350, 30, 30);
      seat_f.setFont(new Font("����", Font.BOLD, 20));
      seat_f.setForeground(Color.white);

      seat_g.setText("G");
      seat_g.setBounds(30, 380, 30, 30);
      seat_g.setFont(new Font("����", Font.BOLD, 20));
      seat_g.setForeground(Color.white);

      seat_h.setText("H");
      seat_h.setBounds(30, 410, 30, 30);
      seat_h.setFont(new Font("����", Font.BOLD, 20));
      seat_h.setForeground(Color.white);

      seat_i.setText("I");
      seat_i.setBounds(30, 440, 30, 30);
      seat_i.setFont(new Font("����", Font.BOLD, 20));
      seat_i.setForeground(Color.white);

      seat_j.setText("J");
      seat_j.setBounds(30, 470, 30, 30);
      seat_j.setFont(new Font("����", Font.BOLD, 20));
      seat_j.setForeground(Color.white);

      seat_k.setText("K");
      seat_k.setBounds(30, 500, 30, 30);
      seat_k.setFont(new Font("����", Font.BOLD, 20));
      seat_k.setForeground(Color.white);

      back.setBounds(10, 140, 50, 50);
      back.setForeground(Color.white);
      back.setBackground(new Color(0x606060));
      back.setFont(new Font("����", Font.BOLD, 45));
      back.setBorder(BorderFactory.createLineBorder(new Color(0x404040)));
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            SelectMovieMain.frame.setDefaultOptions();

            for(int i = 0; i < th2a_btn_selected.length; i++) {
               if(th2a_btn_selected[i]) 
               {
                  th2a_btn.get(i).doClick();
               }
               if(th2b_btn_selected[i])
               {
                  th2b_btn.get(i).doClick();
               }
               if(th2c_btn_selected[i]) 
               {
                  th2c_btn.get(i).doClick();
               }
               if(th2d_btn_selected[i]) 
               {
                  th2d_btn.get(i).doClick();
               }
               if(th2e_btn_selected[i]) 
               {
                  th2e_btn.get(i).doClick();
               }
               if(th2f_btn_selected[i]) 
               {
                  th2f_btn.get(i).doClick();
               }
               if(th2g_btn_selected[i]) 
               {
                  th2g_btn.get(i).doClick();
               }
               if(th2h_btn_selected[i]) 
               {
                  th2h_btn.get(i).doClick();
               }
               if(th2i_btn_selected[i]) 
               {
                  th2i_btn.get(i).doClick();
               }
               if(th2j_btn_selected[i]) 
               {
                  th2j_btn.get(i).doClick();
               }
               if(th2k_btn_selected[i])
               {
                  th2k_btn.get(i).doClick();
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

      add(label2);
   }
   public static void main(String[] args) {
      SeatChoice_2 frame = new SeatChoice_2();
      frame.setDefaultOptions();
      frame.getContentPane().setBackground(new Color(0x202020));
   }
}
