package movie.selectmovie;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import movie.model.Movies;
import movie.model.Seats;
import movie.model.Timetables;
import util.DBUtill;

public class DBList {
	public ArrayList moviesList(){
		String sql = "SELECT * FROM movies ORDER BY m_code";
		ArrayList<Movies> movies = new ArrayList();
		try (
			Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){

			while(rs.next()) {
				movies.add(new Movies(
						rs.getInt("m_code"),
						rs.getString("m_name"),
						rs.getString("m_grade"),
						rs.getDate("m_openingdate"),
						rs.getString("m_genre"),
						rs.getString("m_runningtime"),
						rs.getString("m_poster_img"),
						rs.getString("m_grade_img")
				));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return movies; 
	}
	
	public ArrayList timeTablesList(){
		String sql = "SELECT * FROM timetables ORDER BY t_code";
		ArrayList<Timetables> timetables = new ArrayList();
		try (
			Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){

			while(rs.next()) {
				timetables.add(new Timetables(
						rs.getString("t_code"),
						rs.getDate("t_date"),
						rs.getString("t_start"),
						rs.getString("t_end"),
						rs.getString("t_name"),
						rs.getString("t_floor"),
						rs.getInt("m_code")
				));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return timetables; 
	}
	
	public ArrayList seatsList(){
		String sql = "SELECT * FROM seats ORDER BY s_code";
		ArrayList<Seats> seats = new ArrayList();
		try (
			Connection conn = DBUtill.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		){

			while(rs.next()) {
				seats.add(new Seats(
						rs.getInt("s_code"),
						rs.getString("s_name"),
						rs.getString("s_grade"),
						rs.getInt("s_price"),
						rs.getString("t_code")
				));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return seats; 
	}
}