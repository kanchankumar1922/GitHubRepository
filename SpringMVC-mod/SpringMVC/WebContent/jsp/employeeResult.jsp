<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee Result</title>
	</head>
	
	<body>
	<h2>Submitted Employee Information</h2>
	   <table border="2px">
	   <% List<Map<String , Object>> listofemployeeObjects = (List<Map<String , Object>>) request.getAttribute("employeeObject");%>
	   
	   <% for(Map<String , Object> map : listofemployeeObjects){ %>
	    <tr bordercolor="orange">
	        <td>EMPLOYEE ID :: <%= (String) map.get("EMP_ID") %></td>
	        <td>EMPLOYEE NAME :: <%= (String) map.get("EMP_NAME") %></td>
	    </tr>  
	     <% }%>
	     
	   <%-- <tr>
	        <td><%=map.get("EMP_ID") %></td>
	        <td>${employeeObject}</td>
	    </tr>   --%>
	   
	</table>
	
	</body>
</html>