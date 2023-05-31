<%@page import="org.jsp.ekart.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/edituser.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<%
	
	   User user = (User) session.getAttribute("user");
	   if(user != null) 
	   {

	%>
	
	<h1>EDIT USER</h1> <br> <br>
	
		<form action="edit" method="post">
		
			<input type="hidden" name="id" value="<%=user.getId()%>">
			
			NAME : <input type="text" name="nm" value="<%=user.getName() %>"><br><br>
			
			EMAIL : <input type="email" name="em" value="<%=user.getEmail() %>"><br><br>
			
			AGE : <input type="number" name="age" value="<%=user.getAge() %>"><br><br>
			
			GENDER : <input type="radio" name="gender" value="male">MALE<input type="radio" name="gender" value="female">FEMALE <br><br>
			
			PHONE : <input type="tel" name="ph" value="<%=user.getPhone() %>"><br><br>
			
			PASSWORD : <input type="password" name="ps" value="<%=user.getPassword() %>"><br><br>
			
			<input type="submit" value="UPDATE" id="btn">
			
			</form>
	<%
	   } 
	   else 
	   {
		   	response.sendRedirect("login.jsp");
	   }
	%>
</body>
</html>