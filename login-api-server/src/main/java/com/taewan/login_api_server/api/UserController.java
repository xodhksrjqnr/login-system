package com.taewan.login_api_server.api;

import com.taewan.login_api_server.domain.user.dto.request.JoinInfoDto;
import com.taewan.login_api_server.domain.user.dto.request.RequestLoginDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseLoginDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseUsersDto;
import com.taewan.login_api_server.domain.user.dto.request.LeaveInfoDto;
import com.taewan.login_api_server.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public ResponseUsersDto requestSearchAll() {
        return userService.searchAll();
    }

    @PostMapping("/join")
    public void requestJoin(@ModelAttribute JoinInfoDto dto) {
        userService.join(dto);
    }

    @PostMapping("/leave")
    public void requestLeave(@ModelAttribute LeaveInfoDto dto) {
        userService.leave(dto);
    }

    @PostMapping("/login")
    public ResponseLoginDto requestLogin(@ModelAttribute RequestLoginDto dto) {
        return userService.login(dto);
    }
}
