
<%@page import="com.mysql.fabric.xmlrpc.base.Array"%>
<%@ page  language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript">
function validation(){
	
var del = document.getElementById('del').value;	

if(del==""){
	
	document.getElementById('delete').innerHTML="** please fill the rollno field";
	document.getElementById('delete').focus;
	return false;
}
else{

	var flag = confirm("you want to delete ?");
	if(flag){
	var flag = document.getElementById('delete').submit;
	}
	}
	}


</script>
</head>


<body>
<form onsubmit="return validation()" action="studentctl" method="post">
<center>
<h1>Student Management</h1>

<label>Rollno:</label>
<input type="text" name="rollno" id="del"><span id="delete"></span><br></br>

<label>Firstname:</label>
<input type="text" name="firstname"><br></br>

<label>Lastname:</label>
<input type="text" name="lastname"><br></br>

<label>Session:</label>
<input type="text" name="session"><br></br>

<input type="submit" value="Add"  name="operation">
<input type="submit" value="Delete"  name="operation">
<input type="submit" value="Modify"  name="operation">
<input type="submit" value="Get"  name="operation">
<input type="submit" value="search"  name="operation">

</center>
</form>
</body>
</html>