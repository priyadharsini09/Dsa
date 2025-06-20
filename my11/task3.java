package my11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class task3 {
	
	public static void main (String args[]) throws ClassNotFoundException, SQLException {
	   	 Class.forName("com.mysql.jdbc.Driver");
	   	 String url="jdbc:mysql://localhost:3306/test_db";
	   	 String username="root";
	   	 String password="Kgisl@123";
	   	 Connection con =DriverManager.getConnection(url,username,password);
	   	 Statement stmt = con.createStatement();
	   	 
	   	 String query="delete from student where id=1";
	   	 stmt.executeUpdate(query);

}
}
