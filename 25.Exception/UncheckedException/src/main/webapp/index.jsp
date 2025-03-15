<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Unchecked Exception Example</title>
</head>
<body>
    <h2>Unchecked Exception Example</h2>
    <p>Enter a number. If you enter 0, an ArithmeticException (divide by zero) will be triggered.</p>
    <form action="UncheckedExceptionServlet" method="get">
        <label>Enter a number: <input type="text" name="number"></label>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
