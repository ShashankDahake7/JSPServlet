package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class CheckedExceptionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Checked Exception Example</title></head><body>");
        out.println("<h2>Demonstrating Checked Exception Handling in a Servlet</h2>");

        try {
            simulateCheckedException();
            out.println("<p>Operation completed successfully.</p>");
        } catch (IOException e) {
            out.println("<p style='color:red;'>Error: A checked exception occurred - " + e.getMessage() + "</p>");
        }

        out.println("</body></html>");
    }

    private void simulateCheckedException() throws IOException {
        throw new IOException("Simulated IOException: File not found or unable to read.");
    }
}