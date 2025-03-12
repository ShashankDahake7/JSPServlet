<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head><title>JSTL Core Tags</title></head>
<body>

<h2>Loop Example:</h2>
<ul>
    <c:forEach var="i" begin="1" end="5">
        <li>Item ${i}</li>
    </c:forEach>
</ul>

<h2>Conditional Example:</h2>
<c:if test="${5 > 3}">
    <p>5 is greater than 3</p>
</c:if>

</body>
</html>
