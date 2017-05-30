<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/static/css/qamaster.css" rel="stylesheet" type="text/css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#F4F6F7">
	
	<div class="container" style="width:100%;">
			<div style="display:table; background-color:#25AB90; text-align:right; float: left; border: 1px solid Silver; padding-right: 50px; height: 900px; width: 68%">
				<div style="display: table-cell; color: White; font-size: 2.5rem; font-weight:lighter; vertical-align:middle;">Quality Assurance Master</div>
			</div>
			
			<c:if test="${param.error != null}">
	
	<p class="error">Login failed. Check that your username and password are correct.</p>
	
	</c:if>
			
			<div style="display:table; float:left; height: 900px; width:28%;">
				<div style="display:table-cell; vertical-align:middle; height:300px; width: 95%; margin:0 auto;">
						<div style="float:right; color:#25AB90; font-weight:lighter; font-size:14pt; width: 95%; ">
						<form name='f' action='${pageContext.request.contextPath}/login' method='POST'>
	
							<table style="width:100%;font-size:.9em;font-family:'Segoe UI','Segoe','SegoeUI-Regular-final',Tahoma,Helvetica,Arial,sans-serif;">
								<tr><td><span style="font-weight: bold;">QA - Master Login</span></td></tr>
								<tr><td>&nbsp;</td></tr>
								<tr><td><input type="text"  name="username" style="width:350px;height:30px;"value="" placeholder="enter your username" /></td></tr>
								<tr><td><input type="password"  name="password" style="width:350px;height:30px;"value="" placeholder="enter your password" /></td></tr>
								<tr><td>&nbsp;</td></tr>
								<tr><td><a href="#">can't access your account?</a></td></tr>
								<tr><td>&nbsp;</td></tr>
								<tr><td><input class="loginbutton" type="submit" value="Sign in" /></td></tr>
							</table>
							</form>
						</div>
				</div>
			</div>
	</div>	
	
</body>
