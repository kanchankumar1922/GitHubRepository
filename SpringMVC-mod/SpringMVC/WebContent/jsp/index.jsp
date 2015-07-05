<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>

<title>Insert title here</title>

<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="/js/jquery-1.10.1.min.js" var="jqueryUrl" />
<script src="${jqueryUrl}"></script> --%>
<%
    String path = request.getContextPath();
%>
<%-- <%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt'%>
<script type="text/javascript" src='<c:url value="/js/jquery-1.10.1.min.js"></c:url>'></script> 
 --%>
<!-- <script type="text/javascript" src="C:\Users\kumark\Java-Helios-workspace\SpringMVC\WebContent\js\jquery-1.10.1.min.js"></script> -->




<!-- <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js" type="text/javascript"></script>--> 

<script type="text/javascript" src="<%=path %>/js/jquery-1.10.1.min.js"></script> 
<script type="text/javascript" src="<%=path %>/js/employee.js"></script>
<script type="text/javascript" src="<%=path %>/js/test.js"></script>
<link href="<%=path %>/css/main.css" type="text/css" rel="stylesheet"> </link>


</head>

<body>

<h1>WELCOME TO SPRING MVC</h1>

	<div id="navigation">
	  <p> <a href="javascript:void(0);" id="add">       ADD EMPLOYEE </a> </p>
	  <p> <a href="search" id="search"> SEARCH EMPLOYEE </a> </p>
	  <p> <a href="update" id="update"> UPDATE EMPLOYEE </a> </p>
	  <p> <a href="delete" id="delete"> DELETE EMPLOYEE </a> </p>
	</div>
	
	<div id="webcontent"></div>
</body>

</html>