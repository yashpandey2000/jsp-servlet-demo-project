<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<style>
#name{
text-align:center;
background-color: black;
padding:2px;
color:white;
}
</style>
<h2><a href ="login.jsp">Login</a></h2>
<div id="name">

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<form method="post" action="fpctl">
  <h1><font color="red">Forgot your password !</font></h1>


<%
				String s0 = (String) request.getAttribute("mail");

				if (s0!= null) {
			%>
			<h3>
				<font color="white"><%=s0%></font>
			</h3>
			<%
				}
			%>
			
			
			
			<%
				String s1 = (String) request.getAttribute("wrong");

				if (s1!= null) {
			%>
			<h3>
				<font color="red"><%=s1%></font>
			</h3>
			<%
				}
			%>
<label>EmailId:</label>
<input type="text"  name="emailid">
<input type="submit" value="Go">

<%
				String s = (String) request.getAttribute("error");

				if (s!= null) {
			%>
			<h3>
				<font color="red"><%=s%></font>
			</h3>
			<%
				}
			%>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
</form>
</div>
</body>
</html>