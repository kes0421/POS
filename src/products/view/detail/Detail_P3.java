package products.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import admin.model.dao.ProductsInventoryDAO;
import admin.model.dto.ProductsInventory;
import css.RoundedButton;
import products.model.dao.ProductsBasketsDAO;
import products.model.dao.ProductsSalesDAO;
import products.model.dto.ProductsBasket;
import products.model.dto.ProductsSales;
import products.view.MainFrame;
import products.view.pay.At3Frame;
import util.DBUtill;

public class Detail_P3 extends JPanel{
	
	ProductsBasketsDAO proBasketDAO = new ProductsBasketsDAO();
	ProductsInventoryDAO proInventoryDAO = new ProductsInventoryDAO(); 
	
	JLabel label2;
	JButton preBtn;
	MainFrame mF;
	
	public Detail_P3(JFrame frame, JFrame mF) {
		setBackground(new Color(255,254,230));
		setBounds(0, 448, 600, 124);
		setLayout(null);
		setVisible(true);
		this.mF = (MainFrame)mF;
		JLabel label1 = new JLabel("총 결제금액");
		label1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label1.setForeground(new Color(87,149,255));
		label1.setBounds(20, 6, 153, 44);
		add(label1);

		label2 = new JLabel();
		label2.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 14));
		label2.setForeground(new Color(87,149,255));
		label2.setBounds(406, 6, 142, 44);
		add(label2);

		preBtn = new RoundedButton("이 전");
		preBtn.setForeground(new Color(255, 0, 0));
		preBtn.setBounds(135, 62, 117, 56);
		preBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				basketNum();
			}
		});
		add(preBtn);

		JButton payBtn = new RoundedButton("결 제");
		payBtn.setForeground(new Color(0, 0, 255));
		payBtn.setBounds(325, 62, 117, 56);
		payBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ArrayList<ProductsBasket> basketList = proBasketDAO.basketList();
				ArrayList<String> pName = new ArrayList<>();
				ArrayList<String> piCodeList = new ArrayList<>();
				
				if(basketList.size() == 0) {
					JOptionPane.showMessageDialog(frame, "결제할 상품이 없습니다.");
				}else {
					// 장바구니 DB DELETE 해주기
					new ProductsBasketsDAO().basketAllDelete();
					
					// 상품 매출 테이블에 INSERT 해주기
					for(int i = 0; i < basketList.size(); ++i) {
						new ProductsSalesDAO().salseInsert(new ProductsSales(
																	basketList.get(i).getName(),
																	basketList.get(i).getPrice(),
																	basketList.get(i).getQuantity()
																	));
					}
					
					// 장바구니 List에서 name들 ArrayList에 넣어주기
					for(int i = 0; i < basketList.size(); ++i) {
						pName.add(basketList.get(i).getName());
					}
					
					// 결제하기 버튼 누른 후 재고테이블에서 재고 마이너스 해주는 반복문
					for(int i = 0; i< pName.size(); ++i) {
						// 재고테이블에서 마이너스 할 날짜 SELECT 해주기
						piCodeList = new ProductsInventoryDAO().minDateSelect(pName.get(i));
						int quantity = Integer.parseInt(basketList.get(i).getQuantity());
						
						// 고객이 산 물건을 재고 테이블에서 마이너스 해주기
						new ProductsInventoryDAO().inventoryQuantityUpdate(pName.get(i), quantity, piCodeList.get(0));
					}
					mF.dispose();
					frame.dispose();
					new At3Frame();
				}
				
			}
		});
		
		add(payBtn);
	}
	
	// 장바구니 버튼에 숫자 표시
	public void basketNum(){
		int count = 0;
	
		String sql = "Select pb_quantity from productsbaskets";
			
		try(
			Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();	
		){
		while (rs.next()) {
			count += rs.getInt("pb_quantity");
		}				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 장바구니 위에 숫자 표시
		mF.btm_p.basketBtn.setBorder(new TitledBorder(new LineBorder(Color.black), "" + count));
	}
}