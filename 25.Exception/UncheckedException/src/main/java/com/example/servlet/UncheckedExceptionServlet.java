package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class UncheckedExceptionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Unchecked Exception Example</title></head><body>");
        out.println("<h2>Demonstrating Unchecked Exception Handling in a Servlet</h2>");

        try {
            simulateUncheckedException();
            out.println("<p>Operation completed successfully.</p>");
        } catch (ArithmeticException e) {
            out.println("<p style='color:red;'>Error: A runtime exception occurred - " + e.getMessage() + "</p>");
        }

        out.println("</body></html>");
    }

    private void simulateUncheckedException() {
        int result = 100 / 0; // This will cause an ArithmeticException (divide by zero)
    }
}