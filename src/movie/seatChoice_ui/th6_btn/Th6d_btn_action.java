package movie.seatChoice_ui.th6_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_6;

public class Th6d_btn_action implements ActionListener {

   Th6d_btn btn;


   public Th6d_btn_action(Th6d_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_6.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_6.th6d_btn_soldout[index - 1]) 
      {
         ErrorFrame frame = new ErrorFrame();
         frame.getContentPane().setBackground(new Color(0x404040));
         frame.setDefaultOptions();
         JLabel label = new JLabel();
         label.setText("�̹� ���ŵ� �ڸ��Դϴ�.");
         label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
         label.setForeground(Color.white);
         label.setHorizontalAlignment(JLabel.CENTER);
         frame.add(label);
      }
      else
      {
         if(SeatChoice_6.th6d_btn_selected[index - 1])
         {
            SeatChoice_6.th6d_btn_selected[index - 1] = false;
            btn.setBackground(new Color(0x404040));
            SeatChoice_6.selected_cnt--;
            SeatChoice_6.ticket_price -= SeatChoice_6.th6d_btn_price[index - 1];
            SeatChoice_6.price_label.setText("�Ϲ�: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "�����: " + PeopleCheck.disable_cnt + "              " + "����: " + SeatChoice_6.ticket_price);


         }
         else
         {
            if(SeatChoice_6.peoples > SeatChoice_6.selected_cnt)
            {
               SeatChoice_6.th6d_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_6.selected_cnt++;
               SeatChoice_6.ticket_price += SeatChoice_6.th6d_btn_price[index - 1];
               SeatChoice_6.price_label.setText("�Ϲ�: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "�����: " + PeopleCheck.disable_cnt + "              " + "����: " + SeatChoice_6.ticket_price);

            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("�����ο��� "+ SeatChoice_6.peoples + "���� �ʰ��߽��ϴ�.");
               label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }

      }
   }

}