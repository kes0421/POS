package pos.advancedTickect.first;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class At1NumbtnsAct implements ActionListener{
	String text;
	JLabel at1L3;
	
	public At1NumbtnsAct(String text, JLabel at1L3) {
		this.text = text;
		this.at1L3 = at1L3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(at1L3.getText().equals("?·?λ¦?(11?λ¦?)λ₯? ?? ₯?΄μ£ΌμΈ?.")) {
			at1L3.setText("" + text);
		}else {
			at1L3.setText(at1L3.getText() + text);
		}
		
		if(at1L3.getText().length() == 12) {
			JOptionPane.showMessageDialog(null, "?€??? ₯?΄μ£ΌμΈ?");
			at1L3.setText("?·?λ¦?(11?λ¦?)λ₯? ?? ₯?΄μ£ΌμΈ?.");
		}
	}
	
}
