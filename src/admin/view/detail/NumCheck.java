package admin.view.detail;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;

public class NumCheck extends KeyAdapter{

	public JLabel msg = new JLabel();
	
	@Override
	public void keyTyped(KeyEvent e) {
		if(!(e.getKeyChar() >= '0' && e.getKeyChar() <= '9')) {
			msg.setText("���ڸ� �Է� �����մϴ�.");
			e.setKeyChar('\u0000');
		}else {
			msg.setText("");
		}
	}
}