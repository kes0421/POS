package pos.admin.first;

import java.awt.Font;

import javax.swing.JLabel;

public class AdLabel extends JLabel{
	String text;
	
	public AdLabel(String text) {
		super(text);
		if(text.equals("매출 현황")) {
			setBounds(60, 230, 100, 100);
			setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		}else if(text.equals("재고 현황")) {
			setBounds(230, 230, 100, 100);
			setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 20));
		}
		
	}
}
