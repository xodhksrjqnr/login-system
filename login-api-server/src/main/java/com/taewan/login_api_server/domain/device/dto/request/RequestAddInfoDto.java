package com.taewan.login_api_server.domain.device.dto.request;

import java.util.UUID;

public class RequestAddInfoDto {

    private String userId;
    private String token;
    private String type;
    private String uuid;

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public String getType() {
        return type;
    }

    public String getUuid() {
        if (uuid.isEmpty())
            uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setType(String type) {
        this.type = type;
    }
}
