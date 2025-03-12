<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<sql:setDataSource var="ds" driver="com.mysql.cj.jdbc.Driver"
                   url="jdbc:mysql://localhost:3306/testdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC"
                   user="root" password="password"/>
<sql:query dataSource="${ds}" var="result">
    SELECT * FROM users;
</sql:query>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>
    <c:forEach var="row" items="${result.rows}">
        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
        </tr>
    </c:forEach>
</table>
