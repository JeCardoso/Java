<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- Diretiva acrecenta @ -->
	<%@page import="java.util.Date"%>
	
	<%= "Data de hoje: " + new Date() %>
	<br/>
	
	<!-- Diretiva acrecenta de informa��o de p�gina pode ser recuperado por... -->
	<%-- <%= getServletInfo() %> --%>
	<%@ page info="P�gina do curso de JSP" %>
	<br/>
	
	<!-- Diretiva de erro (Pagina de erro) -->
	<%@ page errorPage="pagina_erro.jsp" %>
	<br/>
	
	<!-- Diretiva de Incluir uma p�gina na outra -->
	<%@ include file="cabecalho.jsp" %>

</body>
</html>