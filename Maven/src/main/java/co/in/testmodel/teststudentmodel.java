package co.in.testmodel;

import java.sql.SQLException;

import co.in.bean.student;
import co.in.model.studentmodel;

public class teststudentmodel {

	public static void main(String[] args) throws Exception {
		
		//testadd();
		//testupdate();
		//testdelete();
		//testget();
	//	testsearch();
		

	}

	private static void testsearch() throws ClassNotFoundException, SQLException  {

		
		student bean = new student();
		
		studentmodel model = new studentmodel();
		
		model.search(bean);
		
		
	}

	private static void testget() throws ClassNotFoundException, SQLException {
		
student bean = new student();
		
		bean.setRollno("102");
		
		studentmodel model = new studentmodel();
		
		model.get(bean);
		
	}

	private static void testdelete() throws ClassNotFoundException, SQLException {
		
		student bean = new student();
		
		bean.setRollno("103");
		
		studentmodel model = new studentmodel();
		
		model.delete(bean);
			
		
	}

	private static void testupdate() throws ClassNotFoundException, Exception {
		
student bean = new student();
		
		bean.setRollno("103");
		bean.setFirstname("mohan");
		bean.setLastname("kumar");
		bean.setSession("2020-21");
		
	studentmodel model = new studentmodel();
		
model.update(bean);
				
	}

	private static void testadd() throws ClassNotFoundException, SQLException {
		
		student bean = new student();
		
		bean.setRollno("103");
		bean.setFirstname("geeta");
		bean.setLastname("mehta");
		bean.setSession("2020-21");
		
	studentmodel model = new studentmodel();
		
model.add(bean);
		
	}

}
