package com.example.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        // Creating ServletContext object
        ServletContext context = getServletContext();
        // Getting the value of the initialization parameter
        String driverName = context.getInitParameter("dname");
        pw.println("Driver name is = " + driverName);
        pw.close();
    }
}