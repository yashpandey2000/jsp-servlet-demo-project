package co.in.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import co.in.bean.regisbean;
import co.in.model.regismodel;


@WebServlet("/registration")
public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	

		
		
	
		
			response.setContentType("text/html");
			String fullname = request.getParameter("fullname");
			String email = request.getParameter("emailid");
			String contact = request.getParameter("contact");
			String password = request.getParameter("password");
			String cp = request.getParameter("confirmpassword");
			
			
			regisbean user = new regisbean();

       	 user.setFullname(fullname);
			user.setEmailid(email);
			user.setContact(contact);
			user.setPassword(password);
			user.setConfirmpassword(cp);
		
			boolean a = false;
		a =	validate(user, request);
		
		if(a){
			
			RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
		    rd.forward(request, response);
		}
		
			
         else{
        	 

			regismodel model = new regismodel();

			try {	model.register(user); 
		 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		}
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		request.setAttribute("registered", "Registration successful");
		rd.forward(request, response);
			
//		PrintWriter out = response.getWriter();
//		
//		out.print("data has been saved successfuly");
//		
//		out.close();

	}

}


	private boolean validate(regisbean user, HttpServletRequest request) {
		boolean a = false;		
		
		if(user.getFullname()==""){
			
		    request.setAttribute("fullname", "**please enter the fullname field");
		    a=true;
			}
			
		else   if(user.getFullname().length() < 3 || user.getFullname().length() > 20){
				
			     request.setAttribute("fullname", "**fullname length is between 3 to 20");
			      
			     a=true; 
			 }
			
		    
			 if(user.getEmailid()==""){
				
			    request.setAttribute("email", "**please enter the email field");	
			    a=true;
			}
			 
			 if (user.getContact()==""){
				
			    request.setAttribute("contact", "**please enter the contact field");
			    a=true;
			}
			
			 if(user.getPassword()==""){
				
			
			    request.setAttribute("password" ,"**please enter the password field");
			    a=true;
			}
			 
			
			 else  if (user.getPassword().length()<5 || user.getPassword().length()>20){
				
			     request.setAttribute("password" ,"**password length is betwwen 5 to 20");
			  a=true;
				 
			 }
			
			 if(user.getConfirmpassword()==""){
			 	
			    request.setAttribute("cp", "**please enter the confrmpassword field");
			    a=true;
			}
			 
			 else if(!user.getPassword().equals(user.getConfirmpassword()) ){
//				
				 request.setAttribute("cp", "**password are not matching");
				    a=true;
				
			} 
			 
		return a;
	}

		
	}
