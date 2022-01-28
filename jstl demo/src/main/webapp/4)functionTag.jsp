<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tag</title>
</head>
<body>
	<h3>Length Tag</h3>
		<c:set var="str" value="NISH IS GREAT"></c:set>
		Length : ${fn:length(str)} <br>
		
	<h3>Split Tag</h3>
		<c:forEach items="${fn:split(str,' ')}" var="s">
			${s} <br>
		</c:forEach>
		
	<h3>Index Of Tag</h3>
		Index : ${fn:indexOf(str,'IS')} <br>
		
	<h3>Contains ?</h3>
		is there 'GREAT' : ${fn:contains(str,'GREAT')} <br>
		
	<h3>If with contains </h3>
		<c:if test="${fn:contains(str,'GREAT')}">
			Great is there in ' ${str} ' <br>
		</c:if>
	
	<h3>Ends With</h3>
		Ends with 'GREAT' ? : ${fn:endsWith(str,'GREAT') } <br>
</body>
</html>