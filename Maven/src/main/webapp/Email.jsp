<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function loaddoc(){
xhttp = new XmlHttpRequest();
xhttp.onreadystatechange=function(){
	if(xhttp.readystate == 4 && xhttp.status == 400){
		document.getElementById("s").innerHTML=xhhtp.responseText();
		
	}
};
	
xhttp.open("Get","Emailctl",true);	
xhttp.send(null);	
}

</script>
</head>
<body>
<center>
<form action="Emailctl" method="post">



<label>Email Id:</label>
<input type="email" name="emailid"><span id="s"></span><br></br>



<%String s = (String) request.getAttribute("error");if (s!= null) { %>
			<h3>
				<font color="red">"<%=s%>"</font>
			</h3>
			<%
				}
			%>
				
<input type="submit" value="Check" onclick="loaddoc()">
</form>
</center>
</body>
</html>