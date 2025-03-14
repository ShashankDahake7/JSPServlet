<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h1>Login Page</h1>
    <p>Welcome, <s:property value="user" />!</p>

    <p><a href="<s:url action='hello'/>">Back to Hello Page</a></p>
</body>
</html>