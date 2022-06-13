<%@page import="co.in.model.studentmodel"%>
<%@ page import="co.in.bean.student"  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="bean" scope="page" class="co.in.bean.student"></jsp:useBean>
<jsp:setProperty property="*" name="bean"/>
<jsp:getProperty property="rollno" name="bean"/>
<jsp:getProperty property="firstname" name="bean"/>
<jsp:getProperty property="lastname" name="bean"/>
<jsp:getProperty property="session" name="bean"/>
<% 
String ss = request.getParameter("operation");
if(ss.equals("Add")){
	studentmodel model = new studentmodel();
	model.add(bean);	
}
%>
</body>
</html>
