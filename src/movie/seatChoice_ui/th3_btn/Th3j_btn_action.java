package movie.seatChoice_ui.th3_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_3;

public class Th3j_btn_action implements ActionListener {

   Th3j_btn btn;


   public Th3j_btn_action(Th3j_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_3.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_3.th3j_btn_soldout[index - 1]) 
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
         if(SeatChoice_3.th3j_btn_selected[index - 1])
         {
            if(index > 2) 
            {
               SeatChoice_3.th3j_btn_selected[index - 1] = false;
               btn.setBackground(new Color(0x404040));
            }
            else
            {
               SeatChoice_3.th3j_btn_selected[index - 1] = false;
               btn.setBackground(new Color(0xFF66B2));
            }
            SeatChoice_3.selected_cnt--;
         }
         else
         {
            if(SeatChoice_3.peoples > SeatChoice_3.selected_cnt)
            {
               SeatChoice_3.th3j_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_3.selected_cnt++;
            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("선택인원이 "+ SeatChoice_3.peoples + "명을 초과했습니다.");
               label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }
      }

   }

}