<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
    <h2>Add Item to Cart</h2>
    <form action="cart" method="post">
        <input type="text" name="item" placeholder="Enter item name" required />
        <button type="submit">Add to Cart</button>
    </form>
    <a href="cart.jsp">View Cart</a>
</body>
</html>
