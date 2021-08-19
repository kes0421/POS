package movie.seatChoice_ui.th3_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_3;

public class Th3f_btn_action implements ActionListener {

   Th3f_btn btn;


   public Th3f_btn_action(Th3f_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_3.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_3.th3f_btn_soldout[index - 1]) 
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
         if(SeatChoice_3.th3f_btn_selected[index - 1])
         {
            SeatChoice_3.th3f_btn_selected[index - 1] = false;
            btn.setBackground(new Color(0x404040));
            SeatChoice_3.selected_cnt--;
            SeatChoice_3.ticket_price -= SeatChoice_3.th3f_btn_price[index - 1];
            SeatChoice_3.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_3.ticket_price);


         }
         else
         {
            if(SeatChoice_3.peoples > SeatChoice_3.selected_cnt)
            {
               SeatChoice_3.th3f_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_3.selected_cnt++;
               SeatChoice_3.ticket_price += SeatChoice_3.th3f_btn_price[index - 1];
               SeatChoice_3.price_label.setText("일반: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "장애인: " + PeopleCheck.disable_cnt + "              " + "가격: " + SeatChoice_3.ticket_price);

            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("선택인원이 "+ SeatChoice_3.peoples + "명을 초과했습니다.");
               label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }

      }
   }

}