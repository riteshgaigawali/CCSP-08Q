package learnjdbc.examples.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import learnjdbc.examples.entity.Movie;

public class MovieDaoImpl implements MovieDao {

	private String url = "jdbc:mysql://localhost:3306/moviesdao";
	private String username ="root";
	private String password ="ritesh@9901";
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con = DriverManager.getConnection(url, username, password);
		
		return con;
	}
	
	public void addMovie(Movie movie) {
		try {
			Connection con = getConnection();
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO movies_info(movie_name, director, imdb_rating, yor) VALUES(?,?,?,?)");
			pstmt.setString(1, movie.getMovie_name());
			pstmt.setString(2, movie.getDirector());
			pstmt.setDouble(3, movie.getImdb_rating());
			pstmt.setInt(4, movie.getYor());
			pstmt.execute();
			con.commit();
			System.out.println("Data inserted successfully!!");
			con.close();
		}catch(Exception e) {
			System.out.println("Can't create movie!!");
			e.printStackTrace();
		}

	}

	public void getAllMovies() {
		try {
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM movies_info");
			pstmt.execute();
			ResultSet rs = pstmt.getResultSet();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getDouble(4)+" "+rs.getInt(5));
			}
			}catch(Exception e) {
				System.out.println("Can't read movie from database!!");
				e.printStackTrace();
			}

	}

	public void updateMovie(int id) {
		try {
		Connection con = getConnection();
		con.setAutoCommit(false);
		PreparedStatement pstmt = con.prepareStatement("UPDATE movies_info SET imdb_rating = ? WHERE movie_id = ?");
		double rating = 9.5;
		pstmt.setDouble(1, rating);
		pstmt.setInt(2, id);
		pstmt.execute();
		con.commit();
		System.out.println("Data updated successfully!!");
		con.close();
	}catch(Exception e) {
		System.out.println("Can't update movie!!");
		e.printStackTrace();
	}

	}

	public void deleteMovie(int id) {
		try {
			Connection con = getConnection();
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM movies_info WHERE movie_id = ?");
			pstmt.setInt(1, id);
			pstmt.execute();
			con.commit();
			System.out.println("Movie deleted successfully!!");
			}catch(Exception e) {
				System.out.println("Can't delete movie from database!!");
				e.printStackTrace();
			}

	}

}
