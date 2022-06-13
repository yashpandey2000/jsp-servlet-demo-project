package co.in.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.in.bean.student;
import co.in.model.studentmodel;


public class studentctl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		student bean = new student();
		bean.setRollno(request.getParameter("rollno"));
		bean.setFirstname(request.getParameter("firstname"));
		bean.setLastname(request.getParameter("lastname"));
		bean.setSession(request.getParameter("session"));
		
		studentmodel model = new studentmodel();
	
		String ss = request.getParameter("operation");
		
		if (ss.equals("Add")){
			
			
			try {
				model.add(bean);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			PrintWriter pw = response.getWriter();
			pw.print("successfully added");
			
		}
		
		else if(ss.equals("Delete")){
			
			
		try {
			model.delete(bean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PrintWriter pw = response.getWriter();
		pw.print("deleted");
		
		}
		
		else if (ss.equals("Modify")){
			
			
			
			try {
				model.update(bean);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			PrintWriter pw = response.getWriter();
			pw.print("modified");
		}
		
		
		else if (ss.equals("Get")){
			ArrayList<student> list = new ArrayList<student>();
			try {
				
				
			list = 	model.get(bean);
				
			RequestDispatcher rd = request.getRequestDispatcher("studentsearch.jsp");
			
			request.setAttribute("studentdata",list);
			rd.forward(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
			
		}
		
		
		else if(ss.equals("search")){
			
			ArrayList<student> list = new ArrayList<student>();
			System.out.println(list);
		try {
		list = 	model.search(bean);
		
		RequestDispatcher rd = request.getRequestDispatcher("studentsearch.jsp");
		
		request.setAttribute("studentdata",list);
		rd.forward(request, response);
		
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
				
	}
	
}}
