package products.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import products.view.banner.AdPanel;
import products.view.banner.MenuTxTPanel;
import products.view.bottom.BtmBarPanel;
import products.view.productsPanels.BeveragePanel;
import products.view.productsPanels.ComboPanel;
import products.view.productsPanels.MenuBarPanel;
import products.view.productsPanels.PopcornPanel;
import products.view.productsPanels.SnackPanel;

public class MainFrame extends JFrame{
	
	MenuBarPanel bar_p;
	SnackPanel sp;
	PopcornPanel pp;
	BeveragePanel bp;
	ComboPanel cp;
	JScrollPane scroll1;
	JScrollPane scroll2;
	JScrollPane scroll3;
	JScrollPane scroll4;
	public BtmBarPanel btm_p;
	
	public MainFrame() {
		super("MainFrame");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 700, 700);
		setLayout(null);
		setResizable(false);
		
		plusFrame();
	}
	
	public void plusFrame() {
		AdPanel ad_p = new AdPanel();
		MenuTxTPanel txt_p = new MenuTxTPanel();
		bar_p = new MenuBarPanel();
		btm_p = new BtmBarPanel(this);
		
		pp = new PopcornPanel(this);
		sp = new SnackPanel(this);
		bp = new BeveragePanel(this);
		cp = new ComboPanel(this);
		
		add(ad_p);
		add(txt_p);

		scroll1 = new JScrollPane(cp);
		add(scroll1);
		
		scroll1.setBounds(0, 192, 700, 443);
		scroll1.setVisible(true);
		
		scroll2 = new JScrollPane(pp);
		add(scroll2);
		
		scroll2.setBounds(0, 192, 700, 443);
		scroll2.setVisible(false);
		
		scroll3 = new JScrollPane(sp);
		add(scroll3);
		
		scroll3.setBounds(0, 192, 700, 443);
		scroll3.setVisible(false);
		
		scroll4 = new JScrollPane(bp);
		add(scroll4);
		
		scroll4.setBounds(0, 192, 700, 443);
		scroll4.setVisible(false);
		
		add(bar_p);
		menuBarBtnAction();

		add(btm_p);
	}
	
	/**
	 	menuBar버튼 누를때 팝콘, 스낵, 음료로 바꿔주기
	*/
	public void menuBarBtnAction() {

		bar_p.comboBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				scroll2.setVisible(false);
				scroll3.setVisible(false);
				scroll4.setVisible(false);
		
				scroll1.setVisible(true);
			}
		});
		
		bar_p.popcornBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				scroll1.setVisible(false);
				scroll3.setVisible(false);
				scroll4.setVisible(false);
			
				scroll2.setVisible(true);
			}
		});
		
		bar_p.snackBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				scroll1.setVisible(false);
				scroll2.setVisible(false);
				scroll4.setVisible(false);
				
				scroll3.setVisible(true);
			}
		});
		
		bar_p.bvgBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				scroll1.setVisible(false);
				scroll2.setVisible(false);
				scroll3.setVisible(false);
				
				scroll4.setVisible(true);
			}
		});
	}
	
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}