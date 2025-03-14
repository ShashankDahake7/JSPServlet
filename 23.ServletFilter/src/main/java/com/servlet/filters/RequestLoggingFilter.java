package com.servlet.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.Date;

public class RequestLoggingFilter implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String ipAddress = request.getRemoteAddr();
        System.out.println("Request from IP: " + ipAddress + " at " + new Date());
        chain.doFilter(request, response);
    }
}
