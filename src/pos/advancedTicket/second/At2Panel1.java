package pos.advancedTicket.second;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import util.DBUtill;

public class At2Panel1 extends JPanel{
	JLabel at2L1, at2L2, at2L3, at2L4;
	JButton at2Btn1;
	String rNum;
	At2Label5 at2L5;
	
	public At2Panel1(JFrame at2F, String rNum) {
		this.rNum = rNum;
		
		setBounds(90, 250, 504, 442);
		setBackground(Color.gray);
		setLayout(null);
		at2L1 = new At2Label1();
		at2L2 = new At2Label2();
		at2L3 = new At2Label3();
		at2L4 = new At2Label4();
		at2L5 = new At2Label5();
		at2Btn1 = new At2Btn1(at2F);
		add(at2L1);
		add(at2L2);
		add(at2L3);
		add(at2L4);
		add(at2L5);
		add(at2Btn1);
		at2Btn1 = new At2Btn1(at2F);
		
		rNumList();
	}
	
	void rNumList() {
		String sql = "Select * from reservationNum where r_num = '" + rNum +"'";
		
		try(
				Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
		){
			
			while (rs.next()) {
				
				at2L2.setText(rs.getString("r_name"));
				at2L3.setText(rs.getString("r_theater") + "(" + rs.getString("r_start") + " ~ " + rs.getString("r_end") + ")");
				at2L4.setText(rs.getInt("r_quantity") + "¸Å");
				at2L5.setImageSize(rs.getString("r_img_path"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}