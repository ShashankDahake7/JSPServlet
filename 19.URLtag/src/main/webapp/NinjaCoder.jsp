<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello Ninja Coder</title>
</head>
<body>
    <h1>Welcome Ninja Coder</h1>

    <s:url id="login" action="login" var="myurl">
        <s:param name="user">Ninja</s:param>
    </s:url>

    <p>Click the link below to go to the login page:</p>
    <a href='<s:property value="#myurl"/>'>
        <s:property value="#myurl"/>
    </a>
</body>
</html>