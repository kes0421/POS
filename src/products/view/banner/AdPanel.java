package products.view.banner;

import javax.swing.JPanel;

public class AdPanel extends JPanel {
	
	// ±¤°í¹è¿­ ±¸¼º 
	String[] ads = {"./img/mainFrame/ÄÞº¸±¤°í1.png","./img/mainFrame/ÄÞº¸±¤°í2.png","./img/mainFrame/ÄÞº¸±¤°í3.png","./img/mainFrame/ÄÞº¸±¤°í4.png"};
	
	public AdPanel() {
		setBounds(0, 0, 700, 116);
		setLayout(null);
		setVisible(true);
		
		ImageSlide img_slide = new ImageSlide(ads);
		img_slide.setBounds(0, 0, 700, 116);
		add(img_slide);
		
		// ±¤°í½ÃÀÛ (¸ÞÀÎ»ý¼ºÀÚ¿¡¼­ È£Ãâ ÇÒ ÄÚµå)
		img_slide.tm.start();
		
	}
}