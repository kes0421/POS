package pos.admin.first;

import java.awt.Font;

import javax.swing.JLabel;

public class AdLabel extends JLabel{
	String text;
	
	public AdLabel(String text) {
		super(text);
		if(text.equals("���� ��Ȳ")) {
			setBounds(60, 230, 100, 100);
			setFont(new Font("�޸յձ�������", Font.PLAIN, 20));
		}else if(text.equals("��� ��Ȳ")) {
			setBounds(230, 230, 100, 100);
			setFont(new Font("�޸յձ�������", Font.PLAIN, 20));
		}
		
	}
}
