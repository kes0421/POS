package products.view.detail;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import products.model.dao.ProductsBasketsDAO;
import products.model.dto.ProductsBasket;
import products.view.ckeckFrame.ChkImg;

public class Detail_P2_C extends JPanel {
	   
	   ProductsBasketsDAO pbDAO = new ProductsBasketsDAO();
	   JButton btn3;
	   int resultPri;
	   
	   //public Detail_P2_C(JFrame frame) {}
	   
	   public Detail_P2_C(String img_path, String name, String price, String quantity, JFrame frame) {
	      LineBorder lineColor = new LineBorder(Color.LIGHT_GRAY);

	      setBackground(new Color(255, 255, 255));
	      setBounds(0, 0, 600, 99);
	      setBorder(lineColor);
	      setLayout(null);
	      
	      ChkImg img = new ChkImg(img_path,94,87);
	      img.setBounds(6, 6, 94, 87);
	      add(img);
	      
	      JLabel label2 = new JLabel(name);
	      label2.setFont(new Font("Lao MN", Font.BOLD | Font.ITALIC, 15));
	      label2.setForeground(new Color(0, 0, 205));
	      label2.setBounds(125, 40, 170, 30);
	      add(label2);

	      JLabel label3 = new JLabel(price + "¿ø");
	      label3.setBounds(390, 40, 78, 31);
	      add(label3);
	      
	      JLabel label4 = new JLabel(quantity + "°³");
	      label4.setBounds(330, 46, 32, 16);
	      add(label4);
	      
	      btn3 = new JButton("Delete");
	      btn3.setForeground(new Color(255, 0, 0));
	      btn3.setBackground(new Color(255, 255, 255));
	      btn3.setBounds(479, 40, 117, 29);
	      add(btn3);
	      
	      btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ProductsBasketsDAO().basketDelete(new ProductsBasket(label2.getText()));
				frame.setVisible(false);
				new DetailFrame();
			}
		});
	   }
	}