package products.model.dao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import products.model.dto.ProductsBasket;
import products.view.MainFrame;
import util.DBUtill;

public class ProductsBasketsDAO {

	/**
	 	장바구니 DB에 데이터 INSERT
	*/
	MainFrame mainF;
	public ProductsBasketsDAO() {
	}
	
	public ProductsBasketsDAO(MainFrame mainF) {
		this.mainF = mainF;
		
	}
	
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
		장바구니 DB데이터에서 DELETE해주기
	 */
	public int basketDelete(ProductsBasket productsBasket) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement("Delete from productsbaskets where pb_name = ?");
			
			ps.setString(1, productsBasket.getName());
			
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
	
	/**
		장바구니 페이지에서 다음(결제)누르면 장바구니 DELETE해주기
	*/
	public int basketAllDelete() {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement("Delete from productsbaskets");
			
			result = ps.executeUpdate();
			
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 장바구니 버튼에 숫자 표시
	public void basketNum(){
		int count = 0;
	
		String sql = "Select * from productsbaskets";
			
		try(
			Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();	
		){
		while (rs.next()) {
			count++;
		}				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 장바구니 위에 숫자 표시
		mainF.btm_p.setBorder(new TitledBorder(new LineBorder(Color.black), "" + count));
	}
}
