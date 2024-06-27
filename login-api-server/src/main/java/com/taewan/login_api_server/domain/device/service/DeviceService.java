package com.taewan.login_api_server.domain.device.service;

import com.taewan.login_api_server.domain.device.dto.request.RequestAddInfoDto;
import com.taewan.login_api_server.domain.device.dto.request.RequestRemoveInfoDto;
import com.taewan.login_api_server.domain.device.dto.request.RequestUserDevicesInfoDto;
import com.taewan.login_api_server.domain.device.dto.response.ResponseDevicesDto;

public interface DeviceService {

    void add(RequestAddInfoDto dto);
    void remove(RequestRemoveInfoDto dto);
    ResponseDevicesDto searchAll(RequestUserDevicesInfoDto dto);
}
