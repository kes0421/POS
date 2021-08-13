package movie.seatChoice_ui.th5_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_5;

public class Th5i_btn_action implements ActionListener {

   Th5i_btn btn;


   public Th5i_btn_action(Th5i_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_5.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_5.th5i_btn_soldout[index - 1]) 
      {
         ErrorFrame frame = new ErrorFrame();
         frame.getContentPane().setBackground(new Color(0x404040));
         frame.setDefaultOptions();
         JLabel label = new JLabel();
         label.setText("�̹� ���ŵ� �ڸ��Դϴ�.");
         label.setFont(new Font("����", Font.PLAIN|Font.BOLD, 30));
         label.setForeground(Color.white);
         label.setHorizontalAlignment(JLabel.CENTER);
         frame.add(label);
      }
      else
      {
         if(SeatChoice_5.th5i_btn_selected[index - 1])
         {
            if(index > 2) 
            {
               SeatChoice_5.th5i_btn_selected[index - 1] = false;
               btn.setBackground(new Color(0x404040));
            }
            else
            {
               SeatChoice_5.th5i_btn_selected[index - 1] = false;
               btn.setBackground(new Color(0xFF66B2));
            }
            SeatChoice_5.selected_cnt--;

         }
         else
         {
            if(SeatChoice_5.peoples > SeatChoice_5.selected_cnt)
            {
               SeatChoice_5.th5i_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_5.selected_cnt++;
            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("�����ο��� "+ SeatChoice_5.peoples + "���� �ʰ��߽��ϴ�.");
               label.setFont(new Font("����", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }

      }
   }

}