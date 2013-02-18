<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create:Student</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>
<body>
	<jsp:include page="WEB-INF/jsp/header.jsp" />
	<div class="error" align="center">
		<h:errors />
	</div>
	<div class="msg" align="center">${msg}</div>
	<div align="center">
		<h:form action="createAction" method="post">
			<table>
				<tr>
					<td><b:message key="label.id" /></td>
					<td><h:text property="id" /></td>
				</tr>
				<tr>
					<td><b:message key="label.name" /></td>
					<td><h:text property="name" /></td>
				</tr>
				<tr>
					<td><b:message key="label.course" /></td>
					<td><h:text property="course" /></td>
				</tr>
				<tr>
					<td><b:message key="label.address" /></td>
					<td><h:text property="address" /></td>
				</tr>
				<tr>
					<td></td>
					<td><h:submit>
						<b:message key="label.save"/>
					</h:submit></td>
				</tr>
			</table>
		</h:form>
	</div>
</body>
</html>