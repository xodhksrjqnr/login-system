package com.taewan.login_api_server.domain.user.dto.response;

import com.taewan.login_api_server.domain.user.dto.FullInfoDto;

import java.time.LocalDateTime;

public class ResponseUserDto extends FullInfoDto {

    private int id;
    private LocalDateTime createdAt;

    public int getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
