package com.taewan.login_api_server.configuration.filter;

import com.sun.jdi.request.InvalidRequestStateException;
import com.taewan.login_api_server.etc.jwt.TokenProvider;
import com.taewan.login_api_server.tool.checker.EmptyChecker;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Arrays;

@Component
@WebFilter(urlPatterns= "/user/all")
public class AuthenticationFilter implements Filter {

    private final TokenProvider tokenProvider;

    @Autowired
    public AuthenticationFilter(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        Cookie[] cookies = ((HttpServletRequest) request).getCookies();

        if (EmptyChecker.isNull(cookies))
            throw new InvalidRequestStateException();

        Arrays.stream(cookies)
                .filter(cookie -> cookie.getName().equals("AuthenticationToken"))
                .findFirst()
                .ifPresent(token -> tokenProvider.validate(token.getValue()));

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}
