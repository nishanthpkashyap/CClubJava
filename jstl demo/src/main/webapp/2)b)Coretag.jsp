<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Core Tag using Student Obj</title>
</head>
<body>
	<c:forEach items="${students }" var="s"> 
	${s} <br>
	</c:forEach>
	<br><br><br>
	<c:forEach items="${students}" var="s"> 
	${s.rollno}.${s.name} <br>
	</c:forEach>

</body>
</html>