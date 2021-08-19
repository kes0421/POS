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
	 	��ٱ��� DB�� ������ INSERT
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
		��ٱ��� DB�����Ϳ��� DELETE���ֱ�
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
	 	��ٱ��� DB������ select���ֱ�
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
		��ٱ��� ���������� ����(����)������ ��ٱ��� DELETE���ֱ�
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
	
	// ��ٱ��� ��ư�� ���� ǥ��
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
		// ��ٱ��� ���� ���� ǥ��
		mainF.btm_p.setBorder(new TitledBorder(new LineBorder(Color.black), "" + count));
	}
}
