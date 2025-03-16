package com.example.jdbc;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class DatabaseServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");
        JDBCSingleton jdbc = JDBCSingleton.getInstance();

        try {
            switch (action) {
                case "insert":
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    jdbc.insert(username, password);
                    out.println("Data inserted successfully.");
                    break;
                case "view":
                    username = request.getParameter("username");
                    String result = jdbc.view(username);
                    out.println("User Data: " + result);
                    break;
                default:
                    out.println("Invalid action.");
            }
        } catch (SQLException e) {
            out.println("Database error: " + e.getMessage());
        }
    }
}