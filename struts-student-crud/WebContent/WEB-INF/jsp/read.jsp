<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student:Read</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>
<body>
	<c:import url="/header" />
	<div class="error" align="center">
		<h:errors />
		${nostudent}
	</div>
	<div class="msg" align="center">${msg}</div>
	<div align="center">
		<h:form action="getAction" method="post">

			<table>
				<tr>
					<td><b:message key="label.id" /> <h:text property="id" /> <h:submit>
							<b:message key="label.show_student" />
						</h:submit></td>
				</tr>
				<tr>
					<td><h:link action="getAllStudent">
							<b:message key="label.viewAllStudent" />
						</h:link></td>
				</tr>
			</table>
			<br />
			<div align="center">

				<c:if test="${show}">
					<table border="1">

						<tr>
							<td>Student Id</td>
							<td>${student.id}</td>
						</tr>
						<tr>
							<td>Student Name</td>
							<td>${student.name}</td>
						</tr>
						<tr>
							<td>Student Course</td>
							<td>${student.course}</td>
						</tr>
						<tr>
							<td>Student Address</td>
							<td>${student.address}</td>
						</tr>
					</table>
				</c:if>
			</div>
			<div align="center">

				<c:if test="${showAll}">
					<table class="hovertable">
						<tr>
							<td>SL_NO</td>
							<td>ID</td>
							<td>NAME</td>
							<td>COURSE</td>
							<td>ADDRESS</td>
							<td></td>
						</tr>
						<c:forEach items="${students}" var="student" varStatus="index">
							<tr onmouseover="this.style.backgroundColor='#ffff66';"
								onmouseout="this.style.backgroundColor='#d4e3e5';">
								<td>${index.count}</td>
								<td>${student.id}</td>
								<td>${student.name}</td>
								<td>${student.course}</td>
								<td>${student.address}</td>
								<td><h:link action="deleteSingleStudent?id=${student.id}">
										<img src="resources/image/delete.png" width="30px"
											height="30px" />
									</h:link></td>
							</tr>
						</c:forEach>
					</table>
				</c:if>
			</div>

		</h:form>
	</div>
</body>
</html>