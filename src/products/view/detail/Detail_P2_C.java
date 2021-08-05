package products.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import products.model.dao.ProductsBasketsDAO;
import products.model.dto.ProductsBasket;
import products.view.ckeckFrame.ChkFrame;
import products.view.ckeckFrame.ChkImg;

public class Detail_P2_C extends JPanel {
	   
	   ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();
	   
	   public Detail_P2_C(String img_path, String name, String price, String quantity) {
	      LineBorder lineColor = new LineBorder(Color.LIGHT_GRAY);

	      setBackground(new Color(255, 255, 255));
	      setBounds(0, 0, 600, 99);
	      setBorder(lineColor);
	      setLayout(null);
	      
	      ChkImg img = new ChkImg(img_path);
	      img.setBounds(6, 6, 94, 87);
	      add(img);
	      
	      JLabel label2 = new JLabel(name);
	      label2.setFont(new Font("Lao MN", Font.BOLD | Font.ITALIC, 15));
	      label2.setForeground(new Color(0, 0, 205));
	      label2.setBounds(125, 20, 107, 30);
	      add(label2);

	      JLabel label3 = new JLabel(price);
	      label3.setBounds(125, 62, 78, 31);
	      add(label3);

	      JButton btn1 = new JButton("-");
	      btn1.setForeground(new Color(255, 0, 0));
	      btn1.setBounds(324, 64, 46, 29);
	      btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
	      });
	      add(btn1);

	      JButton btn2 = new JButton("+");
	      btn2.setForeground(new Color(0, 0, 255));
	      btn2.setBounds(421, 64, 46, 29);
	      btn2.addActionListener(new ActionListener() {
	    	  @Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
				}
	    	  
	      });
	      add(btn2);

	      JLabel label4 = new JLabel(quantity);
	      label4.setBounds(382, 69, 32, 16);
	      add(label4);

	      JButton btn3 = new JButton("Delete");
	      btn3.setForeground(new Color(255, 0, 0));
	      btn3.setBackground(new Color(255, 255, 255));
	      btn3.setBounds(479, 36, 117, 29);
	      add(btn3);
	   }
	}