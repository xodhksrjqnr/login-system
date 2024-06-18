package com.taewan.login_api_server.etc.jwt;

import com.taewan.login_api_server.domain.user.dto.between.CertificationDto;

public interface TokenProvider {

    String create(CertificationDto dto);
    void validate(String token);
}
