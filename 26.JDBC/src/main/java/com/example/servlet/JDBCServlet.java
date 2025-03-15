package com.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import com.example.config.DBConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>JDBC Example</title></head><body>");
        out.println("<h2>Database Records:</h2>");

        try (Connection conn = DBConnection.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM Ninjas")) {

            while (rs.next()) {
                out.println("<p>" + rs.getString(1) + "</p>");
            }
        } catch (SQLException e) {
            out.println("<p style='color:red;'>Database Error: " + e.getMessage() + "</p>");
        }

        out.println("<br><a href='index.jsp'>Back to Home</a>");
        out.println("</body></html>");
    }
}
