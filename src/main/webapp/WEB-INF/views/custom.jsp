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
<form method ="post" action="/result">
<h1>Build Your Own Pizza</h1>
<br /><br /><br />
<p>Size</p> <select name ="size">
<option>Small</option>
<option>Medium</option>
<option>Large</option>
</select> <br /><br /><br />
<p>How many toppings?</p> <input type ="text" name ="toppings"/><br /><br /><br />
<input type="checkbox" name="upgrade" />Gluten free crust? ($2.00 extra) <br /><br /><br />
<p>Special Instructions(Optional)</p><br />
<textarea name="splinstruction" rows=4 cols=20></textarea><br />
<br />
<br />
<br />
<input type="Submit" value ="Calculate Price"/>
<a href=/homepage>Never Mind</a>
</form>
</body>
</html>

