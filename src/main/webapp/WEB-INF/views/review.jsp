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
<form method ="post" action="/reviewconfirmation">
<h1>Leave a Review</h1>
<p>Your Name : </p><input type="text" name="yourname" required/> <br /><br /><br />
<p>Comment</p><br />
<textarea name="comment" rows=4 cols=20 required>
</textarea> <br /> <br /> <br />
<p>Rating</p> <br />
<input type="radio" name="rating" value="5" required>
<label for="5">(Best)5</label>
<input type="radio" name="rating" value="4">
<label for="4">4</label>
<input type="radio" name="rating" value="3">
<label for="3">3</label>
<input type="radio" name="rating" value="2">
<label for="2">2</label>
<input type="radio" name="rating" value="1">
<label for="1">1(Worst)</label><br /> <br /> <br />
<input type="Submit" value ="Submit"/>
<a href=/homepage>Never Mind</a>
</form>
</body>
</html>