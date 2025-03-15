package com.example.servlet;

import com.example.dao.DBConnection;
import com.example.dao.UserDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;

public class UserServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Connection con = DBConnection.getConnection();

            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            int salary = Integer.parseInt(request.getParameter("salary"));
            String action = request.getParameter("action");

            int status = UserDAO.insertUser(id, name, salary, con);

            if (action.equalsIgnoreCase("commit")) {
                UserDAO.commitTransaction(con);
            } else if (action.equalsIgnoreCase("rollback")) {
                UserDAO.rollbackTransaction(con);
            }

            con.close();
            response.sendRedirect("index.jsp?status=" + status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
