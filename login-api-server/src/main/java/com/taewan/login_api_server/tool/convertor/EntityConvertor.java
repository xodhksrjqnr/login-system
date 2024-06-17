package com.taewan.login_api_server.tool.convertor;

import com.taewan.login_api_server.domain.user.User;
import com.taewan.login_api_server.domain.user.dto.response.SearchOneResultDto;

public class EntityConvertor {

    static public SearchOneResultDto toDto(User entity) {
        SearchOneResultDto dto = new SearchOneResultDto();
        dto.setId(entity.getId());
        dto.setUserId(entity.getUserId());
        dto.setName(entity.getName());
        dto.setPassword(entity.getPassword());
        dto.setPhoneNumber(entity.getPhoneNumber());
        dto.setEmail(entity.getEmail());
        dto.setCreatedAt(entity.getCreatedAt());

        return dto;
    }
}
