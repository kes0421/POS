package pos.main;

import java.awt.Color;
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
        this.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 35));
        this.setForeground(Color.WHITE);
        this.setBounds(0, 200, 672, 180);

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
        int day = t.get(Calendar.DAY_OF_WEEK);

        String sday = "";
        if(day == 1) {
            sday += "일요일";
        }else if(day == 2) {
            sday += "월요일";
        }else if(day == 3) {
            sday += "화요일";
        }else if(day == 4) {
            sday += "수요일";
        }else if(day == 5) {
            sday += "목요일";
        }else if(day == 6) {
            sday += "금요일";
        }else if(day == 7) {
            sday += "토요일";
        }

        return "" + (month + 1) + "월" + date + "일 " + sday;
    }
}
