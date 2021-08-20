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
import products.view.MainFrame;
import products.view.proBasket.ChkImg;

public class Detail_P2_C extends JPanel {
	   
	   ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();
	   MainFrame mF;
	   
	   public Detail_P2_C(String img_path, String name, String price, String quantity, JFrame frame, JFrame mF) {
	      LineBorder lineColor = new LineBorder(new Color(87,149,255));
	      this.mF = (MainFrame)mF;
	      setBackground(new Color(255, 255, 255));
	      setLayout(new BorderLayout());
	      setBorder(lineColor);
	      
	      ChkImg img = new ChkImg(img_path,94,87);
	      
	      add(img,"West");
	      
	      JPanel centerPanel = new JPanel();
	      centerPanel.setBackground(Color.white);
	      centerPanel.setLayout(null);
	      
	      JLabel proName = new JLabel(name);
	      proName.setFont(new Font("ÈÞ¸ÕµÕ±ÙÇìµå¶óÀÎ", Font.PLAIN | Font.ITALIC, 15));
	      proName.setForeground(Color.black);
	      proName.setBounds(20, 30, 200, 30);

	      JLabel proPrice = new JLabel(price + "¿ø");
	      proPrice.setBounds(220, 30, 78, 31);
	      
	      JLabel proQuan = new JLabel(quantity + "°³");
	      proQuan.setBounds(342, 35, 32, 16);
	      
	      JButton deleteBtn = new RoundedButton("Delete");
	      deleteBtn.setBounds(410, 30, 50, 50);
	      deleteBtn.setForeground(new Color(255, 0, 0));
	      deleteBtn.setBackground(new Color(255, 30, 255));
	      
	      centerPanel.add(proName);
	      centerPanel.add(proPrice);
	      centerPanel.add(proQuan);
	      centerPanel.add(deleteBtn);
	     
	      add(centerPanel,"Center");
	      
	      deleteBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsBasketsDAO().basketDelete(new ProductsBasket(proName.getText()));
				frame.dispose();
				new DetailFrame(mF);
			}
		});
	   }
	}