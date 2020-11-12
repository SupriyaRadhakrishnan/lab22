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
<h1>Thanks for the Review</h1>
<p>Your Name : ${yourname}</p> 
<p>Comments</p>
<p><c:out value="${comment}"></c:out></p> 
<p>Rating : ${rating} </p>
<a href=/homepage>Back To HomePage</a>
</body>
</html>