<!DOCTYPE html>
<html>
<head>
    <title>GET Method using URL</title>
</head>
<body>
    <h1>Form Processing in JSP</h1>
    <p><b>First Name:</b> <%= request.getParameter("first_name") %></p>
    <p><b>Last Name:</b> <%= request.getParameter("last_name") %></p>
</body>
</html>
