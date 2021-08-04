package products.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import products.view.productsPanels.BeveragePanel;
import products.view.productsPanels.PopcornPanel;
import products.view.productsPanels.SnackPanel;

public class MainFrame extends JFrame{
	
	MenuBarPanel bar_p;
	SnackPanel sp;
	PopcornPanel pp;
	BeveragePanel bp;
	
	public MainFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 700);
		setLayout(null);
		setVisible(true);
		
		plusFrame();
	}
	
	public void plusFrame() {
		AdPanel ad_p = new AdPanel();
		MenuTxTPanel txt_p = new MenuTxTPanel();
		bar_p = new MenuBarPanel();
		BtmBarPanel btm_p = new BtmBarPanel();
		ProductsPanel pro_p = new ProductsPanel();
		
		ComboPanel com_p = new ComboPanel();
		
		pp = new PopcornPanel();
		sp = new SnackPanel();
		bp = new BeveragePanel();
		
		add(ad_p);
		add(txt_p);

		add(bar_p);
		menuBarBtnAction();

		add(btm_p);
	}
	
	
	/**
	 	menuBar버튼 누를때 팝콘, 스낵, 음료로 바꿔주기
	*/
	public void menuBarBtnAction() {

		bar_p.popcornBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sp.setVisible(false);
				bp.setVisible(false);
				
				add(pp);
				pp.setVisible(true);
			}
		});
		
		bar_p.snackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pp.setVisible(false);
				bp.setVisible(false);
				
				add(sp);
				sp.setVisible(true);
			}
		});
		
		bar_p.bvgBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sp.setVisible(false);
				pp.setVisible(false);
				
				add(bp);
				bp.setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
	}
}