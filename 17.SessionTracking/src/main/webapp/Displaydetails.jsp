<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<%
    HttpSession sessionVar = request.getSession(false);
    String username = (sessionVar != null) ? (String) sessionVar.getAttribute("username") : null;
    if (username == null) {
        response.sendRedirect("login.jsp");
    }
%>
<html>
<head>
    <title>Display Details</title>
</head>
<body>
    <strong>
        Username: <%= username %> <br/>
        <a href="logout">Logout</a>
    </strong>
</body>
</html>
