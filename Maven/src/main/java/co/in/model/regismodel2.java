package co.in.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import co.in.bean.regisbean;

public class regismodel2 {

	public void register(regisbean user) throws ClassNotFoundException, SQLException {
		
		
		//ResourceBundle rs = ResourceBundle.getBundle("co.in.rays.rb.app");
		Class.forName(("com.mysql.jdbc.Driver"));
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
		
		conn.setAutoCommit(false);
		
		
		PreparedStatement ps = conn.prepareStatement("select password from user where emailid=?");
		
		
		
		
		 ps.setString(1,user.getEmailid());
		
		
	
		 
	
		ResultSet rs = ps.executeQuery();
		 
		System.out.println("working");
//		System.out.println("username"+"|"+"password");
//		
		while(rs.next()) {
			user.setPassword(rs.getString(1));
			System.out.println(rs.getString(1));
			 
		 }
//		 
		  
		 
		 
		conn.commit();
		
//		System.out.println("inserted");
		
		conn.close();
		ps.close();
		
		
		
		
	}
	
}
