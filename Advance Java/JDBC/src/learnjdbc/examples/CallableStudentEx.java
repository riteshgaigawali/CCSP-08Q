package learnjdbc.examples;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStudentEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	     String url = "jdbc:mysql://localhost:3306/studentdao";
	     String username ="root";
	     String password ="ritesh@9901";
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection(url, username, password);
		
		// Get address count
		CallableStatement cstmt1 = con.prepareCall("{ CALL getAddressCount(?,?)}");
		String stud_address = "Chandrapur";
		cstmt1.setString(1, stud_address);
		cstmt1.registerOutParameter(2, Types.INTEGER);
		cstmt1.execute();
		int address_Count = cstmt1.getInt(2);
		System.out.println(address_Count);
		
		// Get name count
		CallableStatement cstmt2 = con.prepareCall("{ CALL getNameCount(?,?)}");
		String stud_name = "Aniket";
		cstmt2.setString(1, stud_name);
		cstmt2.registerOutParameter(2, Types.INTEGER);
		cstmt2.execute();
		int name_Count = cstmt2.getInt(2);
		System.out.println(name_Count);
		
		// Get address with student name
		CallableStatement cstmt3 = con.prepareCall("{ CALL getStudAddress(?,?)}");
		String std_name = "Ritesh";
		cstmt3.setString(1, std_name);
		cstmt3.registerOutParameter(2, Types.LONGVARCHAR);
		cstmt3.execute();
		String std_address = cstmt3.getString(2);
		System.out.println(std_address);
		
	}

}
