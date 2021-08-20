package pos.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class MainLabel3 extends JLabel{
    private int x = 0;
    private Timer tm;

    public MainLabel3() {
        this.setHorizontalAlignment(SwingConstants.CENTER);
        this.setFont(new Font("ÈŞ¸ÕµÕ±ÙÇìµå¶óÀÎ", Font.PLAIN, 90));
        this.setForeground(Color.WHITE);
        this.setBounds(0, 280, 672, 198);

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
        int ap = t.get(Calendar.AM_PM);
        int hour = t.get(Calendar.HOUR);
        int min = t.get(Calendar.MINUTE);
        String ampm = ap == Calendar.AM ? "AM" : "PM";

        String shour = "";
        String smin = "";
        if(hour >= 0 && hour <= 9) {
            shour += "0" + hour;
        }else {
            shour += hour;
        }

        if(min >= 0 && min <= 9) {
            smin += "0" + min;
        }else {
            smin += min;
        }

        return "" + shour + ":" + smin + ampm;
    }
}
