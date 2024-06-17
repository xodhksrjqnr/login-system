package com.taewan.login_api_server.api;

import com.taewan.login_api_server.domain.user.dto.request.JoinInfoDto;
import com.taewan.login_api_server.domain.user.dto.response.SearchResultDto;
import com.taewan.login_api_server.domain.user.dto.request.WithdrawInfoDto;
import com.taewan.login_api_server.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public SearchResultDto requestSearchAll() {
        return userService.searchAll();
    }

    @PostMapping("/join")
    public void requestJoin(JoinInfoDto dto) {
        userService.join(dto);
    }

    @PostMapping("/withdraw")
    public void requestWithDraw(WithdrawInfoDto dto) {
        userService.withdraw(dto);
    }
}
