<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Product.jsp">
Enter Product ID<Input type="text" name="id" required><br>
Enter Product Name<Input type="text" name="sname" required><br>
Enter Product Price<Input type="text" name="price" required><br>
Enter Product Details<input type="text" name="detail"><br>
<input type="submit" value="submit">
</form>
<%
 if (request.getParameter("error") != null)
 out.println("<b>Your session has expired or is invalid input.</b><br>");
%>
</body>
</html>