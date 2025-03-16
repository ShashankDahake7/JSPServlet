<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.example.model.Student, java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <h2>Students</h2>
    <table border="1">
        <tr><th>Roll No</th><th>Name</th></tr>
        <%
            List<Student> students = (List<Student>) request.getAttribute("students");
            for (Student student : students) {
        %>
        <tr>
            <td><%= student.getRollNo() %></td>
            <td><%= student.getName() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
