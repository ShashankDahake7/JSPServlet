<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head><title>Reading Cookies</title></head>
<body>
<h1>Reading Cookies</h1>
<%
Cookie[] cookies = request.getCookies();
if (cookies == null) {
    out.println("<h2>No cookies found</h2>");
} else {
    out.println("<h2>Found Cookies</h2>");
    for (Cookie cookie : cookies) {
        out.print("Name: " + cookie.getName() + ", Value: " + cookie.getValue() + "<br>");
    }
}
%>
<a href="deleteCookies.jsp">Delete Last Name Cookie</a>
</body>
</html>