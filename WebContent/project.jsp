<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<div>
<html:errors/>
</div>
	<html:form action="Projectt" method="post">
		<div align="Center">
		
		</div>
		<pre>
		
	Project Id		<html:text property="projectId"></html:text>
		
	Project Title 		<html:text property="projectTitle"></html:text>
	
	Start Date 		<html:text property="startDate"></html:text>
	
	End Date 		<html:text property="endDate"></html:text>
	
	
	Complete		<html:radio property="status" value="yes">Yes</html:radio>	<html:radio property="status" value="no">No</html:radio>
	         
					
	<html:hidden property="operation" value="insert"/>
	<html:submit>Submit</html:submit> <html:reset>Reset</html:reset>
</pre>
	</html:form>
</body>
</html>