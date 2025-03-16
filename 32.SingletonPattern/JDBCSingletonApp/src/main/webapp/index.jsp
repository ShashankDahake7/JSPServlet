<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JDBC Singleton Example</title>
    <script>
        function insertUser() {
            let username = document.getElementById("username").value;
            let password = document.getElementById("password").value;

            fetch("database", {
                method: "POST",
                headers: { "Content-Type": "application/x-www-form-urlencoded" },
                body: "action=insert&username=" + username + "&password=" + password
            }).then(response => response.text())
              .then(data => alert(data));
        }

        function viewUser() {
            let username = document.getElementById("viewUsername").value;

            fetch("database", {
                method: "POST",
                headers: { "Content-Type": "application/x-www-form-urlencoded" },
                body: "action=view&username=" + username
            }).then(response => response.text())
              .then(data => document.getElementById("result").innerText = data);
        }
    </script>
</head>
<body>
    <h2>JDBC Singleton Example</h2>

    <h3>Insert User</h3>
    <input type="text" id="username" placeholder="Username">
    <input type="password" id="password" placeholder="Password">
    <button onclick="insertUser()">Insert</button>

    <h3>View User</h3>
    <input type="text" id="viewUsername" placeholder="Username">
    <button onclick="viewUser()">View</button>

    <p><strong>Result:</strong> <span id="result"></span></p>
</body>
</html>