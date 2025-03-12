<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
String username = request.getParameter("uname");
String password = request.getParameter("pswd");

if (username != null && password != null) {
    username = username.trim();
    password = password.trim();

    if (username.equals("Shashank") && password.equals("12345")) {
        out.println("<h2 style='color: green;'>You are logged in!!</h2>");
    } else {
        out.println("<h2 style='color: red;'>Try Again!! Wrong Credentials</h2>");
    }
} else {
    out.println("<h2 style='color: red;'>Missing credentials!</h2>");
}
%>

<br>
<a href="index.html">Go Back</a>