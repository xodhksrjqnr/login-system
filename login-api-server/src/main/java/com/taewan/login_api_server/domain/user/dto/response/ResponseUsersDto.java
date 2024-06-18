package com.taewan.login_api_server.domain.user.dto.response;

import java.util.List;

public class ResponseUsersDto {

    List<ResponseUserDto> userList;
    int size;

    public ResponseUsersDto(List<ResponseUserDto> dtos) {
        this.userList = dtos;
        this.size = userList.size();
    }

    public List<ResponseUserDto> getUserList() {
        return userList;
    }

    public int getSize() {
        return size;
    }
}
