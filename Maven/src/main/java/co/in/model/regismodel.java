
package co.in.model;

	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ResourceBundle;

	import co.in.bean.regisbean;


	public class regismodel {

		
		public void register(regisbean user) throws ClassNotFoundException, SQLException {
			
			
			//ResourceBundle rs = ResourceBundle.getBundle("co.in.rays.rb.app");
			Class.forName(("com.mysql.jdbc.Driver"));
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
			
			conn.setAutoCommit(false);
			
			PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?)");
			
			
			
			
			 ps.setString(1,user.getFullname());
			 ps.setString(2,user.getEmailid());
			 ps.setString(3, user.getContact()); 
			 ps.setString(4,user.getPassword());
			 ps.setString(5,user.getConfirmpassword());
			 ps.executeUpdate();
			 
			  
			 
			 
			conn.commit();
			
			System.out.println("inserted");
			
			conn.close();
			ps.close();
			
			
			
			
		}
		
		

}
