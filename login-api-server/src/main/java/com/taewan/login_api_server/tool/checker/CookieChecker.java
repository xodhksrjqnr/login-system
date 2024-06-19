package com.taewan.login_api_server.tool.checker;

import jakarta.annotation.Nullable;
import jakarta.servlet.http.Cookie;

import java.util.Optional;

public class CookieChecker {

    public static Optional<Cookie> getCookie(@Nullable Cookie[] cookies, String cookieName) {
        if (cookies != null)
            for (Cookie cookie : cookies)
                if (cookie.getName().equals(cookieName))
                    return Optional.of(cookie);

        return Optional.empty();
    }
}
