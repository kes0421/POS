package admin.view;

import java.util.ArrayList;

import javax.swing.JFrame;
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
		setBounds(100, 100, 1010, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
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
	
	// °Ë»öÈÄ mainFrame
	public MainFrame(ArrayList<ProductsInventory> piList) {
		setBounds(100, 100, 1010, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		TopPanel topP = new TopPanel(this);
		add(topP);
		
		BarPanel barP = new BarPanel();
		add(barP);
		
		ArrayList<List_C_Panel> panelC = new ArrayList<>();
		ListPanel listP = new ListPanel();
		
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
		
		BtmPanel btmP = new BtmPanel(this);
		add(btmP);
		
	}
	
	public static void main(String[] args) {
		MainFrame main = new MainFrame();
		main.setVisible(true);
	}
}
