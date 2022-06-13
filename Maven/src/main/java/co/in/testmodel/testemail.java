package co.in.testmodel;

import java.sql.SQLException;

import co.in.bean.regisbean;
import co.in.model.Emailid;

public class testemail {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		regisbean ss = new regisbean();
		
		ss.setEmailid("ritikpanchal2929@gmail.com");
		
		Emailid id = new Emailid();
		
		id.FindByEmailId(ss);
		
	}

}
