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
<st:form action = "reg">
<st:textfield label = "USerNAme" name="username"></st:textfield><br>
<st:textfield label = "UserPASSWORD" name="userpassword"></st:textfield><br>
<st:submit value = "REGISTER"></st:submit>
</st:form>
</body>
</html>