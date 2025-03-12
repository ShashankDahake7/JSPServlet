<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>POST Method Example</title>
</head>
<body>
<h1>Form Data Received</h1>
<p><b>First Name:</b> <%= request.getParameter("first_name") %></p>
<p><b>Last Name:</b> <%= request.getParameter("last_name") %></p>
</body>
</html>