package products.view.detail;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import css.RoundedButton;
import products.model.dao.ProductsBasketsDAO;
import products.model.dto.ProductsBasket;
import products.view.proBasket.ChkImg;

public class Detail_P2_C extends JPanel {
	   
	   ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();

	   public Detail_P2_C(String img_path, String name, String price, String quantity, JFrame frame) {
	      LineBorder lineColor = new LineBorder(new Color(87,149,255));

	      setBackground(new Color(255, 255, 255));
	      setLayout(new BorderLayout());
	      setBorder(lineColor);
	      
	      ChkImg img = new ChkImg(img_path,94,87);
	      
	      add(img,"West");
	      
	      JLabel proName = new JLabel(name);
	      JLabel proPrice = new JLabel(price + "¿ø");
	      JLabel proQuan = new JLabel(quantity + "°³");
	     
	      JLabel proAll = new JLabel(proName.getText()+"       "+proPrice.getText()+"       "+proQuan.getText());
	      add(proAll,"Center");
	      
	      JButton deleteBtn = new RoundedButton("Delete");
	      deleteBtn.setForeground(new Color(255, 0, 0));
	      deleteBtn.setBackground(new Color(255, 255, 255));
	      add(deleteBtn,"East");
	      
	      deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsBasketsDAO().basketDelete(new ProductsBasket(proName.getText()));
				frame.setVisible(false);
				new DetailFrame();
			}
		});
	   }
	}