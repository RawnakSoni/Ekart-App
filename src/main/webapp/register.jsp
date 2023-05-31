<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="./style/register.css" rel="stylesheet" type="text/css"/>
</head>
<body>

	<h1>REGISTER PAGE</h1> <br> <br>
	
	<form action="reg" method="post">
	
		NAME : <input type="text" name="nm"> <br> <br>
		AGE : <input type="number" name="age"> <br> <br>
		GENDER : <input type="radio" name="gender" value="male"> MALE <input type="radio" name="gender" value="female"> FEMALE<br> <br>
		PHONE : <input type="tel" name="ph"> <br> <br>
		EMAIL : <input type="email" name="em"> <br> <br>
		PASSWORD : <input type="password" name="ps"> <br> <br>
		<input type="submit" value="REGISTER" id="btn">
		
	</form>

</body>
</html>