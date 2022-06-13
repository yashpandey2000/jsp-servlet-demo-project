<%@page import="java.util.ArrayList"%>

<%@page import="co.in.bean.student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">

<h1 align="center">Student List</h1>
<table border="1" width="500" align="center">

<tr>
<th>student rollno</th>
<th>student firstname</th>
<th>student lastname</th>
<th>student session</th>
</tr>



<%ArrayList<student> list = (ArrayList<student>)request.getAttribute("studentdata");
for (student ss:list){%>

<tr>
<td><%=ss.getRollno() %></td>
<td><%=ss.getFirstname()%></td>
<td><%=ss.getLastname() %></td>
<td><%=ss.getSession() %></td>
</tr>

<%} %>
</table>
</body>
</html>