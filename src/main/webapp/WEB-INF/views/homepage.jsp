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
<h1>Welcome to MVC's Pizza</h1>
<c:set var = "now" value = "<%= new java.util.Date()%>" />
<p id="datetime"><fmt:formatDate pattern = "E,MMM dd,yyyy" value = "${now}"/></p>
<h2>Speciality Pizzas</h2>
<div class="rows">
<c:forEach var="sp" items="${sp}">
<div class="cols">
<img src="/images/${sp.getImg()}" width="150" height="150"/>
<a id ="spname" href="/speciality?name=${sp.getName()}&price=${sp.getPrice()}">${sp.getName()}</a>
</div>
</c:forEach>
</div>
<h2>Custom Pizza</h2>
<a href="/custom">Build Your Own!</a>
<h2>Leave a Review</h2>
<a href="/review">Click here to leave a review.</a>
</body>
</html>