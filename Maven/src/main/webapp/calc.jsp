<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function calc(this.form){	
var n1 = ParseInt(form.cal1.value);	
var n2 = ParseInt(form.cal2.value);		
form.cal3.value=n1+n2;
 return form.cal3.value;
}


</script>
</head>
<body>
<center>
<form name = "form">
<input type="text" size="20" height="25" name = "answer" placeholder="calculator"><br>
<input type="button" value="  1  " onclick="form.answer.value += '1' ">
<input type="button" value="  2  "  onclick="form.answer.value += '2' ">
<input type="button" value="  3  " onclick="form.answer.value += '3' ">
<input type="button" value="  + "  onclick="form.answer.value += '+' "><br>
<input type="button" value="  4  "  onclick="form.answer.value += '4' ">
<input type="button" value="  5  "  onclick="form.answer.value += '5' ">
<input type="button" value="  6  "  onclick="form.answer.value += '6' ">
<input type="button" value="  -  "  onclick="form.answer.value += '-' "><br>
<input type="button" value="  7  "  onclick="form.answer.value += '7' ">
<input type="button" value="  8  "  onclick="form.answer.value += '8' ">
<input type="button" value="  9  "  onclick="form.answer.value += '9' ">
<input type="button" value="  /  "  onclick="form.answer.value += '/' "><br>
<input type="button" value="  00 "  onclick="form.answer.value += '00' ">
<input type="button" value="  0  "  onclick="form.answer.value += '0' ">
<input type="button" value="  .  "  onclick="form.answer.value += '.' ">
<input type="button" value="  *  "  onclick="form.answer.value += '*' "><br>
<input type="button"  value="         =      "  onclick="form.answer.value = eval(form.answer.value) ">
<input type="button" value="     clear     "  onclick="form.answer.value = ''  ">
</form>
</center>




<form name="form">
<input type="text" name="num1" onchange="" id="cal1">+
<input type="text" name="num2" onchange="" id="cal2">=
<input type="text" name="sum"  id="cal3">
<input type="button" value="calculate" onclick="calc(form)">


</form>
</body>
</html>