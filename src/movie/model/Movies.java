package movie.model;

import java.util.Date;

public class Movies {
	int m_code;
	String m_name;
	String m_grade;
	Date m_openingdate;
	String m_genre;
	String m_runningtime;
	String m_poster_img;
	String m_grade_img;
			
	public Movies(int m_code, String m_name, String m_grade, Date m_openingdate, String m_genre, String m_runningtime,
			String m_poster_img, String m_grade_img) {
		super();
		this.m_code = m_code;
		this.m_name = m_name;
		this.m_grade = m_grade;
		this.m_openingdate = m_openingdate;
		this.m_genre = m_genre;
		this.m_runningtime = m_runningtime;
		this.m_poster_img = m_poster_img;
		this.m_grade_img = m_grade_img;
	}
	
	public int getM_code() {
		return m_code;
	}
	public void setM_code(int m_code) {
		this.m_code = m_code;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_grade() {
		return m_grade;
	}
	public void setM_grade(String m_grade) {
		this.m_grade = m_grade;
	}
	public Date getM_openingdate() {
		return m_openingdate;
	}
	public void setM_openingdate(Date m_openingdate) {
		this.m_openingdate = m_openingdate;
	}
	public String getM_genre() {
		return m_genre;
	}
	public void setM_genre(String m_genre) {
		this.m_genre = m_genre;
	}
	public String getM_runningtime() {
		return m_runningtime;
	}
	public void setM_runningtime(String m_runningtime) {
		this.m_runningtime = m_runningtime;
	}
	public String getM_poster_img() {
		return m_poster_img;
	}
	public void setM_poster_img(String m_poster_img) {
		this.m_poster_img = m_poster_img;
	}
	public String getM_grade_img() {
		return m_grade_img;
	}
	public void setM_grade_img(String m_grade_img) {
		this.m_grade_img = m_grade_img;
	}
	
	
}
