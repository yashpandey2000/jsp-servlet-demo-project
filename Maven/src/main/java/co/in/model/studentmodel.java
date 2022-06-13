package co.in.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import co.in.bean.student;




public class studentmodel {
	
	public void add(student bean) throws ClassNotFoundException, SQLException{
	
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
		
		conn.setAutoCommit(false);
		
	PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
	
	ps.setString(1, bean.getRollno());
	ps.setString(2, bean.getFirstname());
	ps.setString(3, bean.getLastname());
	ps.setString(4, bean.getSession());
	
	ps.executeUpdate();
	
	conn.commit();
	System.out.println("inserted");
	ps.close();
    conn.close();		
	}




public void update(student bean) throws ClassNotFoundException, SQLException{
	
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
	
	conn.setAutoCommit(false);
	
PreparedStatement ps = conn.prepareStatement("update student set firstname=?,lastname=?,session=? where rollno=?");

ps.setString(1, bean.getFirstname());
ps.setString(2, bean.getLastname());
ps.setString(3, bean.getSession());
ps.setString(4, bean.getRollno());

ps.executeUpdate();

conn.commit();
System.out.println("updated");
ps.close();
conn.close();			
	
}


public void delete(student bean) throws SQLException, ClassNotFoundException{
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
	
	conn.setAutoCommit(false);
	
PreparedStatement ps = conn.prepareStatement("delete from student where rollno=?");


ps.setString(1, bean.getRollno());

ps.executeUpdate();

conn.commit();
System.out.println("deleted");
ps.close();
conn.close();			
	
}

public static ArrayList<student> get(student bean) throws SQLException, ClassNotFoundException{
	
	
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
	
	conn.setAutoCommit(false);
	
	ArrayList<student> lll = new ArrayList<student>();
	
PreparedStatement ps = conn.prepareStatement("select * from student where rollno=?");

ps.setString(1,bean.getRollno());

ResultSet rs = ps.executeQuery();

System.out.println("rollno"+"\t"+"firstname"+"\t"+"lastname"+"\t"+"session");

while(rs.next()){
	
	bean.setRollno(rs.getString(1));
	bean.setFirstname(rs.getString(2));
	bean.setLastname(rs.getString(3));
	bean.setSession(rs.getString(4));
	
	lll.add(bean);
	
}

conn.commit();

ps.close();
conn.close();
return lll;
		
	
}
	





public static ArrayList<student> search(student bean) throws SQLException, ClassNotFoundException{
	
	
	
Class.forName("com.mysql.jdbc.Driver");
	
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","root");
	
	conn.setAutoCommit(false);
	
	ArrayList<student> ll = new ArrayList<student>();
	
PreparedStatement ps = conn.prepareStatement("select * from student");


ResultSet rs = ps.executeQuery();

System.out.println("rollno"+"\t"+"firstname"+"\t"+"lastname"+"\t"+"session");

while(rs.next()){
	
	
student std = new student();
	std.setRollno(rs.getString(1));
	std.setFirstname(rs.getString(2));
	std.setLastname(rs.getString(3));
	std.setSession(rs.getString(4));
	
//  bean.setRollno(rs.getString(1));
//  System.out.print(rs.getString(1));
//  bean.setFirstname("\t"+rs.getString(2));
//  System.out.print(rs.getString(2));
//  bean.setLastname("\t"+rs.getString(3));
//  System.out.print(rs.getString(3));
//  bean.setSession("\t"+rs.getString(4));
//  System.out.println(rs.getString(4));
  ll.add(std);
	
}
conn.commit();
ps.close();
conn.close();

return ll;	

	
}


}
