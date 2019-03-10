<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%out.println("the no of chooc are"+session.getAttribute("choc")); %>
<%out.println("the no of bread are"+session.getAttribute("bread")); %>
</body>
</html>