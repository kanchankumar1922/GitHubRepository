<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Delete Employee</title>
</head>
<body>


<form:form method="POST" action="/SpringMVC/deleteEmployee">
   <table>
  
   
    <tr>
        <td><form:label path="employeeID">DELETE BY EMPLOYEE ID</form:label></td>
        <td><form:input path="employeeID" /> </td>
        
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="DELETE THIS EMPLOYEE FROM DATABASE "/>
        </td>
    </tr>
</table>  
</form:form>

<h1>EMPLOYEE PAGE :::: ${command} </h1>
</body>
</html>