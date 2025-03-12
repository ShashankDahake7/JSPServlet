<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>All Form Parameters</title>
</head>
<body>
    <h2>Form Data Received</h2>
    <table border="1">
        <tr>
            <th>Parameter Name</th>
            <th>Value</th>
        </tr>
        <%
        Enumeration<String> paramNames = request.getParameterNames();
        while (paramNames.hasMoreElements()) {
            String paramName = paramNames.nextElement();
            String[] paramValues = request.getParameterValues(paramName);
        %>
        <tr>
            <td><%= paramName %></td>
            <td>
                <%
                if (paramValues.length == 1) {
                    out.print(paramValues[0]); // Single value
                } else {
                    for (String value : paramValues) {
                        out.print(value + "<br>"); // Multiple values
                    }
                }
                %>
            </td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>