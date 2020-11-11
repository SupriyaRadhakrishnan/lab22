<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/css/styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>Your Pizza</h1>
<p>Size : </p>${size} <br />
<p>Toppings : </p>${toppings} <br />
<p>Gluten Free Crust : </p>${upgrade} <br />
<p>Special Instructions : </p>${splinstruction} <br />
<p>Price : </p>${price} <br />
<br /><br /><br />
<a href=/custom>Build Another Pizza</a>
<a href=/homepage>Back To HomePage</a>
</body>
</html>