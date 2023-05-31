<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/addProduct.css" rel="stylesheet" type="text/css"/>
</head>
<body>

	<h1>ADD PRODUCTS</h1>
	<h2>FOR USER</h2> <br> <br>

	<form action="addproduct" method="post">
	
		NAME <input type="text" name="nm"><br><br>
		DESCRIPTION <input type="text" name="desc"><br><br>
		BRAND <input type="text" name="br"><br><br>
		CATEGORY <input type="text" name="cat"><br><br>
		IMAGE <input type="text" name='im'><br><br>
		PRICE <input type="text" name="cost"><br><br>
		
	<input type="submit" value="ADD" id="btn">

</form>
</body>
</html>