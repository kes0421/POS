package products.view;

import javax.swing.JPanel;

public class AdPanel extends JPanel {
	
	// ����迭 ���� 
	String[] ads = {"./img/mainFrame/�޺�����1.png","./img/mainFrame/�޺�����2.png","./img/mainFrame/�޺�����3.png",
			"./img/mainFrame/�޺�����4.png","./img/mainFrame/�޺�����5.png"};
	
	public AdPanel() {
		setBounds(0, 0, 700, 116);
		setLayout(null);
		setVisible(true);
		
		ImageSlide img_slide = new ImageSlide(ads);
		img_slide.setBounds(0, 0, 700, 116);
		add(img_slide);
		
		// ������� (���λ����ڿ��� ȣ�� �� �ڵ�)
		img_slide.tm.start();
		
	}
}