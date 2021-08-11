package admin.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import admin.model.dto.ProductsInventory;
import util.DBUtill;

public class ProductsInventoryDAO {

	/**
		��ǰ ��� list��������
	*/
	public ArrayList<ProductsInventory> piList(){
		
		ArrayList<ProductsInventory> piList = new ArrayList<>();
		
		String sql = "SELECT * FROM PRODUCTSINVENTORY";
		
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
		��ǰ ��� DELETE
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
		���ο� ��� INSERT
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
		��� �����ϱ� UPDATE
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
		��ǰ �˻����� �� SELECT
	*/
	public ArrayList<ProductsInventory> productsSearchSelect(String name){
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ArrayList<ProductsInventory> piList = new ArrayList<>();
	
		String sql = "SELECT * FROM PRODUCTSINVENTORY where pi_name like ? order by pi_name";
	
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
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return piList;
	}
	
}
