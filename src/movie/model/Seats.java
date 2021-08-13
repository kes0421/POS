package movie.model;

public class Seats {
	int s_code;
	String s_name;
	String s_grade;
	int s_price;
	String t_code;
	
	public Seats(int s_code, String s_name, String s_grade, int s_price, String t_code) {
		super();
		this.s_code = s_code;
		this.s_name = s_name;
		this.s_grade = s_grade;
		this.s_price = s_price;
		this.t_code = t_code;
	}

	public int getS_code() {
		return s_code;
	}

	public void setS_code(int s_code) {
		this.s_code = s_code;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getS_grade() {
		return s_grade;
	}

	public void setS_grade(String s_grade) {
		this.s_grade = s_grade;
	}

	public int getS_Price() {
		return s_price;
	}

	public void setS_Price(int s_price) {
		this.s_price = s_price;
	}

	public String getT_code() {
		return t_code;
	}

	public void setT_code(String t_code) {
		this.t_code = t_code;
	}
	
	
}
