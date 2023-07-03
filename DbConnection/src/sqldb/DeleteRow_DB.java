package sqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRow_DB {
		 public static void main(String[] args) throws ClassNotFoundException, SQLException {
		        // Database credentials
		        String url = "jdbc:mysql://localhost:3306/user_names";
		        String username = "root";
		        String password = "sush";
		        String query = "Delete from Username Where SNO = 5;";
		        
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection connection = DriverManager.getConnection(url, username, password);
		        Statement stmt = connection.createStatement();
		        stmt.execute(query);

	
		 
	}
}
	


