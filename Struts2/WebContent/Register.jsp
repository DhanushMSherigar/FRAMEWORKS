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
<st:form action = "register">
<st:textfield label = "USerNAme" name="username"></st:textfield><br>
<st:password label = "UserPassword" name="userpassword"></st:password><br>
<st:password label = "ConfirmPassword" name="confirmpassword"></st:password>
<st:submit value = "REGISTER"></st:submit>
</st:form>




</body>
</html>