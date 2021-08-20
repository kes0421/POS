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
import movie.seatChoice_ui.SeatChoice_5;
import movie.selectmovie.DateJList;
import movie.selectmovie.SelectMovieMain;
import pos.advancedTicket.third.At3Frame;
import util.DBUtill;

public class Th5_payment_btn_action implements ActionListener {
   Th5_payment_btn btn;


   public Th5_payment_btn_action(Th5_payment_btn btn) {

      this.btn = btn;
   }
   @Override
   public void actionPerformed(ActionEvent e) {
        if(SeatChoice_5.peoples == SeatChoice_5.selected_cnt)
        {
           PeopleCheck.seat5.dispose();
           pos.advancedTicket.third.At3Frame payment = new At3Frame();
           
          Connection con = null;
          PreparedStatement ps = null;
          
          try {
             con = DBUtill.getConnection();
             ps = con.prepareStatement("INSERT INTO movieSales VALUES ('m' || MS_CODE_SEQ.nextval,?,?,?,?)");
             
             ps.setString(1, SelectMovieMain.movie_name);
             ps.setString(2,  "" + SeatChoice_5.ticket_price);
             ps.setString(3, "" + SeatChoice_5.peoples);
             ps.setString(4, DateJList.movie_date);
             
             ps.executeUpdate();
             
             con = DBUtill.getConnection();
             ps = con.prepareStatement("INSERT INTO seats VALUES (s_code_seq.nextval,?,?,?,?)");
             
             int index = 0;
             for(int i = 0; i < 16; i++) {
                if(SeatChoice_5.th5a_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5a_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5a_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5b_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5b_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5b_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5c_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5c_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5c_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5d_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5d_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5d_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5e_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5e_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5e_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5f_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5f_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5f_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5g_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5g_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5g_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5h_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5h_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5h_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5i_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5i_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5i_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5j_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5j_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5j_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5k_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5k_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5k_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5l_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5l_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5l_btn_price[i]);
                   ps.setString(4, SelectMovieMain.time_code);   
                }
                if(SeatChoice_5.th5m_btn_selected[i])
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
                   ps.setString(2, SeatChoice_5.th5m_btn_name[i]);
                   ps.setString(3, "" + SeatChoice_5.th5m_btn_price[i]);
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
           label.setText("�����ο��� "+ SeatChoice_5.peoples + "�� ���� �����ϴ�");
           label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
           label.setForeground(Color.white);
           frame.add(label);

        }

   }

}
