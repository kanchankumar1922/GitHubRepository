<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Search Employee</title>
</head>
<body>

<h2>Employee Information</h2>
<form:form method="POST" action="/SpringMVC/searchEmployee">
   <table>
    
   
    <tr>
        <td><form:label path="employeeID">id</form:label></td>
        <td><form:input path="employeeID" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Search By ID"/>
            <input type="submit" value="Search ALL DATA"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>