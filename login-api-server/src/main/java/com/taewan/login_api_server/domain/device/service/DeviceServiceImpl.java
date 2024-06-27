package com.taewan.login_api_server.domain.device.service;

import com.taewan.login_api_server.domain.device.dto.request.RequestAddInfoDto;
import com.taewan.login_api_server.domain.device.dto.request.RequestRemoveInfoDto;
import com.taewan.login_api_server.domain.device.dto.request.RequestUserDevicesInfoDto;
import com.taewan.login_api_server.domain.device.dto.response.ResponseDevicesDto;
import com.taewan.login_api_server.domain.device.repository.DeviceRepository;
import com.taewan.login_api_server.tool.convertor.DtoConvertor;
import com.taewan.login_api_server.tool.convertor.EntityConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }


    @Override
    public void add(RequestAddInfoDto dto) {
        dto.setToken(createNotificationToken());
        deviceRepository.save(DtoConvertor.toDevice(dto));
    }

    @Override
    public void remove(RequestRemoveInfoDto dto) {
        deviceRepository.deleteByUserIdAndUuid(dto.getUserId(), dto.getUuid());
    }

    @Override
    public ResponseDevicesDto searchAll(RequestUserDevicesInfoDto dto) {
        return new ResponseDevicesDto(
                deviceRepository.findAllByUserId(dto.getUserId())
                        .stream()
                        .map(EntityConvertor::toResponseDeviceDto)
                        .toList()
        );
    }

    private String createNotificationToken() {
        return "tmp";
    }
}
