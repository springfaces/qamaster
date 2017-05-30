<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="sec" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath}/static/css/qamaster.css" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	
	<p><a href="${pageContext.request.contextPath}/offers">Show current offers.</a></p>
	<p><a href="${pageContext.request.contextPath}/createoffer">Add new offer.</a></p>

	<sec:authorize access="hasRole('admin')">
	<p><a href="${pageContext.request.contextPath}/newaccount">Add new account.</a></p>
	</sec:authorize>
	
	

	
</body>
</html>