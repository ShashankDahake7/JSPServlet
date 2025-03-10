<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Example - Shashank</title>
</head>
<body>
<%-- This is a JSP example with scriptlets, comments, and expressions --%>
<% out.println("This is JSP Example - Shashank"); %>  <!-- Scriptlet tag -->
<br/>
<% out.println("The product of two numbers is: "); %>
<%! int num1 = 20; int num2 = 22; %>  <!-- Declaration tag -->
<%= num1 * num2 %>  <!-- Expression tag -->
<br/>
Today's date: <%= (new java.util.Date()).toLocaleString() %>
<br/>
<!-- User Input -->
<%
String firstName = request.getParameter("fname");
out.print("Welcome " + firstName + "!");
%>
<br/>
<!-- Setting and Retrieving Values -->
Name: <%= application.getAttribute("StudentName") %>
<br/>
<!-- Declaring a Method -->
<%!
int cube(int n) {
return n * n * n;
}
%>
<%= "Cube of 3 is: " + cube(3) %>
</body>
</html>