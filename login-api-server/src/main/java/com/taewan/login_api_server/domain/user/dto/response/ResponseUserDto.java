package com.taewan.login_api_server.domain.user.dto.response;

import com.taewan.login_api_server.domain.user.dto.FullInfoDto;

import java.time.LocalDateTime;

public class ResponseUserDto extends FullInfoDto {

    private LocalDateTime createdAt;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
