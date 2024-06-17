package com.taewan.login_api_server.domain.user.dto.response;

import java.util.List;

public class SearchResultDto {

    List<SearchOneResultDto> userList;
    int size;

    public SearchResultDto(List<SearchOneResultDto> dtos) {
        this.userList = dtos;
        this.size = userList.size();
    }

    public List<SearchOneResultDto> getUserList() {
        return userList;
    }

    public int getSize() {
        return size;
    }
}
