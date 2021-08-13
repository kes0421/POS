package pos.admin.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import admin.view.MainFrame;

public class AdBtn2Act implements ActionListener{
	JFrame mainF;
	
	public AdBtn2Act(JFrame mainF) {
		this.mainF = mainF;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			new MainFrame().setVisible(true);
			mainF.dispose();
	}
}
