package myconnection;

import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class testConnection {
  @Test
public void f() throws ClassNotFoundException, SQLException {
	  
	  //int i = 0;
	  
	  Class.forName("com.mysql.jdbc.Driver");
	  System.out.println("Driver loaded");
	  
	  Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/selenium","root","papaS769*");
	  System.out.println("Connected to DB");
	  
	  Statement stmt = con.createStatement();
	  ResultSet rs = stmt.executeQuery("select * from User;");
	  while(rs.next()) {
		String f1 = rs.getString("Firstname");
		System.out.println("Record names are " + f1);
		
		String f2 = rs.getString("email");
		System.out.println("Record email are" + f2);
		
		
		
	  }
  }
  
}
