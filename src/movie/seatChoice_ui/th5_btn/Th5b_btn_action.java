package movie.seatChoice_ui.th5_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_5;

public class Th5b_btn_action implements ActionListener {

   Th5b_btn btn;


   public Th5b_btn_action(Th5b_btn btn) {
      this.btn = btn;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_5.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_5.th5b_btn_soldout[index - 1]) 
      {
         ErrorFrame frame = new ErrorFrame();
         frame.getContentPane().setBackground(new Color(0x404040));
         frame.setDefaultOptions();
         JLabel label = new JLabel();
         label.setText("이미 예매된 자리입니다.");
         label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
         label.setForeground(Color.white);
         label.setHorizontalAlignment(JLabel.CENTER);
         frame.add(label);
      }
      else
      {
         if(SeatChoice_5.th5b_btn_selected[index - 1])
         {
            SeatChoice_5.th5b_btn_selected[index - 1] = false;
            btn.setBackground(new Color(0xFFB266));
            SeatChoice_5.selected_cnt--;
            SeatChoice_5.ticket_price -= SeatChoice_5.th5b_btn_price[index - 1];
            SeatChoice_5.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_5.ticket_price);

         }
         else
         {
            if(SeatChoice_5.peoples > SeatChoice_5.selected_cnt)
            {
               SeatChoice_5.th5b_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_5.selected_cnt++;
               SeatChoice_5.ticket_price += SeatChoice_5.th5b_btn_price[index - 1];
               SeatChoice_5.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_5.ticket_price);

            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("선택인원이 "+ SeatChoice_5.peoples + "명을 초과했습니다.");
               label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }

      }
   }

}