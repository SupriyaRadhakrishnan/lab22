<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="/css/styles.css" rel="stylesheet" type="text/css" />
</head>
<body>
<h1>Your Pizza</h1>
<p>Size : ${size} </p><br />
<p>Toppings : ${toppings} </p><br />
<p>Gluten Free Crust : ${upgrade}</p> <br />
<p>Special Instructions : <c:out value ="${splinstruction}"></c:out> <br />
<p>Price : <fmt:formatNumber type="number" maxFractionDigits="2" value="${price}"></fmt:formatNumber></p><br />
<br /><br />
<c:if test="${price ge 15}">
<p id="offer">Because your order meets the $15.00 minimum,you get the FREE DELIVERY!</p>
</c:if>
<br /><br />
<a href=/custom>Build Another Pizza</a>
<a href=/homepage>Back To HomePage</a>
</body>
</html>