package movie.model;

import java.util.Date;

public class Timetables {
	String t_code;
	Date t_date;
	String t_start;
	String t_end;
	String t_name;
	String t_floor;
	int m_code;
	
	
	public Timetables(String t_code, Date t_date, String t_start, String t_end, String t_name, String t_floor,
			int m_code) {
		super();
		this.t_code = t_code;
		this.t_date = t_date;
		this.t_start = t_start;
		this.t_end = t_end;
		this.t_name = t_name;
		this.t_floor = t_floor;
		this.m_code = m_code;
	}


	public String getT_code() {
		return t_code;
	}


	public void setT_code(String t_code) {
		this.t_code = t_code;
	}


	public Date getT_date() {
		return t_date;
	}


	public void setT_date(Date t_date) {
		this.t_date = t_date;
	}


	public String getT_start() {
		return t_start;
	}


	public void setT_start(String t_start) {
		this.t_start = t_start;
	}


	public String getT_end() {
		return t_end;
	}


	public void setT_end(String t_end) {
		this.t_end = t_end;
	}


	public String getT_name() {
		return t_name;
	}


	public void setT_name(String t_name) {
		this.t_name = t_name;
	}


	public String getT_floor() {
		return t_floor;
	}


	public void setT_floor(String t_floor) {
		this.t_floor = t_floor;
	}


	public int getM_code() {
		return m_code;
	}


	public void setM_code(int m_code) {
		this.m_code = m_code;
	}
	
	
}
