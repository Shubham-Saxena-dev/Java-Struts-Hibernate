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
	<html:form action="Registration" method="post">
		<div align="Center">
		
		</div>
		<pre>
		
	Employee Id	 <html:text property="empId"></html:text>
		
	Full Name 	 <html:text property="fullName"></html:text>
	
	Password 	 <html:password property="password"></html:password>
	
	Email Id 	 <html:text property="email"></html:text>
	
	
	Select Role	 <html:select property="role">
	<html:option value="">---Select---</html:option>
	<html:option value="Manager">Project Manager</html:option>>
	<html:option value="TA">Team Leader</html:option>
	<html:option value="BA">Business Analyst</html:option>
	<html:option value="QA">Quality Analyst</html:option>
	<html:option value="Developer">Developer</html:option>
	</html:select>	
			
	<html:submit>Submit</html:submit> <html:reset>Reset</html:reset>
</pre>
	</html:form>
</body>
</html>