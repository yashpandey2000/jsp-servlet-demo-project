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

<form action ="registration" method = "post" >
<div id ="name">
<h1>Registration</h1>



<label>fullname</label>
<input type="text" name="fullname" placeholder="name"<% String fn = (String) request.getParameter("fullname");if(fn!= null){ %>value="<%=fn%>"<%} %>><br></br>


<% String ss = (String) request.getAttribute("fullname");
if(ss!= null){ %>
	
    <h3><font color="red"><%=ss%></font></h3> 
    
     <%} %>

<label>emailid</label>
<input type="text" name="emailid" placeholder="emailid" <% String em = (String) request.getParameter("emailid");if(em!= null){ %>value="<%=em%>"<%} %>><br></br>

<% String s1 = (String) request.getAttribute("email");
if(s1!= null){ %>
	
    <h3><font color="red"><%=s1%></font></h3> 
    
     <%} %>

<label>contact</label>
<input type="text" name="contact"  placeholder="contact"  <% String cc = (String) request.getParameter("contact");if(cc!= null){ %>value="<%=cc%>"<%} %> ><br></br>

<% String s2 = (String) request.getAttribute("contact");
if(s2!= null){ %>
	
    <h3><font color="red"><%=s2%></font></h3> 
    
     <%} %>

<label>password</label>
<input type="password" name="password" placeholder="password"  <% String pw = (String) request.getParameter("password");if(pw!= null){ %>value="<%=pw%>"<%} %>><br></br>

<% String s3 = (String) request.getAttribute("password");
if(s3!= null){ %>
    <h3><font color="red"><%=s3%></font></h3> 
    
     <%} %>
<label>confirm password</label>


<input type="password" name="confirmpassword" placeholder="confirmpassword" <% String cp = (String) request.getParameter("confirmpassword");if(cp!= null){ %>value="<%=cp%>"<%} %>>  
  
<% String s4 = (String) request.getAttribute("cp");
if(s4!= null){ %>
    <h3><font color="red"><%=s4%></font></h3> 
    
     <%} %>


<br>
<br>
<br>
<input type = "submit" value="submit">

<br>

</div>
</form>

</body>
</html>