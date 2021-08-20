package pos.advancedTicket.first;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class At1DelBtnAct implements ActionListener{
	JLabel at1L3;
	
	public At1DelBtnAct(JLabel at1L3) {
		this.at1L3 = at1L3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		at1L3.setText(at1L3.getText().substring(0, at1L3.getText().length() -1));
        if(at1L3.getText().charAt(at1L3.getText().length() -1) == '-') {
            at1L3.setText(at1L3.getText().substring(0, at1L3.getText().length() -1));
        }
		
		if(at1L3.getText().length() == 0) {
			at1L3.setText("뒷자리(11자리)를 입력해주세요.");
			at1L3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		}
	}
}
