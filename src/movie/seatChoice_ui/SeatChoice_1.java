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
import movie.model.Timetables;
import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.th1_btn.Th1a_btn;
import movie.seatChoice_ui.th1_btn.Th1b_btn;
import movie.seatChoice_ui.th1_btn.Th1c_btn;
import movie.seatChoice_ui.th1_btn.Th1d_btn;
import movie.seatChoice_ui.th1_btn.Th1e_btn;
import movie.seatChoice_ui.th1_btn.Th1f_btn;
import movie.seatChoice_ui.th1_btn.Th1g_btn;
import movie.seatChoice_ui.th1_btn.Th1h_btn;
import movie.seatChoice_ui.th1_btn.Th1i_btn;
import movie.seatChoice_ui.th1_btn.Th1j_btn;
import movie.seatChoice_ui.th1_btn.Th1k_btn;
import movie.seatChoice_ui.th1_btn.Th1l_btn;
import movie.seatChoice_ui.th1_btn.Th1m_btn;
import movie.selectmovie.DBList;

public class SeatChoice_1 extends CgvFrame {
   
   public static boolean[] th1a_btn_selected = new boolean[15];
   public static boolean[] th1b_btn_selected = new boolean[15];
   public static boolean[] th1c_btn_selected = new boolean[15];
   public static boolean[] th1d_btn_selected = new boolean[15];
   public static boolean[] th1e_btn_selected = new boolean[15];
   public static boolean[] th1f_btn_selected = new boolean[15];
   public static boolean[] th1g_btn_selected = new boolean[15];
   public static boolean[] th1h_btn_selected = new boolean[15];
   public static boolean[] th1i_btn_selected = new boolean[15];
   public static boolean[] th1j_btn_selected = new boolean[15];
   public static boolean[] th1k_btn_selected = new boolean[15];
   public static boolean[] th1l_btn_selected = new boolean[15];
   public static boolean[] th1m_btn_selected = new boolean[15];
   
   public static boolean[] th1a_btn_soldout;
   public static boolean[] th1b_btn_soldout;
   public static boolean[] th1c_btn_soldout;
   public static boolean[] th1d_btn_soldout;
   public static boolean[] th1e_btn_soldout;
   public static boolean[] th1f_btn_soldout;
   public static boolean[] th1g_btn_soldout;
   public static boolean[] th1h_btn_soldout;
   public static boolean[] th1i_btn_soldout;
   public static boolean[] th1j_btn_soldout;
   public static boolean[] th1k_btn_soldout;
   public static boolean[] th1l_btn_soldout;
   public static boolean[] th1m_btn_soldout;

   public static int selected_cnt;
   public static int peoples;
   public static int disable_btn_cnt;
   
   static ArrayList<Seats> seats = new DBList().seatsList();


   public SeatChoice_1() {
      
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
      
      ArrayList<JButton> th1a_btn = new ArrayList<>();
      ArrayList<JButton> th1b_btn = new ArrayList<>();
      ArrayList<JButton> th1c_btn = new ArrayList<>();
      ArrayList<JButton> th1d_btn = new ArrayList<>();
      ArrayList<JButton> th1e_btn = new ArrayList<>();
      ArrayList<JButton> th1f_btn = new ArrayList<>();
      ArrayList<JButton> th1g_btn = new ArrayList<>();
      ArrayList<JButton> th1h_btn = new ArrayList<>();
      ArrayList<JButton> th1i_btn = new ArrayList<>();
      ArrayList<JButton> th1j_btn = new ArrayList<>();
      ArrayList<JButton> th1k_btn = new ArrayList<>();
      ArrayList<JButton> th1l_btn = new ArrayList<>();
      ArrayList<JButton> th1m_btn = new ArrayList<>();
      
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
               // ���� ����â���� �Ѿ�� �ڵ�����
            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("�����ο��� "+ peoples + "���� �����ϴ�.");
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
         btns12.add(new JButton());
         btns13.add(new JButton());
         
         

      }

      int k = 31;

      for (int i = 0 ; i < 15; i++) {
         Th1a_btn Th1a_btns = new Th1a_btn(btns1, i);
         th1a_btn.add(Th1a_btns);
         Th1b_btn Th1b_btns = new Th1b_btn(btns2, i);
         th1b_btn.add(Th1b_btns);
         Th1c_btn Th1c_btns = new Th1c_btn(btns3, i);
         th1c_btn.add(Th1c_btns);
         Th1d_btn Th1d_btns = new Th1d_btn(btns4, i);
         th1d_btn.add(Th1d_btns);
         Th1e_btn Th1e_btns = new Th1e_btn(btns5, i);
         th1e_btn.add(Th1e_btns);
         Th1f_btn Th1f_btns = new Th1f_btn(btns6, i);
         th1f_btn.add(Th1f_btns);
         Th1g_btn Th1g_btns = new Th1g_btn(btns7, i);
         th1g_btn.add(Th1g_btns);
         Th1h_btn Th1h_btns = new Th1h_btn(btns8, i);
         th1h_btn.add(Th1h_btns);
         Th1i_btn Th1i_btns = new Th1i_btn(btns9, i);
         th1i_btn.add(Th1i_btns);
         Th1j_btn Th1j_btns = new Th1j_btn(btns10, i);
         th1j_btn.add(Th1j_btns);
         Th1k_btn Th1k_btns = new Th1k_btn(btns11, i);
         th1k_btn.add(Th1k_btns);
         Th1l_btn Th1l_btns = new Th1l_btn(btns12, i);
         th1l_btn.add(Th1l_btns);
         Th1m_btn Th1m_btns = new Th1m_btn(btns13, i);
         th1m_btn.add(Th1m_btns);
         
         if(i < 9) 
         {
            th1a_btn.get(i).setBounds(50 + k * i, 200  , 30 ,30);
            add(th1a_btn.get(i));
         }
         
         else if( i == 11 || i == 12)
         {
            th1a_btn.get(i).setBounds(50 + k * i, 200  , 30 ,30);
            th1a_btn.get(i).setBackground(new Color(0x4C9900));
            add(th1a_btn.get(i));
         }
         
         if (i < 13) 
         {
            th1b_btn.get(i).setBounds(50 + k * i, 230  , 30 ,30);
            add(th1b_btn.get(i));
            th1c_btn.get(i).setBounds(50 + k * i, 260  , 30 ,30);
            add(th1c_btn.get(i));
            th1d_btn.get(i).setBounds(50 + k * i, 290  , 30 ,30);
            add(th1d_btn.get(i));
            th1e_btn.get(i).setBounds(50 + k * i, 320  , 30 ,30);
            add(th1e_btn.get(i));
            th1f_btn.get(i).setBounds(50 + k * i, 350  , 30 ,30);
            add(th1f_btn.get(i));
            
         }
         
         if(i > 1 && i < 13)
         {
            th1g_btn.get(i).setBounds(50 + k * i, 380  , 30 ,30);
            add(th1g_btn.get(i));
            th1h_btn.get(i).setBounds(50 + k * i, 410  , 30 ,30);
            add(th1h_btn.get(i));
            th1i_btn.get(i).setBounds(50 + k * i, 440  , 30 ,30);
            add(th1i_btn.get(i));
            th1j_btn.get(i).setBounds(50 + k * i, 470  , 30 ,30);
            add(th1j_btn.get(i));
            th1k_btn.get(i).setBounds(50 + k * i, 500  , 30 ,30);
            add(th1k_btn.get(i));
            th1l_btn.get(i).setBounds(50 + k * i, 530  , 30 ,30);
            add(th1l_btn.get(i));
         }
         
         if( i> 1 && i < 12) {
            th1m_btn.get(i).setBounds(50 + k * i, 560  , 30 ,30);
            add(th1m_btn.get(i));
         }
         
         if (i > 12) {
            th1k_btn.get(i).setBounds(50 + k * (i + 1), 500  , 30 ,30);
            th1k_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th1k_btn.get(i));
            th1l_btn.get(i).setBounds(50 + k * (i + 1), 530  , 30 ,30);
            th1l_btn.get(i).setBackground(new Color(0xFF66B2));
            add(th1l_btn.get(i));
            th1m_btn.get(i).setBounds(50 + k * (i + 1), 560  , 30 ,30);
            add(th1m_btn.get(i));
         }
         
         
         
         
         
      }
      
      th1a_btn_soldout = new boolean[15];
      th1b_btn_soldout = new boolean[15];
      th1c_btn_soldout = new boolean[15];
      th1d_btn_soldout = new boolean[15];
      th1e_btn_soldout = new boolean[15];
      th1f_btn_soldout = new boolean[15];
      th1g_btn_soldout = new boolean[15];
      th1h_btn_soldout = new boolean[15];
      th1i_btn_soldout = new boolean[15];
      th1j_btn_soldout = new boolean[15];
      th1k_btn_soldout = new boolean[15];
      th1l_btn_soldout = new boolean[15];
      th1m_btn_soldout = new boolean[15];
      
      
      
      for(int i = 0; i < seats.size(); i++) {
         if(PeopleCheck.time.equals(seats.get(i).getT_code()))
         {
            int number = Integer.parseInt(seats.get(i).getS_name().substring(1, 3));
            char seat_location = seats.get(i).getS_name().charAt(0);
            switch(seat_location) {
            
            case 'A':
               th1a_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1a_btn_soldout[number -1] = true;
               break;
               
            case 'B':
               th1b_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1b_btn_soldout[number -1] = true;
               break;
               
            case 'C':
               th1c_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1c_btn_soldout[number -1] = true;
               break;
               
            case 'D':
               th1d_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1d_btn_soldout[number -1] = true;
               break;
               
            case 'E':
               th1e_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1e_btn_soldout[number -1] = true;
               break;
               
            case 'F':
               th1f_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1f_btn_soldout[number -1] = true;
               break;
               
            case 'G':
               th1g_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1g_btn_soldout[number -1] = true;
               break;
               
            case 'H':
               th1h_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1h_btn_soldout[number -1] = true;
               break;
               
            case 'I':
               th1i_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1i_btn_soldout[number -1] = true;
               break;
               
            case 'J':
               th1j_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1j_btn_soldout[number -1] = true;
               break;
               
            case 'K':
               th1k_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1k_btn_soldout[number -1] = true;
               break;
               
            case 'L':
               th1l_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1l_btn_soldout[number -1] = true;
               break;
               
            case 'M':
               th1m_btn.get((number - 1)).setBackground(new Color(0xC0C0C0));
               th1m_btn_soldout[number -1] = true;
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
      price_label.setFont(new Font("���", Font.BOLD | Font.PLAIN, 20));
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
      
      seat_l.setText("L");
      seat_l.setBounds(30, 530, 30, 30);
      seat_l.setFont(new Font("����", Font.BOLD, 20));
      seat_l.setForeground(Color.white);
      
      seat_m.setText("M");
      seat_m.setBounds(30, 560, 30, 30);
      seat_m.setFont(new Font("����", Font.BOLD, 20));
      seat_m.setForeground(Color.white);
      
      back.setBounds(10, 140, 50, 50);
      back.setForeground(Color.white);
      back.setBackground(new Color(0x606060));
      back.setFont(new Font("����", Font.BOLD, 45));
      back.setBorder(BorderFactory.createLineBorder(new Color(0x404040)));
      back.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            dispose();
            PeopleCheck people = new PeopleCheck();
            people.setDefaultOptions();
            people.getContentPane().setBackground(new Color(0x202020));

            for(int i = 0; i < th1a_btn_selected.length; i++) {
               if(th1a_btn_selected[i]) 
               {
                  th1a_btn.get(i).doClick();
               }
               if(th1b_btn_selected[i])
               {
                  th1b_btn.get(i).doClick();
               }
               if(th1c_btn_selected[i]) 
               {
                  th1c_btn.get(i).doClick();
               }
               if(th1d_btn_selected[i]) 
               {
                  th1d_btn.get(i).doClick();
               }
               if(th1e_btn_selected[i]) 
               {
                  th1e_btn.get(i).doClick();
               }
               if(th1f_btn_selected[i]) 
               {
                  th1f_btn.get(i).doClick();
               }
               if(th1g_btn_selected[i]) 
               {
                  th1g_btn.get(i).doClick();
               }
               if(th1h_btn_selected[i]) 
               {
                  th1h_btn.get(i).doClick();
               }
               if(th1i_btn_selected[i]) 
               {
                  th1i_btn.get(i).doClick();
               }
               if(th1j_btn_selected[i]) 
               {
                  th1j_btn.get(i).doClick();
               }
               if(th1k_btn_selected[i])
               {
                  th1k_btn.get(i).doClick();
               }
               if(th1l_btn_selected[i]) 
               {
                  th1l_btn.get(i).doClick();
               }
               if(th1m_btn_selected[i]) 
               {
                  th1m_btn.get(i).doClick();
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
      SeatChoice_1 frame = new SeatChoice_1();
      frame.setDefaultOptions();
      frame.getContentPane().setBackground(new Color(0x202020));


   }

}