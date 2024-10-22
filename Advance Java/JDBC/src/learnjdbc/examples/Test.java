package learnjdbc.examples;

import java.sql.*;  

class Test {  
    public static void main(String args[]) {  
        try {  
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");  

            // Connect to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank1", "root", "ritesh@9901");  
            
            // Create a statement to execute SQL queries
            Statement stmt = con.createStatement();  

            // Query the table, enclosing the table name with a hyphen in backticks
            ResultSet rs = stmt.executeQuery("select * from `bankinfo`");  

            // Process and print the result set
            while(rs.next()) {  
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));  
            }  

            // Close the connection
            con.close();  
        } catch(Exception e) { 
            System.out.println(e); 
        }  
    }  
}
