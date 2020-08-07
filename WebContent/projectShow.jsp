<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/sql_rt" prefix="sql"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Task</title>
</head>
<style>

 #container {
    display: table;
    }

  #row  {
    display: table-row;
    }

  #left, #right, #middle {
    display: table-cell;
    }

</style>
<body>

<div id="container">
  <div id="row">

  	<div id="left">
  		<h4>Left Col&nbsp</h4>
  		<p>...</p>
  	</div>

  	<div id="middle">
  		<h4>Middle Col</h4>
  		<p>...</p>
  	</div>

  	<div id="right">
    	<h4>Right Col</h4>
    	<p>...</p>
  	</div>

	</div>
</div>









<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost/task"
     user="root"  password="admin"/>
 
<sql:query dataSource="${snapshot}" var="result">
SELECT * from project ;
</sql:query>


<c:forEach var="row" items="${result.rows}">
<div style="text-align:left;">

<pre>
   <c:out value="${row.rows}"/>    
   </pre>
   </div>
</c:forEach>
</body>
</html>