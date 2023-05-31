<%@page import="org.jsp.ekart.dto.Product"%>
<%@page import="java.util.List"%>
<%@page import="org.jsp.ekart.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/viewProducts.css" rel="stylesheet" type="text/css"/>
</head>
<body>

	<h1>PRODUCT DETAILS</h1>
	
	<%
	
	User user = (User) session.getAttribute("user");
	if(user!=null)
	{
		List<Product> products = (List<Product>) request.getAttribute("products");
	
	%>
	<div>
	<table>
	
		<tr>
	
			<th>ID</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
			<th>BRAND</th>
			<th>CATEGORY</th>
			<th>IMAGE</th>
			<th>COST</th>
			<th>EDIT</th>
			<th>DELETE</th>
	
		</tr>
		
		<%
		
			for (Product p : products)
			{
				
		%>
				<tr>
				
					<td><%=p.getId()%></td>
					<td><%=p.getName()%></td>
					<td><%=p.getDescription()%></td>
					<td><%=p.getBrand()%></td>
					<td><%=p.getCategory()%></td>
					<td><%=p.getImage()%></td>
					<td><%=p.getCost() %></td>
					<td id="editbtn"><a href="find?pid=<%=p.getId()%>">EDIT</a></td>
					<td id="dltbtn"><a href="deleteproduct?pid=<%=p.getId()%>">DELETE</a></td>
				
				</tr>
				
		<%
		
			}
		
		%>
	
	</table>
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