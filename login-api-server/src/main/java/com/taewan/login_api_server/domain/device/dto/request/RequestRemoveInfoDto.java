package com.taewan.login_api_server.domain.device.dto.request;

public class RequestRemoveInfoDto {

    private String userId;
    private String uuid;

    public String getUserId() {
        return userId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
