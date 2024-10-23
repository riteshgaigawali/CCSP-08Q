package learnjdbc.examples.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import learnjdbc.examples.entity.Student;

// data access object implementation
public class StudentDaoImpl implements StudentDao {

	private String url = "jdbc:mysql://localhost:3306/studentdao";
	private String username ="root";
	private String password ="ritesh@9901";
	
	private Connection getConnection() throws ClassNotFoundException, SQLException {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con = DriverManager.getConnection(url, username, password);
		
		return con;
	}
	
	// insert student info to database
	public void createStudent(Student stud) {
		try {
			Connection con = getConnection();
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO student_info(studName, address, email, age) VALUES(?,?,?,?)");
			pstmt.setString(1, stud.getStudName());
			pstmt.setString(2, stud.getAddress());
			pstmt.setString(3, stud.getEmail());
			pstmt.setInt(4, stud.getAge());
			pstmt.execute();
			con.commit();
			System.out.println("Data inserted successfully!!");
			con.close();
		}catch(Exception e) {
			System.out.println("Can't create student!!");
			e.printStackTrace();
		}

	}
	
	// get student form database
	public void readStudents() {
		try {
		Connection con = getConnection();
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM student_info");
		pstmt.execute();
		ResultSet rs = pstmt.getResultSet();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
		}
		}catch(Exception e) {
			System.out.println("Can't read student from database!!");
			e.printStackTrace();
		}
	}

	// update student info in database
	public void updateStudent(int studId) {
		try {
			Connection con = getConnection();
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("UPDATE student_info SET address='Pune' WHERE studId=?");
			pstmt.setInt(1, studId);
			pstmt.execute();
			con.commit();
			System.out.println("Data updated successfully!!");
			con.close();
		}catch(Exception e) {
			System.out.println("Can't update student!!");
			e.printStackTrace();
		}


	}

	//delete data form database
	public void deleteStudent(int studId) {
		try {
			Connection con = getConnection();
			con.setAutoCommit(false);
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM student_info WHERE studId=?");
			pstmt.setInt(1, studId);
			pstmt.execute();
			con.commit();
			System.out.println("Data deleted successfully!!");
			con.close();
			}catch(Exception e) {
				System.out.println("Can't read student from database!!");
				e.printStackTrace();
			}

	}

}
