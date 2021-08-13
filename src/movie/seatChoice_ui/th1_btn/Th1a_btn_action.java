package movie.seatChoice_ui.th1_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_1;
import movie.seatChoice_ui.SeatChoice_2;

public class Th1a_btn_action implements ActionListener {

   Th1a_btn btn;


   public Th1a_btn_action(Th1a_btn btn) {

      this.btn = btn;
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_1.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_1.th1a_btn_soldout[index - 1]) 
      {
         ErrorFrame frame = new ErrorFrame();
         frame.getContentPane().setBackground(new Color(0x404040));
         frame.setDefaultOptions();
         JLabel label = new JLabel();
         label.setText("이미 예매된 자리입니다.");
         label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
         label.setForeground(Color.white);
         label.setHorizontalAlignment(JLabel.CENTER);
         frame.add(label);
      }
      else
      {
         if(SeatChoice_1.th1a_btn_selected[index - 1])
         {
            SeatChoice_1.th1a_btn_selected[index - 1] = false;
            if( index < 10)
            {
               btn.setBackground(new Color(0xFFB266));
            }
            else
            {
               SeatChoice_1.disable_btn_cnt--;
               btn.setBackground(new Color(0x4C9900));
            }
            SeatChoice_1.selected_cnt--;
         }
         else
         {
            if(SeatChoice_1.peoples > SeatChoice_1.selected_cnt)
            {
               if(index < 10)
               {
                  SeatChoice_1.th1a_btn_selected[index - 1] = true;
                  btn.setBackground(new Color(0xFF3333));
                  SeatChoice_1.selected_cnt++;
               }
               else
               {
                  if(PeopleCheck.disable_cnt == 0)
                  {
                     ErrorFrame frame = new ErrorFrame();
                     frame.getContentPane().setBackground(new Color(0x404040));
                     frame.setDefaultOptions();
                     JLabel label = new JLabel();
                     label.setText("장애인만 예매가능합니다.");
                     label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
                     label.setForeground(Color.white);
                     label.setHorizontalAlignment(JLabel.CENTER);
                     frame.add(label);
                  }
                  else
                  {
                     if(PeopleCheck.disable_cnt > SeatChoice_1.disable_btn_cnt)
                     {
                        SeatChoice_1.th1a_btn_selected[index - 1] = true;
                        btn.setBackground(new Color(0xFF3333));
                        SeatChoice_1.disable_btn_cnt++;
                        SeatChoice_1.selected_cnt++;
                     }
                     else
                     {
                        ErrorFrame frame = new ErrorFrame();
                        frame.getContentPane().setBackground(new Color(0x404040));
                        frame.setDefaultOptions();
                        JLabel label = new JLabel();
                        label.setText("장애인만 예매가능합니다.");
                        label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
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
               label.setText("선택인원이 "+ SeatChoice_1.peoples + "명을 초과했습니다.");
               label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               label.setHorizontalAlignment(JLabel.CENTER);
               frame.add(label);

            }
         }
      }

   }

}