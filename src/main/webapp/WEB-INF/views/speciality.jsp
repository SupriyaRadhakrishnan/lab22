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
<h1>Speciality Pizza :  ${name}</h1>
<br /><br /><br /> 
<p>Name : ${name}</p>
<br />
<p>Price : $ <fmt:formatNumber type="number" maxFractionDigits="2" value="${price}"></fmt:formatNumber></p>
<br />
<br />
<br />
<a href=/homepage>Back To HomePage</a>
</body>
</html>