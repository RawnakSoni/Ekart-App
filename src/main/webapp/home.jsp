<%@page import="org.jsp.ekart.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/home.css" rel="stylesheet" type="text/css"/>
<style>
        
    </style>
</head>
<body>
	
	<%
		User u = (User) session.getAttribute("user");
		if(u !=null)
		{
	%>
			<h3 id="wlc">Hello <%=u.getName() %>, Welcome to QUICKART</h3>

		    <div id="bx">
		        <h3 id="vw"><a href="viewproducts">View Your Products</a></h3>
		        <h3 id="add"><a href="addProduct.jsp">Add Product</a></h3>
		    </div>
		    
		    <div id="nv">
		        <h3><a href="edituser.jsp">Edit Profile</a></h3>
		        <h3><a href="viewuser.jsp">View Profile</a></h3>
		        <h3 id="dlt"><a href="delete">Delete Profile</a></h3>
		    </div>
		
		    <div id="foot">
		        <h3 id="lo"><a href="logout">LOGOUT</a></h3>
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