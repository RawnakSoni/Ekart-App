<%@page import="org.jsp.ekart.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/viewuser.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<%
		User user = (User) session.getAttribute("user");
		if(user != null)
		{
	%>
	
	<h1>USER DETAILS</h1>
	
	<div>
	
			<h3>ID- <%=user.getId() %></h3>
				
			<h3>NAME- <%=user.getName() %></h3>
				
			<h3>AGE- <%=user.getAge() %></h3>
				
			<h3>PHONE- <%=user.getPhone() %></h3>
				
			<h3>EMAIL- <%=user.getEmail() %></h3>
				
			<h3>GENDER- <%=user.getGender() %></h3>

	</div>
		<%
		} 
		else 
		{
			response.sendRedirect("login.jsp");
		}
		%>
</body>
</html>