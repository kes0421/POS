package pos.advancedTicket.first;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import pos.advancedTicket.second.At2Frame;

public class At1NextBtnAct implements ActionListener{
	JFrame at1Frame;
	JLabel at1L3;
	ArrayList<String> r_list = new ArrayList<>();
	
	public At1NextBtnAct(JFrame at1Frame, JLabel at1L3) {
		this.at1Frame = at1Frame;
		this.at1L3 = at1L3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(at1L3.getText().length() == 13) {
//			if(checkRNum(at1L3.getText())) {
				new At2Frame();
				at1Frame.dispose();
//			}else {
//				JOptionPane.showMessageDialog(null, "에매번호를 올바르게 입력해주세요");
//				at1L3.setText("뒷자리(11자리)를 입력해주세요.");
//				at1L3.setFont(new Font("굴림", Font.BOLD, 30));
		}
		else {
			JOptionPane.showMessageDialog(null, "에매번호를 올바르게 입력해주세요");
			at1L3.setText("뒷자리(11자리)를 입력해주세요.");
			at1L3.setFont(new Font("굴림", Font.BOLD, 30));
		}
	}
}
