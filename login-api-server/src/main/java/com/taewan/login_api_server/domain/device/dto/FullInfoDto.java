package com.taewan.login_api_server.domain.device.dto;

import java.time.LocalDateTime;

public abstract class FullInfoDto {
    private String token;
    private String type;
    private String uuid;
    private LocalDateTime lastLoggedInAt;

    public String getToken() {
        return token;
    }

    public String getType() {
        return type;
    }

    public String getUuid() {
        return uuid;
    }

    public LocalDateTime getLastLoggedInAt() {
        return lastLoggedInAt;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setLastLoggedInAt(LocalDateTime lastLoggedInAt) {
        this.lastLoggedInAt = lastLoggedInAt;
    }
}
