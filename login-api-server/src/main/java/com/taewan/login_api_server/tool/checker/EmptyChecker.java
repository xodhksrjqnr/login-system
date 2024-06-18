package com.taewan.login_api_server.tool.checker;

import jakarta.servlet.http.Cookie;

public class EmptyChecker {

    public static boolean isNull(Object[] array) {
        return array == null || array.length == 0;
    }
}
