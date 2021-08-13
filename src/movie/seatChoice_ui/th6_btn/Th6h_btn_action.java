package movie.seatChoice_ui.th6_btn;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import movie.peopleCheck_ui.ErrorFrame;
import movie.peopleCheck_ui.PeopleCheck;
import movie.seatChoice_ui.SeatChoice_6;

public class Th6h_btn_action implements ActionListener {

   Th6h_btn btn;


   public Th6h_btn_action(Th6h_btn btn) {

      this.btn = btn;

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      int index = Integer.parseInt(btn.getText());
      SeatChoice_6.peoples = PeopleCheck.adult_cnt + PeopleCheck.child_cnt + PeopleCheck.disable_cnt + PeopleCheck.old_cnt;
      if(SeatChoice_6.th6h_btn_soldout[index - 1]) 
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
         if(SeatChoice_6.th6h_btn_selected[index - 1])
         {
            SeatChoice_6.th6h_btn_selected[index - 1] = false;
            btn.setBackground(new Color(0x404040));
            SeatChoice_6.selected_cnt--;

         }
         else
         {
            if(SeatChoice_6.peoples > SeatChoice_6.selected_cnt)
            {
               SeatChoice_6.th6h_btn_selected[index - 1] = true;
               btn.setBackground(new Color(0xFF3333));
               SeatChoice_6.selected_cnt++;
            }
            else
            {
               ErrorFrame frame = new ErrorFrame();
               frame.getContentPane().setBackground(new Color(0x404040));
               frame.setDefaultOptions();
               JLabel label = new JLabel();
               label.setText("선택인원이 "+ SeatChoice_6.peoples + "명을 초과했습니다.");
               label.setFont(new Font("돋움", Font.PLAIN|Font.BOLD, 30));
               label.setForeground(Color.white);
               frame.add(label);

            }
         }

      }
   }

}