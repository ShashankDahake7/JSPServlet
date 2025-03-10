<%@ page language="java" import="java.util.*, java.io.*" session="true" buffer="8kb" autoFlush="true" contentType="text/html; charset=UTF-8" %>

<html>
<head><title>JSP Page, Include Directive Example</title></head>
<body>
    <!-- Page Directive -->
    <h2>Current Date and Time: <%= new Date() %></h2>
    <!-- Include Directive -->
    <%@ include file="header.jsp" %>
    <p>This is the main content of the page.</p>
</body>
</html>