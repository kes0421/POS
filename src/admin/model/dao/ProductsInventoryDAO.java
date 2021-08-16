package admin.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import admin.model.dto.ProductsInventory;
import util.DBUtill;

public class ProductsInventoryDAO {

	/**
		상품 재고 list가져오기
	*/
	public ArrayList<ProductsInventory> piList(){
		
		ArrayList<ProductsInventory> piList = new ArrayList<>();
		
		String sql = "SELECT * FROM productsInventory order by pi_name";
		
		try(
				Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
				
		){
			while (rs.next()) {
				piList.add(new ProductsInventory(
						rs.getString("pi_code"),
						rs.getString("pi_name"),
						rs.getInt("pi_quantity"),
						rs.getInt("pi_price")
						));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return piList;
	}
	
	/**
		목록을 눌렀을때 그 타입의 오름차순 List
	*/
	public ArrayList<ProductsInventory> typeOfOrderBy(String type){

		ArrayList<ProductsInventory> piList = new ArrayList<>();
		String sql = "SELECT * FROM productsInventory" + type;
		
		try(
				Connection conn = DBUtill.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
		){
			while (rs.next()) {
				piList.add(new ProductsInventory(
						rs.getString("pi_code"),
						rs.getString("pi_name"),
						rs.getInt("pi_quantity"),
						rs.getInt("pi_price")
						));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return piList;
		
	}
	
	/**
		상품 검색했을 때 SELECT
	*/
	public ArrayList<ProductsInventory> productsSearchSelect(String name){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<ProductsInventory> piList = new ArrayList<>();
	
		String sql = "SELECT * FROM productsinventory where pi_name like ? order by pi_name";
	
		try{
			
			con = DBUtill.getConnection();
			ps = con.prepareStatement(sql);
	
			ps.setString(1, "%" + name + "%");
			rs = ps.executeQuery();
			
			while (rs.next()) {
				piList.add(new ProductsInventory(
						rs.getString("pi_code"),
						rs.getString("pi_name"),
						rs.getInt("pi_quantity"),
						rs.getInt("pi_price")
						));
			}
			
			con.close();
			ps.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return piList;
	}
	
	/**
		상품 재고 DELETE
	*/
	public int productInventoryDelete(ProductsInventory productsInventory) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement("Delete from productsInventory where pi_code = ?");
			
			ps.setString(1, productsInventory.getCode());
			
			result = ps.executeUpdate();
			
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
		새로운 재고 INSERT
	*/
	public int inventoryInsert(ProductsInventory productsInventory) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement("INSERT INTO productsInventory VALUES (?,?,?,?)");
		
			ps.setString(1,  productsInventory.getCode());
			ps.setString(2, productsInventory.getName());
			ps.setInt(3,  productsInventory.getQuantity());
			ps.setInt(4, productsInventory.getPrice());
			
			result = ps.executeUpdate();
			
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	/**
		재고 수정하기 UPDATE
	*/
	public int productsInvetoryUpdate(ProductsInventory productsInventory) {
		Connection con = null;
		PreparedStatement ps =  null;
		int result = 0;
		
		String sql = "update productsinventory set pi_name = ?, pi_quantity = ?, pi_price = ? where pi_code = ?";
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, productsInventory.getName());
			ps.setInt(2, productsInventory.getQuantity());
			ps.setInt(3, productsInventory.getPrice());
			ps.setString(4, productsInventory.getCode());	
			result = ps.executeUpdate();
	
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
		장바구니 frame에서 결제를 누르면 어떤 재고를 마이너스 해줄지 SELECT 해줌
	*/
	public ArrayList<String> minDateSelect(String name){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<String> piCode = new ArrayList<>();
	
		String sql = "SELECT Min(substr(pi_Code,?)) pi_code FROM productsinventory where pi_name = ?";
	
		try{
			con = DBUtill.getConnection();
			ps = con.prepareStatement(sql);

			ps.setInt(1, (name.length()+2));
			ps.setString(2, name);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				piCode.add(rs.getString("pi_code"));
			}

			con.close();
			ps.close();
			rs.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return piCode;
	}
	
	/**
		마이너스 할 이름과 날짜로 재고 테이블에 수량만큼 UPDATE 해줌
	*/
	public int inventoryQuantityUpdate(String name, int quantity, String date) {
		Connection con = null;
		PreparedStatement ps =  null;
		int result = 0;
		
		String sql = "UPDATE productsinventory SET pi_quantity = pi_quantity-? WHERE pi_name = ? AND pi_code LIKE ?";
		try {
			con = DBUtill.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, quantity);
			ps.setString(2, name);
			ps.setString(3, "%" + date);
			result = ps.executeUpdate();
	
			con.close();
			ps.close();
			
		} catch (SQLException e) {
		}
		return result;
	}
	
}
