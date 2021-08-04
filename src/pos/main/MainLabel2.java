package pos.main;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class MainLabel2 extends JLabel{
	private int x = 0;
	private Timer tm;
	
	public MainLabel2() {
		this.setHorizontalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("굴림", Font.BOLD, 50));
		this.setBounds(0, 263, 672, 198);
		
		setTimer();
	}
	
	private void setTimer() {
		tm = new Timer(1000, new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				setText(getTime());
			}
		});
		tm.start();
	}
	
	private String getTime() {
		Calendar t = Calendar.getInstance();
		int month = t.get(Calendar.MONTH);
		int date = t.get(Calendar.DATE);
		int ap = t.get(Calendar.AM_PM);
		int hour = t.get(Calendar.HOUR);
		int min = t.get(Calendar.MINUTE);
		int sec = t.get(Calendar.SECOND);
		String ampm = ap == Calendar.AM ? "AM" : "PM";
		return "" + (month + 1) + "월 " + date + "일 " + ampm + " " + hour + "시간 " + min + "분 " + sec + "초";
	}
}
