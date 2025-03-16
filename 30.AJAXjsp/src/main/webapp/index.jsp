<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String val = request.getParameter("val");
    if (val != null) {
        try {
            int n = Integer.parseInt(val);
            for (int i = 1; i <= 10; i++) {
                out.print(n + " × " + i + " = " + (n * i) + "<br>");
            }
        } catch (NumberFormatException e) {
            out.print("<span style='color: red;'>Invalid input. Please enter a valid number.</span>");
        }
    }
%>
