<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body style="background-color: gray;">
    <% String name = request.getParameter("username"); %>
    <b>Welcome,</b> <% out.print(name); %>
</body>
</html>