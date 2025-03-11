package com.example.servlet;

import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class DemoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        ServletContext context = getServletContext();
        Enumeration<String> e = context.getInitParameterNames();
        while (e.hasMoreElements()) {
            String paramName = e.nextElement();
            out.print("<br>" + paramName + " = " + context.getInitParameter(paramName));
        }
        out.close();
    }
}
