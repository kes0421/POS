package movie.seatChoice_ui.th_payment_btn;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Th4_payment_btn extends JButton {
   
   JButton btn;
   
   public Th4_payment_btn(JButton btn) {
      this.btn = btn;
      setText("결제할래요");
      setBackground(new Color(0xFF3333));
      setForeground(Color.white);
      setFont(new Font("    ", Font.BOLD, 20));
      setBorder(BorderFactory.createLineBorder(new Color(0x202020)));
      addActionListener(new Th4_payment_btn_action(this));
   }

}