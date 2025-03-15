package com.example.servlet;

import com.example.dao.EmployeeDAO;
import com.example.dao.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        List<Employee> list = EmployeeDAO.getAllEmployees();
        out.println("<h1>Employee List</h1>");
        for (Employee emp : list) {
            out.println("<p>ID: " + emp.getId() + ", Name: " + emp.getName() + "</p>");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");

        int status = EmployeeDAO.insertEmployee(id, name);
        response.sendRedirect("employee");
    }
}
