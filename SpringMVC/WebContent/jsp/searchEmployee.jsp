<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Search Employee</title>
    
    <%  String path = request.getContextPath();   %>

    <script type="text/javascript" src="<%=path %>/js/jquery-1.10.1.min.js"></script> 
    <script type="text/javascript" src="<%=path %>/js/employee.js"></script>
    <script type="text/javascript" src="<%=path %>/js/test.js"></script>
    <link href="<%=path %>/css/main.css" type="text/css" rel="stylesheet"> </link>

</head>
<body>

<h2>Employee Information</h2>
<form:form method="POST" action="/SpringMVC/searchEmployee" id="searchFormActionID">
   <table>
    
   
    <tr>
        <td><form:label path="employeeID">id</form:label></td>
        <td><form:input path="employeeID" id="employeeID" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" id="searchById" value="Search By ID"/>
            <input type="submit" id="searchAllData" value="Search ALL DATA"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>