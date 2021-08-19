package movie.selectmovie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;

public class DateSelectButton implements ActionListener{
	String date;
	public static int day_of_week;
	public static JButton dateButton;
	
	public JButton dateSelect() {
		dateButton = new JButton("select");
		dateButton.setBounds(210, 100, 50, 40);
		dateButton.setVisible(true);
		dateButton.addActionListener(this);
		
		return dateButton;
	}
	
	public void setDay() throws ParseException  {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date day = format.parse(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(day);
		day_of_week = cal.get(Calendar.DAY_OF_WEEK);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DateJList dl = new DateJList();
		date = dl.selectedDate;
		try {
			setDay();
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		MakeMoviePanel mmp = new MakeMoviePanel();
		mmp.userDate = dl.selectedDate;
		
		SelectMovieMain.frame.dispose();
		
		SelectMovieMain.frame = new SelectMovieMain();
		SelectMovieMain.frame.setDefaultOptions();	
	}		
}







