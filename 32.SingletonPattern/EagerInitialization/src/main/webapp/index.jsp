<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Singleton Example</title>
    <script type="application/javascript">
        function loadSingletonMessage() {
            var url = "singleton"; // Call the servlet
            var request = new XMLHttpRequest();

            request.onreadystatechange = function () {
                if (request.readyState == 4 && request.status == 200) {
                    document.getElementById("response").innerHTML = request.responseText;
                }
            };

            request.open("GET", url, true);
            request.send();
        }
    </script>
</head>
<body>
    <h2>Singleton Example in Jakarta EE</h2>
    <p><strong>Response:</strong> <span id="response"></span></p>
    <button type="button" onclick="loadSingletonMessage()">Call Singleton</button>
</body>
</html>
