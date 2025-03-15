package com.javadoubts.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

public class LoginFilter implements Filter {
    private String country;

    public void init(FilterConfig filterConfig) throws ServletException {
        country = filterConfig.getInitParameter("country");

        System.out.println("Country = " + country);
        System.out.println("Servlet Name = " + filterConfig.getFilterName());

        Enumeration<String> params = filterConfig.getInitParameterNames();
        while (params.hasMoreElements()) {
            String paramName = params.nextElement();
            System.out.println("Param Name = " + paramName);
        }
    }

    public void destroy() {}

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("doFilter() method called");

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        System.out.println("Request from: " + httpRequest.getRemoteAddr());

        chain.doFilter(request, response);
    }
}
