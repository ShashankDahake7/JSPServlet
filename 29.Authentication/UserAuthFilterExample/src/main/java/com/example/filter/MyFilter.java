package com.example.filter;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        PrintWriter out = response.getWriter();
        String password = req.getParameter("password");

        if ("admin".equals(password)) {
            chain.doFilter(request, response); // Forward request
        } else {
            out.print("Username or password error!");
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.include(request, response);
        }
    }

    public void destroy() {}
}
