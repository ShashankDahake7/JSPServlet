<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Selected Checkboxes</title>
</head>
<body>
    <h2>Selected Days</h2>
    <ul>
        <%
        String[] selectedDays = request.getParameterValues("days");
        if (selectedDays != null) {
            for (String day : selectedDays) {
        %>
                <li><%= day %></li>
        <%
            }
        } else {
        %>
            <p>No days selected.</p>
        <%
        }
        %>
    </ul>
</body>
</html>