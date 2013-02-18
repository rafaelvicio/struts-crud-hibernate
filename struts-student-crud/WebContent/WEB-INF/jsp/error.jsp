<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student:Error Page</title>
<link rel="stylesheet" type="text/css" href="resources/css/style.css" />
</head>
<body>
	<div class="error" align="center">
		
		<img src="/struts-student-crud/resources/image/wrong_happens.jpg" width="200px" height="200px"/>
		<h3><h:errors/></h3>
	</div>
</body>
</html>