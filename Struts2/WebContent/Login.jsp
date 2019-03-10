<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@ taglib uri="/struts-tags" prefix="st" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<st:form action = "login">
<st:textfield label = "USerNAme" name="username"></st:textfield><br>
<st:textfield label = "UserPassword" name="userpassword"></st:textfield><br>
<st:submit value = "LOGIN"></st:submit>
</st:form>
</body>
</html>