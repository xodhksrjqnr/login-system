package com.taewan.login_api_server.domain.user.service;

import com.taewan.login_api_server.domain.user.dto.request.JoinInfoDto;
import com.taewan.login_api_server.domain.user.dto.request.RequestLoginDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseLoginDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseUsersDto;
import com.taewan.login_api_server.domain.user.dto.request.LeaveInfoDto;

public interface UserService {

    void join(JoinInfoDto dto);
    void leave(LeaveInfoDto dto);
    ResponseUsersDto searchAll();
    ResponseLoginDto login(RequestLoginDto dto);
    void logout();
}
