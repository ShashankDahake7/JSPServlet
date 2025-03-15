<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Transaction Management</title>
</head>
<body>
    <h1>Add User</h1>
    <form action="user" method="post">
        ID: <input type="text" name="id"><br>
        Name: <input type="text" name="name"><br>
        Salary: <input type="text" name="salary"><br>
        <input type="submit" name="action" value="commit">
        <input type="submit" name="action" value="rollback">
    </form>
</body>
</html>
