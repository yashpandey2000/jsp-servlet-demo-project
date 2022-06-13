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
#name {
	text-align: center;
	background-color: black;
	padding: 2px; 
	color: white;
}
</style>

<%@ include file="header.jsp" %>

	<form action="loginctl" method="post">
	<h3>hi,guest</h3>
		<div id="name">
			<br> <br> <br> <br> <br> <br> <br>
			<br>
			
			
			
	<%
				String s0 = (String) request.getAttribute("registered");

				if (s0 != null) {
			%>
			<h1>
				<font color="green"><%=s0%></font>
			</h1>
			<%
				}
			%>		
			
			

			<h1>Login</h1>
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


			<label>LoginId</label> <input type="text" name="fullname"><br></br>

<%
				String s1 = (String) request.getAttribute("fn");

				if (s1 != null) {
			%>
			<h3>
				<font color="red"><%=s1%></font>
			</h3>
			<%
				}
			%>
			<label>Password</label> <input type="text" name="password"><br></br>

<%
				String s2 = (String) request.getAttribute("pwd");

				if (s2 != null) {
			%>
			<h3>
				<font color="red"><%=s2%></font>
			</h3>
			<%
				}
			%>
			<br> <br> <input type="submit" value="login"><br></br>
			
		<a href ="registration.jsp"><font color = "red">signup</font></a> | <a href="fp.jsp"><font color = "red">forgotpassword</font></a>
			 <br>
			<br> <br> <br> <br> <br> <br> <br>
			<br> <br> <br> <br>
		</div>
	</form>
	<%@ include file="footer.jsp" %>
</body>
</html>