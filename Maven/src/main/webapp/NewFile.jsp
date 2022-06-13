<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script language="JavaScript">
function validation(form){
	
	var v= document.form.fname.value;
	var flag = true;
	if(v==null||v==""){
		
		document.getElementById("fn").innerHTML="**firstname is required";
		
		flag=false;
	}
	
	else{
	alert("hello "+v);	
	flag=true;	
}
	
	return flag;
	
	}
</script>
</head>
<body>
<form name="form" onsubmit="return validation(this.form)">
<label>fname:</label>
<input type ="text" name="fname"><span id="fn"></span><br></br>
<input type ="submit" value="login" >
</form>
</body>
</html>