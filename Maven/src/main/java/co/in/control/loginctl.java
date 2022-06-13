package co.in.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.in.bean.regisbean;
import co.in.model.regismodel;
import co.in.model.regismodel1;

public class loginctl extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login=request.getParameter("fullname");
		String pwd=request.getParameter("password");
		
		regisbean user = new regisbean();
		
		user.setFullname(login);
	
		


		
		boolean a = false;
		a =	validate(user, request);
		
		
		if(a){
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		    rd.forward(request, response);
		}
		
		
			
		else{	
		regismodel1 model = new regismodel1();
		
		try {
			model.register(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		String password = user.getPassword();
	    String fn = user.getFullname();
		
		
		if( pwd.equals(password)){
		HttpSession session = request.getSession();
		session.setAttribute("name",fn);
		//System.out.println(session);
		//System.out.println(session.getId());
		Cookie ck = new Cookie(fn,password);
		ck.setMaxAge(24*60*60);
		response.addCookie(ck);
		//PrintWriter out = response.getWriter();
		Cookie[] cki = request.getCookies();
		for (Cookie cs : cki) {
			String s1 = cs.getName();
			String s2 = cs.getValue();
		//	out.print(s1 +" "+s2);
		}
		RequestDispatcher rd = request.getRequestDispatcher("/welcomectl.do");
	   // request.setAttribute("name","Hi, "+fn);
		rd.forward(request, response);
		}
		
		else 
		{
			
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		request.setAttribute("error","invalid UserId or Password");
		rd.forward(request, response);
		
		
	}
		
		
	
	}}


	private boolean validate(regisbean user, HttpServletRequest request) {
		
		boolean a = false;
		
        if(request.getParameter("fullname")==""){
			
			request.setAttribute("fn","please fill the fullname field");
			a=true;
		}
		

		if(request.getParameter("password")==""){
			
			request.setAttribute("pwd","please fill the password field");
			a=true;
		}	
			
		return a;
	}}

