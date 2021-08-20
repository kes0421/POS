package admin.view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import admin.model.dao.ProductsInventoryDAO;
import admin.model.dto.ProductsInventory;
import admin.view.main.BarPanel;
import admin.view.main.BtmPanel;
import admin.view.main.ListPanel;
import admin.view.main.List_C_Panel;
import admin.view.main.TopPanel;

public class MainFrame extends JFrame{
	
	ProductsInventoryDAO piDAO = new ProductsInventoryDAO();
	JScrollPane scroll;
	
	public MainFrame() {
		setBounds(0, 0, 1010, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		TopPanel topP = new TopPanel(this);
		add(topP);
		
		BarPanel barP = new BarPanel();
		add(barP);
		
		ArrayList<List_C_Panel> panelC = new ArrayList<>();
		ListPanel listP = new ListPanel();
		
		for(int i = 0; i < piDAO.piList().size(); ++i) {
			panelC.add(new List_C_Panel(
					piDAO.piList().get(i).getCode(),
					piDAO.piList().get(i).getName(),
					piDAO.piList().get(i).getQuantity(),
					piDAO.piList().get(i).getPrice(),
					this
					));
			
			listP.add(panelC.get(i));
		}
		
		scroll = new JScrollPane(listP);
		add(scroll);
		
		scroll.setBounds(0, 170, 1000, 455);
		scroll.setVisible(true);
		
		BtmPanel btmP = new BtmPanel(this);
		add(btmP);
	}
	
	// 검색후 mainFrame
	public MainFrame(ArrayList<ProductsInventory> piList) {
		setBounds(0, 0, 1010, 700);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setLayout(null);
		setResizable(false);
		
		TopPanel topP = new TopPanel(this);
		add(topP);
		
		BarPanel barP = new BarPanel();
		add(barP);
		
		ArrayList<List_C_Panel> panelC = new ArrayList<>();
		ListPanel listP = new ListPanel();
		
		if(piList.size() == 0) {
			JPanel noData = new JPanel();
			JLabel msg = new JLabel("검색한 결과는 없습니다. 다시 검색해 주세요.");
			msg.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
			noData.add(msg);
			scroll = new JScrollPane(noData);
			add(scroll);
			
			scroll.setBounds(0, 170, 1000, 455);
			scroll.setVisible(true);
			
		} else {
			for(int i = 0; i < piList.size(); ++i) {
				panelC.add(new List_C_Panel(
						piList.get(i).getCode(),
						piList.get(i).getName(),
						piList.get(i).getQuantity(),
						piList.get(i).getPrice(),
						this
						));
				
				listP.add(panelC.get(i));
			}
			
			scroll = new JScrollPane(listP);
			add(scroll);
			
			scroll.setBounds(0, 170, 1000, 455);
			scroll.setVisible(true);
		}
		
		BtmPanel btmP = new BtmPanel(this);
		add(btmP);
	}
}
