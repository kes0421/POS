package products.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import products.model.dto.Products;
import util.DBUtill;

public class ProductsListDAO {

	/**
	 	p_name, p_price, p_img_path p_type가져와서 list에 넣어주기
	*/
	public ArrayList<Products> pList() {
	
		// product List
		ArrayList<Products> pList = new ArrayList<>();
		
		String sql = "SELECT p_name, p_price, p_img_path, p_type FROM products";
		
		try(
				Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
		){
			while (rs.next()) {
				pList.add(new Products(
						rs.getString("p_name"),
						rs.getInt("p_price"),
						rs.getString("p_img_path"),
						rs.getString("p_type")
						));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return pList;
	}
	
}
