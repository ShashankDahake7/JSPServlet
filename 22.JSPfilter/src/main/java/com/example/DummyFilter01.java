package com.example;

import jakarta.servlet.*;

import java.io.IOException;

public class DummyFilter01 implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("DummyFilter01 processing request...");
        chain.doFilter(request, response);
    }
}
