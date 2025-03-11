package com.example.servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ForwardServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set example attributes to be used in the forwarded JSP
        request.setAttribute("productName", "Example Product");
        request.setAttribute("price", "$99.99");

        // Forward the request and response to products.jsp
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/products.jsp");
        rd.forward(request, response);
    }
}
