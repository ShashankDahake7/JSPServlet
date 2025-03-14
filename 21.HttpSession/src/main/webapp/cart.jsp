<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.shoppingcart.ShoppingCart" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Your Shopping Cart</title>
</head>
<body>
    <h2>Your Cart</h2>
    <%
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart == null || cart.getItems().isEmpty()) {
    %>
        <p>Your cart is empty.</p>
    <%
        } else {
            List<String> items = cart.getItems();
            for (String item : items) {
    %>
                <p><%= item %></p>
    <%
            }
        }
    %>
    <a href="index.jsp">Back to Shop</a>
</body>
</html>