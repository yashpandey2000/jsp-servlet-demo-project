package co.in.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.in.bean.regisbean;
import co.in.model.Emailid;
import co.in.model.regismodel;


public class Emailctl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    		
    		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s1 = request.getParameter("emailid");
		
		
		regisbean bean = new regisbean();
		
		bean.setEmailid(s1);
		
		Emailid id = new Emailid();
		try {
			id.FindByEmailId(bean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("hello...");
		String ss = bean.getFullname();
		System.out.println(ss);
		System.out.println(s1);
		if(s1.equals(ss))
		{
			
			RequestDispatcher rd = request.getRequestDispatcher("Email.jsp");
			request.setAttribute("error","email id , already exist ! please enter another one");
			rd.forward(request, response);
			}
		
		else 
		{
			RequestDispatcher rd = request.getRequestDispatcher("Email.jsp");
			request.setAttribute("error","email id does not exist" );
			rd.forward(request, response);	
			
		}
		
		
	}

}
