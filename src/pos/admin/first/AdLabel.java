package pos.admin.first;

import java.awt.Font;

import javax.swing.JLabel;

public class AdLabel extends JLabel{
	String text;
	
	public AdLabel(String text) {
		super(text);
		if(text.equals("¸ÅÃâ ÇöÈ²")) {
			setBounds(60, 230, 100, 100);
			setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		}else if(text.equals("Àç°í ÇöÈ²")) {
			setBounds(230, 230, 100, 100);
			setFont(new Font("¸¼Àº °íµñ", Font.BOLD, 20));
		}
		
	}
}
