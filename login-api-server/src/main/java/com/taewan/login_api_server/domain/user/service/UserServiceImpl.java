package com.taewan.login_api_server.domain.user.service;

import com.taewan.login_api_server.domain.user.dto.between.CertificationDto;
import com.taewan.login_api_server.domain.user.dto.request.JoinInfoDto;
import com.taewan.login_api_server.domain.user.dto.request.LeaveInfoDto;
import com.taewan.login_api_server.domain.user.dto.request.RequestLoginDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseLoginDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseUserDto;
import com.taewan.login_api_server.domain.user.dto.response.ResponseUsersDto;
import com.taewan.login_api_server.domain.user.repository.UsersRepository;
import com.taewan.login_api_server.provider.TokenProvider;
import com.taewan.login_api_server.tool.convertor.DtoConvertor;
import com.taewan.login_api_server.tool.convertor.EntityConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;
    private final TokenProvider tokenProvider;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository, TokenProvider tokenProvider) {
        this.usersRepository = usersRepository;
        this.tokenProvider = tokenProvider;
    }

    @Override
    public void join(JoinInfoDto dto) {
        usersRepository.save(DtoConvertor.toUser(dto));
    }

    @Override
    public void leave(LeaveInfoDto dto) {
        usersRepository.deleteByUserIdAndEmail(dto.getUserId(), dto.getEmail());
    }

    @Override
    @Transactional(readOnly = true)
    public ResponseUsersDto searchAll() {
        List<ResponseUserDto> dtos = usersRepository.findAll()
                .stream()
                .map(EntityConvertor::toResponseUserDto)
                .collect(Collectors.toList());

        return new ResponseUsersDto(dtos);
    }

    @Override
    public ResponseLoginDto login(RequestLoginDto dto) {
        CertificationDto user = EntityConvertor.toCertificationDto(
                usersRepository.findByUserIdAndPassword(dto.getUserId(), dto.getPassword())
                        .orElseThrow(NoSuchElementException::new)
        );

        return new ResponseLoginDto(user.getUserId(), tokenProvider.create(user));
    }

    @Override
    public void logout() {

    }
}
