<html>
<head>
<title>EL Cookie</title>
</head>
<body>
<h1>Cookie Example</h1>
<%
Cookie ck = new Cookie("name", "Shashank");
response.addCookie(ck);
%>
<a href="process.jsp">Click</a>
</body>
</html>
