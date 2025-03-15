<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <h1>Add Employee</h1>
    <form action="employee" method="post">
        ID: <input type="text" name="id"><br>
        Name: <input type="text" name="name"><br>
        <input type="submit" value="Add Employee">
    </form>
    <a href="employee">View Employees</a>
</body>
</html>
