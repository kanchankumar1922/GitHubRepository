<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>Employee Information</h2>
<form:form method="POST" action="/SpringMVC/addEmployee">
   <table>
   <%--  <tr>
        <td><form:label path="employeeName">Name</form:label></td>
        <td><form:input path="employeeName" /></td>
    </tr> --%>
   
    <tr>
        <td><form:label path="employeeID">EMPLOYEE ID</form:label></td>
        <td><form:input path="employeeID" /> </td>
        <td><form:label path="employeeName">EMPLOYEE NAME</form:label></td>
        <td><form:input path="employeeName" /> </td>
        
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>

<h1>EMPLOYEE PAGE :::: ${command} </h1>
</body>
</html>