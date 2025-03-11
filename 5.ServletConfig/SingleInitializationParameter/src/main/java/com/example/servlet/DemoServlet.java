package com.example.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve initialization parameter from ServletConfig
        ServletConfig config = getServletConfig();
        String driver = config.getInitParameter("driver");

        // Output the retrieved driver value
        out.print("Driver is: " + driver);
        out.close();
    }
}
