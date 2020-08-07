<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div>
		<html:errors />
	</div>
	<pre>
	<html:form action="Loginn" method="post">
	Email:	   <html:text property="email"></html:text>	
	
	Password:  <html:password property="password"></html:password>
	
	<html:submit>Submit</html:submit>	<html:reset>Reset</html:reset>
	
	Click Here to <html:link page="/Register.jsp">Register</html:link>
					
	</html:form>
	</pre>
</body>
</html>