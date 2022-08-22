<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Id</th>
<th>Name</th>  
<th>Designation</th>
<th>Salary</th>
</tr>
<c:forEach var="emp" items="${empList}">
<tr>
<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.designation}</td>
<td>${emp.salary}</td>
<td><a href="editemp/${emp.id}">Edit</a></td>
<td><a href="deleteemp/${emp.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>