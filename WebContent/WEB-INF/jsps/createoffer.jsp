<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/static/css/qamaster.css" rel="stylesheet" type="text/css" />

</head>
<body>
		
		
		
				<form id="" method="POST" action="${pageContext.request.contextPath}/docreate">
					<table>
						<tr>
							<td>Name: </td>
							<td>
								<input type="text" name="name" />
							</td>
						</tr>	
						
						<tr>
							<td>Email: </td>
							<td>
								<input type="text" name="email" />
							</td>
						</tr>	
						
						<tr>
							<td>Text: </td>
							<td>
								<textarea name="text" rows="10" cols="10"  ></textarea>
							</td>
						</tr>	
						
						<tr>
							<td colspan="2">
								<input type="submit" value="Submit" />
							</td>
						</tr>	
					</table>
				</form>
		
		
		
</body>
