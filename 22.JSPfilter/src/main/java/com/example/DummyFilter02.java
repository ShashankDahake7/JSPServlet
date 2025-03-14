package com.example;

import jakarta.servlet.*;

import java.io.IOException;

public class DummyFilter02 implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("DummyFilter02 processing request...");
        chain.doFilter(request, response);
    }
}