<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head><title>JSTL Formatting Tags</title></head>
<body>

<h2>Number Formatting:</h2>
<p>Price: <fmt:formatNumber value="12345.678" type="currency" currencyCode="USD"/></p>

<h2>Date Formatting:</h2>
<p>Today: <fmt:formatDate value="<%= new java.util.Date() %>" type="date" dateStyle="full"/></p>

</body>
</html>
