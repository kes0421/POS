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
        this.setFont(new Font("�޸յձ�������", Font.PLAIN, 35));
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
            sday += "�Ͽ���";
        }else if(day == 2) {
            sday += "������";
        }else if(day == 3) {
            sday += "ȭ����";
        }else if(day == 4) {
            sday += "������";
        }else if(day == 5) {
            sday += "�����";
        }else if(day == 6) {
            sday += "�ݿ���";
        }else if(day == 7) {
            sday += "�����";
        }

        return "" + (month + 1) + "��" + date + "�� " + sday;
    }
}
