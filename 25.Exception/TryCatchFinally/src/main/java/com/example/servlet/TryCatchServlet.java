package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TryCatchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Try-Catch-Finally Example</title></head><body>");
        out.println("<h2>Demonstrating Try-Catch-Finally in a Servlet</h2>");

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            int result = 100 / number; // May throw ArithmeticException
            out.println("<p>Result: " + result + "</p>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Error: Please enter a valid number!</p>");
        } catch (ArithmeticException e) {
            out.println("<p style='color:red;'>Error: Division by zero is not allowed!</p>");
        } finally {
            out.println("<p>Execution completed. The finally block has run.</p>");
        }

        out.println("</body></html>");
    }
}
