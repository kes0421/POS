package pos.advancedTicket.first;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class At1NumbtnsAct implements ActionListener{
	String text;
	JLabel at1L3;
	At1Frame at1Frame;
	
	public At1NumbtnsAct(String text, JLabel at1L3, JFrame at1Frame) {
		this.text = text;
		this.at1L3 = at1L3;
		this.at1Frame = (At1Frame)at1Frame;
	}
	
	  @Override
	   public void actionPerformed(ActionEvent e) {
	        int len = at1L3.getText().length();

	        if(at1L3.getText().equals("뒷자리(11자리)를 입력해주세요.")) {
	            at1L3.setText("" + text);
	            at1L3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
	        }else {
	            if(len == 4 || len == 9) {
	                at1L3.setText(at1L3.getText() + "-" + text);
	                at1L3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
	            }else {
	                at1L3.setText(at1L3.getText() + text);
	                at1L3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
	            }
	        }

	        if(at1L3.getText().length() == 14) {
	        	JOptionPane.showMessageDialog(at1Frame, "11자리를 넘게 입력하셨습니다.");
	            at1L3.setText(at1L3.getText().substring(0, at1L3.getText().length() -1));
	        }
	    }
	}