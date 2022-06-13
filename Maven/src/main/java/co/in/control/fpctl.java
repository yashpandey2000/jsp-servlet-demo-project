package co.in.control;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.in.bean.regisbean;
import co.in.model.regismodel2;

public class fpctl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String s1 = request.getParameter("emailid");
		if(s1==""){
			RequestDispatcher rs = request.getRequestDispatcher("fp.jsp");
			request.setAttribute("error","**please fill the email field");
			rs.forward(request, response);
			
		}
		
		
		else{
          regisbean user = new regisbean();
		
		user.setEmailid(s1);
		
		//	System.out.println(user.getEmailid());
		regismodel2 model = new regismodel2();
		try {

		model.register(user);
	
//		PrintWriter pw = response.getWriter();
//		pw.print(pwd);

   //System.out.println("password is :"+pwd);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String pwd = user.getPassword();

		if(pwd!=null){
		RequestDispatcher rs = request.getRequestDispatcher("fp.jsp");
			request.setAttribute("mail","your password is:"+pwd);
			rs.forward(request, response);
			}
		else{
			RequestDispatcher rs = request.getRequestDispatcher("fp.jsp");
			request.setAttribute("wrong","emailid does not exist");
			rs.forward(request, response);
		}
			
			
		}
		
		
	}}


