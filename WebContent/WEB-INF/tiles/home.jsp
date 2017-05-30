<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="sec" %>


	<div class="content" style="height: 550px;">
	
	
<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'hrconfig')">HR</button>
  <button class="tablinks" onclick="openCity(event, 'sop')">SOP</button>
  <button class="tablinks" onclick="openCity(event, 'report')">Reporting</button>
</div>


<div id="hrconfig" class="tabcontent">
  <h3>HR Config</h3>
  	<div id="tab1" class="tab">
		<p><a href="${pageContext.request.contextPath}/offers">Show current offers.</a></p>
		<p><a href="${pageContext.request.contextPath}/createoffer">Add new offer.</a></p>
		<p><a href="${pageContext.request.contextPath}/newaccount">Add new account.</a></p>
	</div>
</div>

<div id="sop" class="tabcontent">
  <h3>SOP/Training</h3>
  <div id="tab1" class="tab">
		<p>SOP Training comming soon..!</p>
	</div>
</div>

<div id="report" class="tabcontent">
  <h3>Reporting</h3>
  <div id="tab1" class="tab">
		<p>Reporting coming soon ...!</p>
	</div>
</div>


</div>
	