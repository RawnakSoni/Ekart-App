<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/login.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	
	<%
		String message=(String) request.getAttribute("msg");
		if(message != null)
		{
	%>
	
			<h2><%=message%></h2>
	<%
		} 
	%>

	<form action="login" method="post">
	<h1>LOGIN PAGE</h1><br><br>
	
	<div>
	
		PHONE : <input type="tel" name="ph" placeholder="Enter your phone number"> <br> <br>
		PASSWORD : <input type="password" name="ps" placeholder="Enter your password"> <br> <br>
		<input type="submit" value="LOGIN" id="btn"> 
		
		<h3> <a href="register.jsp">Click Here to Register</a> </h3>	
	
	</div>	
	</form>

</body>
</html>