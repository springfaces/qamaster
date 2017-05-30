<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>



<sf:form method="POST"
	action="${pageContext.request.contextPath}/createaccount"
	commandName="user">

	<table class="formtable">
		<caption>Add new User</caption>
		<tr>
			<td class="label">Username:</td>
			<td><sf:input class="control" path="username" name="username"
					type="text" /><br />
			<sf:errors path="username" cssClass="error"></sf:errors></td>
		</tr>
		<tr>
			<td class="label">Email:</td>
			<td><sf:input class="control" path="email" name="email"
					type="text" /><br />
			<sf:errors path="email" cssClass="error"></sf:errors></td>
		</tr>
		<tr>
			<td class="label">Password:</td>
			<td><sf:input class="control" path="password" name="password"
					type="password" /><br />
			<sf:errors path="password" cssClass="error"></sf:errors></td>
		</tr>
		<tr>
			<td class="label">Confirm Password:</td>
			<td><input class="control" name="confirmpass" type="password" /><br /></td>
		</tr>
		<tr>
			<td class="label"></td>
			<td><input class="loginbutton" value="Add Account" type="submit" /></td>
		</tr>
	</table>

</sf:form>
