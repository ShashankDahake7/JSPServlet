<%@ page session="true" isELIgnored="false" %>
<html>
<head>
<title>Session scope</title>
</head>
<body>
<p>Value is: <%= session.getAttribute("user") %></p>
<p>Value is: ${sessionScope.user}</p>
</body>
</html>
