package com.example.servlet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Login extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("userName");
        String password = request.getParameter("userPass");
        if(password.equals("servlet")) {
            RequestDispatcher rd = request.getRequestDispatcher("servlet2");
            rd.forward(request, response);
        }
        else {
            out.print("Sorry, Username or Password is incorrect!");
            RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
            rd.include(request, response);
        }
    }
}