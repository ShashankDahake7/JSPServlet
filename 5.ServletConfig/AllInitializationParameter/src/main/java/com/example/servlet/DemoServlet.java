package com.example.servlet;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletConfig config = getServletConfig();
        Enumeration<String> e = config.getInitParameterNames();
        while (e.hasMoreElements()) {
            String paramName = e.nextElement();
            out.print("<br>Name: " + paramName);
            out.print(" Value: " + config.getInitParameter(paramName));
        }
        out.close();
    }
}