package sqldb;

import java.sql.*;

public class storedProcudereDB {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/user_names";
        String username = "root";
        String password = "sush";
        String query = "{call AllUser()}";
        
        // Establish the connection
      
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next()) {
            	System.out.print("SNO :" + rs.getString("SNO") +"\t");
          	    System.out.print("Username :" + rs.getString("Username") + "\t");
          	    System.out.print("User ID :" + rs.getString("userid") + "\t");
          	    System.out.print("Price :" + rs.getString("Price") + "\t");
           	    System.out.println();
            	
            }
            
            
            // Connection successful
            System.out.println("Connected to the database!");
            
            // Use the connection for database operations
            
            // Close the connection
            connection.close();
            
            System.out.println("Connection closed.");
       
        }
    }
