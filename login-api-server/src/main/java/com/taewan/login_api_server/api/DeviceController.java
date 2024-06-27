package com.taewan.login_api_server.api;

import com.taewan.login_api_server.domain.device.dto.request.RequestUserDevicesInfoDto;
import com.taewan.login_api_server.domain.device.dto.response.ResponseDevicesDto;
import com.taewan.login_api_server.domain.device.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService deviceService;

    @Autowired
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping
    public ResponseDevicesDto askOfDevices(RequestUserDevicesInfoDto dto) {
        return deviceService.searchAll(dto);
    }
}
