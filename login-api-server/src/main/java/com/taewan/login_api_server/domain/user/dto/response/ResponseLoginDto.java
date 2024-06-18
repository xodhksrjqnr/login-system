package com.taewan.login_api_server.domain.user.dto.response;

public class ResponseLoginDto {

    private String userId;
    private String token;

    public ResponseLoginDto(String userId, String token) {
        this.userId = userId;
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }
}
