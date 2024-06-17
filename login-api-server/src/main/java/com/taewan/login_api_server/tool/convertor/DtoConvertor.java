package com.taewan.login_api_server.tool.convertor;

import com.taewan.login_api_server.domain.user.User;
import com.taewan.login_api_server.domain.user.dto.FullInfoDto;

public class DtoConvertor {

    static public User toUser(FullInfoDto dto) {
        return User.create(
                dto.getUserId(),
                dto.getPassword(),
                dto.getName(),
                dto.getPhoneNumber(),
                dto.getEmail()
        );
    }
}
