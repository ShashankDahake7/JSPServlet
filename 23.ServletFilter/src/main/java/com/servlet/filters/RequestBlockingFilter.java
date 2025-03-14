package com.servlet.filters;

import eu.bitwalker.useragentutils.UserAgent;
import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RequestBlockingFilter implements Filter {
    public void init(FilterConfig fConfig) throws ServletException {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String userAgentHeader = httpRequest.getHeader("User-Agent");
        UserAgent userAgent = UserAgent.parseUserAgentString(userAgentHeader);

        if (userAgent.getBrowser().getGroup().getName().equalsIgnoreCase("Firefox")) {
            httpResponse.sendRedirect("/MovieHut/index.html?error=blocked");
            return;
        }

        chain.doFilter(request, response);
    }
}