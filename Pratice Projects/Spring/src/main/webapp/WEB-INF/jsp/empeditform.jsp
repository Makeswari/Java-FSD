<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Edit Employee Information </h1>
<form:form method="post" action="../editsave" modelAttribute="emp">
id: <form:hidden path="id"/> <br>
name: <form:input path="name" /> <br>
designation: <form:input path="designation"/> <br>
salary: <form:input path="salary"/> <br>
<input type="submit" value="Save changes">
</form:form>
</body>
</html>