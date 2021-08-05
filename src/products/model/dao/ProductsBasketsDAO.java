package products.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import products.model.dto.Products;
import products.model.dto.ProductsBasket;
import util.DBUtill;

public class ProductsBasketsDAO {

	/**
	 	장바구니 DB에 데이터 insert해주기
	*/
	public int basketInsert(ProductsBasket productsBasket){
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement("INSERT INTO productsBaskets VALUES (?,?,?,?)");
			
			ps.setString(1,  productsBasket.getName());
			ps.setString(2, productsBasket.getImgPath());
			ps.setString(3,  productsBasket.getPrice());
			ps.setString(4, productsBasket.getQuantity());
			
			result = ps.executeUpdate();
			
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	/**
	 	장바구니 DB데이터 select해주기
	*/
	public ArrayList<ProductsBasket> basketList(){
		
		// basket List
		ArrayList<ProductsBasket> proBasketList = new ArrayList<>();
		
		String sql = "Select * from productsbaskets";
		
		try(
				Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
		){
			while (rs.next()) {
				proBasketList.add(new ProductsBasket(
						rs.getString("pb_name"),
						rs.getString("pb_img_path"),
						rs.getString("pb_price"),
						rs.getString("pb_quantity")
						));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return proBasketList;
	}
}
