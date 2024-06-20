package com.taewan.login_api_server.provider;

import com.taewan.login_api_server.domain.user.dto.between.CertificationDto;

public interface TokenProvider {

    String create(CertificationDto dto);
    void validateAuthorityOfService(String token);
    void validateAuthorityOfAdmin(String token);
}
