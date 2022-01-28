<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="in.codersclub.loginapp.gto.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success!!</title>
</head>
<body>
	<h3>Login Success !!</h3>
	<jsp:useBean id="user" class="in.codersclub.loginapp.gto.User" scope="request">
		<jsp:setProperty name="user" property="username" value="NEW USER"/>
	</jsp:useBean>
	
	Hello <jsp:getProperty property="username" name="user"/> , Good Evening !!
</body>
</html>