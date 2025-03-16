<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AJAX JSON Example</title>
    <script type="application/javascript">
        function load() {
            var url = "datetime"; // Call the servlet
            var request = new XMLHttpRequest();

            request.onreadystatechange = function () {
                if (request.readyState == 4 && request.status == 200) {
                    var jsonObj = JSON.parse(request.responseText);
                    document.getElementById("date").innerHTML = jsonObj.date;
                    document.getElementById("time").innerHTML = jsonObj.time;
                }
            };

            request.open("GET", url, true);
            request.send();
        }
    </script>
</head>
<body>
    <h2>AJAX JSON Example</h2>
    <p><strong>Date:</strong> <span id="date"></span></p>
    <p><strong>Time:</strong> <span id="time"></span></p>
    <button type="button" onclick="load()">Load Information</button>
</body>
</html>