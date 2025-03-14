package com.example.shoppingcart;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

public class ShoppingCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve or create a session
        HttpSession session = request.getSession();

        // Get or create the shopping cart
        ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
        if (cart == null) {
            cart = new ShoppingCart();
            session.setAttribute("cart", cart);
        }

        // Add item to cart
        String item = request.getParameter("item");
        if (item != null && !item.trim().isEmpty()) {
            cart.addItem(item);
        }

        // Redirect to cart page
        response.sendRedirect("cart.jsp");
    }
}
