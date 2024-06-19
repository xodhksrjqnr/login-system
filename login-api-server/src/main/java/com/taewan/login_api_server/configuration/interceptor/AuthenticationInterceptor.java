package com.taewan.login_api_server.configuration.interceptor;

import com.taewan.login_api_server.etc.jwt.TokenProvider;
import com.taewan.login_api_server.tool.checker.CookieChecker;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;


@Component
public class AuthenticationInterceptor implements HandlerInterceptor {

    private final TokenProvider tokenProvider;

    @Autowired
    public AuthenticationInterceptor(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        tokenProvider.validate(
                CookieChecker.getCookie(request.getCookies(), "AuthenticationToken")
                        .orElseThrow(BadRequestException::new)
                        .getValue()
        );
        return true;
    }
}
