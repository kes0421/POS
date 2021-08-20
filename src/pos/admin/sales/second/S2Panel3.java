package pos.admin.sales.second;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import util.DBUtill;

public class S2Panel3 extends JPanel{
	JLabel l1, l2, l3;
	String date;
	int count;
	int sales;
	public S2Panel3(String date) {
		this.date = date;
		getSales();
		setBackground(Color.CYAN);
		setBounds(12, 229, 362, 134);
		setLayout(null);
		l1 = new JLabel("»ó Ç°");
		l2 = new JLabel("¼ö·® : " + count);
		l3 = new JLabel("°¡°Ý : " + sales);
		
		l1.setFont(new Font("ÈÞ¸ÕµÕ±ÙÇìµå¶óÀÎ", Font.PLAIN, 50));
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(12, 10, 140, 114);
		
		l2.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		l2.setBounds(164, 10, 200, 50);
		
		l3.setFont(new Font("±¼¸²", Font.PLAIN, 20));
		l3.setBounds(164, 70, 200, 50);
		
		add(l1);
		add(l2);
		add(l3);
	}
	public void getSales() {
		int day = Integer.parseInt(date);
		if(day >= 10) {
			date = "";
			date += day;
		}else {
			date = "";
			date += "0" + day;
		}
		
		String sql = "SELECT ps_price, ps_quantity FROM productssales WHERE ps_date = " + "'08-" + date + "'";
		try(
			Connection conn = DBUtill.getConnection();	
			PreparedStatement pstmt1 = conn.prepareStatement(sql);
			ResultSet rs = pstmt1.executeQuery();
		){
			while(rs.next()) {
				sales += rs.getInt("ps_price");
				count += rs.getInt("ps_quantity");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
