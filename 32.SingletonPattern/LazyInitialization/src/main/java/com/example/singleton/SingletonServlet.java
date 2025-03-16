package com.example.singleton;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class SingletonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");

        // Getting Singleton instance
        Singleton singleton = Singleton.getInstance();
        String message = singleton.doSomething();

        PrintWriter out = response.getWriter();
        out.println("Response from Singleton: " + message);
    }
}
