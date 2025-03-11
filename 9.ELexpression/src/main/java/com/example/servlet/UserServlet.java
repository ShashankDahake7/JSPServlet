package com.example.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class UserServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create a User object
        User user = new User("Shashank", 20);

        // Set the User object in the request scope
        request.setAttribute("user", user);

        // Forward the request to the JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/user.jsp");
        dispatcher.forward(request, response);
    }
}