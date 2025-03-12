<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Implicit Objects Example</title>
</head>
<body>
    <h2>JSP Implicit Objects Demo</h2>

    <!-- Request object example -->
    <p>Request Method: <%= request.getMethod() %></p>

    <!-- Response object example -->
    <%
        response.setHeader("Custom-Header", "HelloJSP");
    %>
    <p>Custom Header Set in Response</p>

    <!-- PageContext example -->
    <%
        pageContext.setAttribute("pageMessage", "This is from pageContext");
    %>
    <p>PageContext Message: <%= pageContext.getAttribute("pageMessage") %></p>

    <!-- Session object example -->
    <%
        session.setAttribute("username", "Shashank");
    %>
    <p>Session Username: <%= session.getAttribute("username") %></p>

    <!-- Application object example -->
    <%
        application.setAttribute("appName", "PayPal");
    %>
    <p>Application Name: <%= application.getAttribute("appName") %></p>

    <!-- Config object example -->
    <p>Servlet Name: <%= config.getServletName() %></p>

    <!-- Out object example -->
    <%
        out.println("This is printed using out.println()");
    %>

    <!-- Page object example -->
    <p>Page Object (this): <%= this.getClass().getName() %></p>

    <!-- Exception object example (Handled in error.jsp) -->
    <%
        try {
            // int num = 10 / 0; // This will throw an exception
            int num = 10 / 1;
        } catch (Exception e) {
            response.sendRedirect("error.jsp");
        }
    %>

</body>
</html>
