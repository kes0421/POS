package movie.seatChoice_ui.th_payment_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_1;
import movie.selectmovie.DateJList;
import movie.selectmovie.SelectMovieMain;
import pos.advancedTicket.third.At3Frame;
import util.DBUtill;

public class Th1_payment_btn_action implements ActionListener {
   Th1_payment_btn btn;


   public Th1_payment_btn_action(Th1_payment_btn btn) {

      this.btn = btn;
   }
   @Override
   public void actionPerformed(ActionEvent e) {
        if(SeatChoice_1.peoples == SeatChoice_1.selected_cnt)
        {
           PeopleCheck.seat1.dispose();
           pos.advancedTicket.third.At3Frame payment = new At3Frame();
           
          Connection con = null;
          PreparedStatement ps = null;
          
          try {
             con = DBUtill.getConnection();
             ps = con.prepareStatement("INSERT INTO movieSales VALUES ('m' || MS_CODE_SEQ.nextval,?,?,?,?)");
             
             ps.setString(1, SelectMovieMain.movie_name);
             ps.setString(2,  "" + SeatChoice_1.ticket_price);
             ps.setString(3, "" + SeatChoice_1.peoples);
             ps.setString(4, DateJList.movie_date);
             
             ps.executeUpdate();
             
             con = DBUtill.getConnection();
             ps = con.prepareStatement("INSERT INTO seats VALUES (s_code_seq.nextval,?,?,?,?)");
             
             int index = 0;
             for(int i = 0; i < 15; i++) {
                if(SeatChoice_1.th1a_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "A";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1a_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1a_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1b_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "B";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1b_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1b_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1c_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "C";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1c_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1c_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1d_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "D";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1d_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1d_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1e_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "E";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1e_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1e_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1f_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "F";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1f_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1f_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1g_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "G";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1g_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1g_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1h_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "H";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1h_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1h_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1i_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "I";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1i_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1i_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1j_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "J";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1j_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1j_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1k_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "K";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1k_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1k_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1l_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "L";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1l_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1l_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_1.th1m_btn_selected[i])
                {
                   index = i + 1;
                   String seat_name = "M";
                   if(index < 10) 
                   {
                      seat_name +=  "0" + index;
                   }
                   else
                   {
                      seat_name += index;
                   }
                   ps.setString(1, seat_name);
                   ps.setString(2, SeatChoice_1.th1m_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_1.th1m_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                
             }
             
             
             
             ps.executeUpdate();
             
             con.close();
             ps.close();
             
          } catch (SQLException e1) {
             e1.printStackTrace();
          }
           
        }
        else
        {
           ErrorFrame frame = new ErrorFrame();
           frame.getContentPane().setBackground(new Color(0x404040));
           frame.setDefaultOptions();
           JLabel label = new JLabel();
           label.setText("�����ο��� "+ SeatChoice_1.peoples + "�� ���� �����ϴ�");
           label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
           label.setForeground(Color.white);
           frame.add(label);

        }

   }

}