<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Implicit Objects - Expression Language (EL)</title>
</head>
<body>
    <h2>JSP EL Implicit Objects Demo</h2>

    <!-- Page Scope Variable -->
    <%
        pageContext.setAttribute("pageVar", "This is a Page Scoped Variable");
    %>
    <p><strong>Page Scope:</strong> ${pageScope.pageVar}</p>

    <!-- Request Scope Variable -->
    <%
        request.setAttribute("requestVar", "This is a Request Scoped Variable");
    %>
    <p><strong>Request Scope:</strong> ${requestScope.requestVar}</p>

    <!-- Session Scope Variable -->
    <%
        session.setAttribute("sessionVar", "This is a Session Scoped Variable");
    %>
    <p><strong>Session Scope:</strong> ${sessionScope.sessionVar}</p>

    <!-- Application Scope Variable -->
    <%
        application.setAttribute("appVar", "This is an Application Scoped Variable");
    %>
    <p><strong>Application Scope:</strong> ${applicationScope.appVar}</p>

    <hr>

    <!-- Request Parameters (param and paramValues) -->
    <p><strong>Request Parameter (param):</strong> ${param.username}</p>
    <p><strong>Request Parameter Values (paramValues):</strong> ${paramValues.username[0]}</p>

    <hr>

    <!-- HTTP Headers (header and headerValues) -->
    <p><strong>User-Agent Header (header):</strong> ${header["User-Agent"]}</p>
    <p><strong>All Accept-Language Headers (headerValues):</strong> ${headerValues["Accept-Language"][0]}</p>

    <hr>

    <!-- Context Initialization Parameter (initParam) -->
    <p><strong>App Version (initParam):</strong> ${initParam.appVersion}</p>

    <hr>

    <!-- Cookies (cookie) -->
    <p><strong>Session ID Cookie:</strong> ${cookie.JSESSIONID.value}</p>

    <hr>

    <!-- PageContext Object -->
    <p><strong>Current JSP PageContext:</strong> ${pageContext.servletContext.contextPath}</p>

</body>
</html>