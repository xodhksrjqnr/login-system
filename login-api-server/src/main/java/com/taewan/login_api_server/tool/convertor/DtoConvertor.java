package com.taewan.login_api_server.tool.convertor;

import com.taewan.login_api_server.domain.device.Device;
import com.taewan.login_api_server.domain.device.dto.request.RequestAddInfoDto;
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

    static public Device toDevice(RequestAddInfoDto dto) {
        return Device.create(
                dto.getUserId(),
                dto.getToken(),
                dto.getType(),
                dto.getUuid()
        );
    }
}
