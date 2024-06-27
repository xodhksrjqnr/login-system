package com.taewan.login_api_server.domain.device.service;

import com.taewan.login_api_server.domain.device.dto.request.RequestAddInfoDto;
import com.taewan.login_api_server.domain.device.dto.request.RequestRemoveInfoDto;

public interface DeviceService {

    void add(RequestAddInfoDto dto);
    void remove(RequestRemoveInfoDto dto);
}
