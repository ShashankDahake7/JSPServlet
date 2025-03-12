<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
 <%
 Cookie firstName = new Cookie("first_name", request.getParameter("first_name"));
 Cookie lastName = new Cookie("last_name", request.getParameter("last_name"));
 firstName.setMaxAge(60 * 60 * 12);
 lastName.setMaxAge(60 * 60 * 12);
 response.addCookie(lastName);
 response.addCookie(firstName);
 %>
 <html>
 <head><title>Setting Cookies</title></head>
 <body>
 <h1>Cookies Set</h1>
 <ul>
     <li><b>First Name:</b> <%= request.getParameter("first_name") %></li>
     <li><b>Last Name:</b> <%= request.getParameter("last_name") %></li>
 </ul>
 <a href="readCookies.jsp">Read Cookies</a>
 </body>
 </html>