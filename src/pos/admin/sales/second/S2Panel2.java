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

public class S2Panel2 extends JPanel{
	JLabel l1, l2, l3;
	String date;
	int sales;
	int count;
	
	public S2Panel2(String date) {
		this.date = date;
		getSales();
		setBounds(12, 85, 362, 134);
		setLayout(null);
		setBackground(Color.cyan);
		l1 = new JLabel("¿µ È­");
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
			date = "" + day;
		}else {
			date = "" + "0" + day;
		}
		
		String sql = "SELECT ms_price, ms_quantity FROM movieSales WHERE ms_date = " + "'08-" + date + "'";
		try(
			Connection conn = DBUtill.getConnection();	
			PreparedStatement pstmt1 = conn.prepareStatement(sql);
			ResultSet rs1 = pstmt1.executeQuery();
		){
			while(rs1.next()) {
				sales += rs1.getInt("ms_price");
				count += rs1.getInt("ms_quantity");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
