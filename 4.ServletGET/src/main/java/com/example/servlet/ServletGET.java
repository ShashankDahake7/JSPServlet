package com.example.servlet;

import java.io.*;
import jakarta.servlet.*;  // ✅ Updated from javax.servlet to jakarta.servlet
import jakarta.servlet.http.*;  // ✅ Updated from javax.servlet to jakarta.servlet.http

public class ServletGET extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>This is a simple servlet response from ServletGET</h1>");
    }

    public void destroy() {
        // Cleanup logic if needed
    }
}