package co.in.testmodel;


import java.sql.SQLException;

import co.in.bean.regisbean;
import co.in.model.regismodel;




public class test {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		
		testregistration();

	}

	private static void testregistration() throws ClassNotFoundException, SQLException {
		
		regisbean bean = new regisbean();
		
		bean.setFullname("bfbfbf");
		bean.setContact("9860bfdd055");
		bean.setEmailid("yash   vdc");
		bean.setPassword("ng");
		bean.setConfirmpassword("12bb");
		
//	bean.setId("1");
//		
		regismodel model = new regismodel();
		
           model.register(bean);
		
	}
}
