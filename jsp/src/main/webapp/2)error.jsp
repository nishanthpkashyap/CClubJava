<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
<style>
div
{
	background:red;
	color: white;
	border:3px solid white;
	padding:10px;
	width:50%;
	display:inline-block;
}
</style>
</head>
<body>
<div>
	<h1>Error</h1>
	<h1><%=exception %></h1>
	</div>
</body>
</html>