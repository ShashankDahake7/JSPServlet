<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error Page</title>
</head>
<body>
    <h2>An error occurred</h2>
    <p>Error Message: <%= exception.getMessage() %></p>
</body>
</html>
