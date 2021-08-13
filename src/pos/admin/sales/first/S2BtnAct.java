package pos.admin.sales.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import pos.admin.sales.second.S2Frame;

public class S2BtnAct implements ActionListener{
	String date;
	
	public S2BtnAct(String date) {
		this.date = date;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new S2Frame(date);
	}

}
