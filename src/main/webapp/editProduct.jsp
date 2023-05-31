<%@page import="org.jsp.ekart.dto.Product"%>
<%@page import="org.jsp.ekart.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/editProduct.css" rel="stylesheet" type="text/css"/>
</head>
<body>

	<h1>EDIT PRODUCT</h1> <br> <br>
	
	<%
	User user = (User) session.getAttribute("user");
	if (user != null) 
	{
		Product p = (Product) request.getAttribute("product");
	%>
		<form action="editproduct" method="post">
		
			<input type="hidden" value="<%=p.getId()%>" name="id"> 
			
				NAME <input type="text" name="nm" value="<%=p.getName()%>"><br> <br>
				DESCRIPTION <input type="text" name="desc" value="<%=p.getDescription()%>"><br> <br>
				BRAND <input type="text" name="br" value="<%=p.getBrand()%>"><br><br>
				CATEGORY <input type="text" name="cat" value="<%=p.getCategory()%>"><br><br>
				IMAGE <input type="text" name='im' value="<%=p.getImage()%>"><br><br>
				COST <input type="text" name="cost" value="<%=p.getCost()%>"><br><br>
	
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