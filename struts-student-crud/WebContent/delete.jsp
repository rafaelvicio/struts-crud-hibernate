<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student:Delete</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>
<body>
	<jsp:include page="WEB-INF/jsp/header.jsp" />
	<div class="error" align="center">
		<h:errors />
		${nostudent}
	</div>
	<div class="msg" align="center">${msg}</div>
	<br />
	<div align="center">
		<h:form action="getDeleteAction" method="post">

			<table>
				<tr>
					<td><b:message key="label.id" /> <h:text property="id" /> <h:submit>
							<b:message key="label.show_student" />
						</h:submit></td>
				</tr>
			</table>
		</h:form>
	</div>
	<br />
	<c:if test="${show}">
		<div align="center">
			<h:form action="deleteAction" method="post">

				<table>
					<tr>
						<td><b:message key="label.id" /></td>
						<td><h:text property="id" value="${student.id}"
								readonly="true" /></td>
					</tr>
					<tr>
						<td><b:message key="label.name" /></td>
						<td><h:text property="name" value="${student.name}"
								readonly="true" /></td>
					</tr>
					<tr>
						<td><b:message key="label.course" /></td>
						<td><h:text property="course" value="${student.course}"
								readonly="true" /></td>
					</tr>
					<tr>
						<td><b:message key="label.address" /></td>
						<td><h:text property="address" value="${student.address}"
								readonly="true" /></td>
					</tr>
					<tr>
						<td></td>
						<td><h:submit style="color:red;">
								<b:message key="label.delete_student" />
							</h:submit></td>
					</tr>
				</table>
			</h:form>
		</div>

	</c:if>
</body>
</html>