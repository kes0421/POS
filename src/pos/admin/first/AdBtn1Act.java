package pos.admin.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import pos.admin.sales.first.S1Frame;

public class AdBtn1Act implements ActionListener{
	JFrame mainF;
	
	public AdBtn1Act(JFrame mainF) {
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		new S1Frame();  
		mainF.dispose();
	}
	
}
