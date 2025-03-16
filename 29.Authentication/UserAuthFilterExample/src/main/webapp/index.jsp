<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login Form</h2>
    <form action="servlet1" method="post">
        Name: <input type="text" name="name"/><br/><br/>
        Password: <input type="password" name="password"/><br/><br/>
        <input type="submit" value="Login"/>
    </form>

    <%-- Display error message if passed as a request attribute --%>
    <%
        String error = (String) request.getAttribute("errorMessage");
        if (error != null) {
    %>
        <p style="color:red;"><%= error %></p>
    <%
        }
    %>
</body>
</html>
