<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="books" value="${['Effective Java', 'Clean Code']}" />

<html>
<head><title>JSTL Core Example</title></head>
<body>

<h2>Books List</h2>
<ul>
    <c:forEach var="book" items="${books}">
        <li>${book}</li>
    </c:forEach>
</ul>

</body>
</html>
