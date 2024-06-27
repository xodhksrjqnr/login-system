package com.taewan.login_api_server.domain.user.dto.between;

import com.taewan.login_api_server.common.AuthenticationDto;
import com.taewan.login_api_server.domain.user.common.Role;

public class CertificationDto implements AuthenticationDto {

    private String userId;
    private Role role;

    public String getUserId() {
        return userId;
    }

    public Role getRole() {
        return role;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
