package products.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import products.model.dto.ProductsSales;
import util.DBUtill;

public class ProductsSalesDAO {

	/**
 		상품 매출 DB에 데이터 INSERT
	*/
	public int salseInsert(ProductsSales productsSales){
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement("INSERT INTO productsSales VALUES ('P' || ps_code_seq.nextVal,?,?,?,?)");
			
			LocalDate now = LocalDate.now();
			DateTimeFormatter today_format = DateTimeFormatter.ofPattern("MM-dd");
			String today = today_format.format(now);
			
			ps.setString(1,  productsSales.getName());
			ps.setString(2, productsSales.getPrice());
			ps.setString(3,  productsSales.getQuantity());
			ps.setString(4, today);
			
			result = ps.executeUpdate();
			
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
