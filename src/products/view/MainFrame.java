package products.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public MainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 700);
		setLayout(null);
		setVisible(true);
		
		AdPanel ad_p = new AdPanel();
		MenuTxTPanel txt_p = new MenuTxTPanel();
		MenuBarPanel bar_p = new MenuBarPanel();
		BtmBarPanel btm_p = new BtmBarPanel();
		ProductsPanel pro_p = new ProductsPanel();
		
		ComboPanel com_p = new ComboPanel();
		
		add(ad_p);
		add(txt_p);
		add(bar_p);
		add(btm_p);
		add(pro_p);
	}
	
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
	}
}