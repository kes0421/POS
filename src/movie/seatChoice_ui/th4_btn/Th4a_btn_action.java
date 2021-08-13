package movie.seatChoice_ui.th4_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_1;
import movie.seatChoice_ui.SeatChoice_2;
import movie.seatChoice_ui.SeatChoice_4;

public class Th4a_btn_action implements ActionListener {

   Th4a_btn btn;


   public Th4a_btn_action(Th4a_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_4.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_4.th4a_btn_soldout[index - 1]) 
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
         if(SeatChoice_4.th4a_btn_selected[index - 1])
         {
            SeatChoice_4.th4a_btn_selected[index - 1] = false;
            if( index > 6)
            {
               btn.setBackground(new Color(0x404040));
            }
            else
            {
               SeatChoice_4.disable_btn_cnt--;
               btn.setBackground(new Color(0x4C9900));
            }
            SeatChoice_4.selected_cnt--;
         }
         else
         {
            if(SeatChoice_4.peoples > SeatChoice_4.selected_cnt)
            {
               if(index > 6) 
               {
                  SeatChoice_4.th4a_btn_selected[index - 1] = true;
                  btn.setBackground(new Color(0xFF3333));
                  SeatChoice_4.selected_cnt++;
               }

               else
               {
                  if(PeopleCheck.disable_cnt == 0)
                  {
                     ErrorFrame frame = new ErrorFrame();
                     frame.getContentPane().setBackground(new Color(0x404040));
                     frame.setDefaultOptions();
                     JLabel label = new JLabel();
                     label.setText("����θ� ���Ű����մϴ�.");
                     label.setFont(new Font("����", Font.PLAIN|Font.BOLD, 30));
                     label.setForeground(Color.white);
                     label.setHorizontalAlignment(JLabel.CENTER);
                     frame.add(label);
                  }
                  else
                  {
                     if(PeopleCheck.disable_cnt > SeatChoice_4.disable_btn_cnt)
                     {
                        SeatChoice_4.th4a_btn_selected[index - 1] = true;
                        btn.setBackground(new Color(0xFF3333));
                        SeatChoice_4.disable_btn_cnt++;
                        SeatChoice_4.selected_cnt++;
                     }
                     else
                     {
                        ErrorFrame frame = new ErrorFrame();
                        frame.getContentPane().setBackground(new Color(0x404040));
                        frame.setDefaultOptions();
                        JLabel label = new JLabel();
                        label.setText("����θ� ���Ű����մϴ�.");
                        label.setFont(new Font("����", Font.PLAIN|Font.BOLD, 30));
                        label.setForeground(Color.white);
                        label.setHorizontalAlignment(JLabel.CENTER);
                        frame.add(label);
                     }

                  }
               }
            }

            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("�����ο��� "+ SeatChoice_1.peoples + "���� �ʰ��߽��ϴ�.");
               label.setFont(new Font("����", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               label.setHorizontalAlignment(JLabel.CENTER);
               frame.add(label);

            }
         }
      }
   }

}