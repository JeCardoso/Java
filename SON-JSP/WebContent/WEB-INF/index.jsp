<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h1> Hello from JSP ${name}</h1>
 
 <c:forEach var="number" items="$[numbers]">
 	Item Number: <h2>${number}</h2> <br/>
 </c:forEach>
 
 <c:if test="${age > 19}">
 	You have more then 18 ages
 </c:if>
 
</body>
</html>