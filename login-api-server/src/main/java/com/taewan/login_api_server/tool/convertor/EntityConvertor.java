package com.taewan.login_api_server.tool.convertor;

import com.taewan.login_api_server.domain.device.Device;
import com.taewan.login_api_server.domain.device.dto.response.ResponseDeviceDto;
import com.taewan.login_api_server.domain.user.User;
import com.taewan.login_api_server.domain.user.dto.between.CertificationDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseUserDto;

public class EntityConvertor {

    static public ResponseUserDto toResponseUserDto(User entity) {
        ResponseUserDto dto = new ResponseUserDto();
        dto.setUserId(entity.getUserId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setPhoneNumber(entity.getPhoneNumber());
        dto.setEmail(entity.getEmail());
        dto.setCreatedAt(entity.getCreatedAt());

        return dto;
    }

    static public CertificationDto toCertificationDto(User entity) {
        CertificationDto dto = new CertificationDto();
        dto.setUserId(entity.getUserId());

        return dto;
    }

    static public ResponseDeviceDto toResponseDeviceDto(Device entity) {
        ResponseDeviceDto dto = new ResponseDeviceDto();
        dto.setToken(entity.getToken());
        dto.setType(entity.getType());
        dto.setUuid(entity.getUuid());
        dto.setLastLoggedInAt(entity.getLastLoggedInAt());

        return dto;
    }
}
