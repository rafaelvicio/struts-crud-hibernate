<%@ taglib uri="http://struts.apache.org/tags-html" prefix="h"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="b"%>
<h2 align="center">
	<b:message key="label.appname" />
</h2>
<br />
<div align="center">
	<h:link action="create">
		<b:message key="label.create" />
	</h:link>
	|
	<h:link action="read">
		<b:message key="label.read" />
	</h:link>
	|
	<h:link action="update">
		<b:message key="label.update" />
	</h:link>
	|
	<h:link action="delete">
		<b:message key="label.delete" />
	</h:link>

</div>