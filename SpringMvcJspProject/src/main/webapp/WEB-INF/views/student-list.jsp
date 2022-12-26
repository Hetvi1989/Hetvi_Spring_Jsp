<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr><td>Student Id</td><td>Student Name</td><td>Student Score</td></tr>
<c:forEach items="${students}" var="student">
<tr>
<td>${student.Id}</td><td>${student.Name}</td><td>${student.Score}</td>
</tr>
</c:forEach>
</table>
</body>
</html>