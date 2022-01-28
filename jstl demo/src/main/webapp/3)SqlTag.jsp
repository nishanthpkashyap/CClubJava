<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="h" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SQL TAGS</title>
</head>
<body>
	<c:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/gadgetsdb" user="root" password=""/>
	<c:query var="rs" dataSource="${ds}">select * from gadgets</c:query>
	<h:forEach items="${rs.rows}" var="row">
		${row.id} ${row.name} ${row.price} <br>
	</h:forEach>
</body>
</html>