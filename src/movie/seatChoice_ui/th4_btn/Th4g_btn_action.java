package movie.seatChoice_ui.th4_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_4;

public class Th4g_btn_action implements ActionListener {

   Th4g_btn btn;


   public Th4g_btn_action(Th4g_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_4.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_4.th4g_btn_soldout[index - 1]) 
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
         if(SeatChoice_4.th4g_btn_selected[index - 1])
         {
            SeatChoice_4.th4g_btn_selected[index - 1] = false;
            btn.setBackground(new Color(0x404040));
            SeatChoice_4.selected_cnt--;
            SeatChoice_4.ticket_price -= SeatChoice_4.th4g_btn_price[index - 1];
            SeatChoice_4.price_label.setText("�Ϲ�: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "�����: " + PeopleCheck.disable_cnt + "              " + "����: " + SeatChoice_4.ticket_price);


         }
         else
         {
            if(SeatChoice_4.peoples > SeatChoice_4.selected_cnt)
            {
               SeatChoice_4.th4g_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_4.selected_cnt++;
               SeatChoice_4.ticket_price += SeatChoice_4.th4g_btn_price[index - 1];
               SeatChoice_4.price_label.setText("�Ϲ�: " + (PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.old_cnt) + "              " + "�����: " + PeopleCheck.disable_cnt + "              " + "����: " + SeatChoice_4.ticket_price);

            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("�����ο��� "+ SeatChoice_4.peoples + "���� �ʰ��߽��ϴ�.");
               label.setFont(new Font("    ", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }

      }
   }

}