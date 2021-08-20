package pos.advancedTicket.first;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import pos.advancedTicket.second.At2Frame;
import util.DBUtill;

public class At1NextBtnAct implements ActionListener{
	At1Frame at1Frame;
	JLabel at1L3;
	ArrayList<String> r_list = new ArrayList<>();
	
	public At1NextBtnAct(JFrame at1Frame, JLabel at1L3) {
		this.at1Frame = (At1Frame)at1Frame;
		this.at1L3 = at1L3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(checkRnum(at1L3.getText())) {
				new At2Frame(at1L3.getText());
				at1Frame.dispose();
		}
		else {
			JOptionPane.showMessageDialog(at1Frame, "에매번호를 올바르게 입력해주세요");
			at1L3.setText("뒷자리(11자리)를 입력해주세요.");
			at1L3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 30));
		}
	}
	
	boolean checkRnum(String text) {
	      String sql = "SELECT r_num FROM reservationNum";
	      
	      try(
	         Connection conn = DBUtill.getConnection();   
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery();   
	      ){
	         while(rs.next()) {
	        	 r_list.add(rs.getString("r_num"));
	         }
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	      }
	      
	      for(int i=0; i<r_list.size(); ++i) {
	         if(r_list.get(i).equals(text)) {
	            return true;
	         }
	      }
	      
	      return false;
	   }
}
