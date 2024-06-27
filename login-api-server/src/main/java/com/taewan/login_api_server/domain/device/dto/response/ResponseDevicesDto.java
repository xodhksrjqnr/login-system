package com.taewan.login_api_server.domain.device.dto.response;

import java.util.List;

public class ResponseDevicesDto {

    private List<ResponseDeviceDto> dtos;
    private int size;

    public ResponseDevicesDto(List<ResponseDeviceDto> dtos) {
        this.dtos = dtos;
        this.size = dtos.size();
    }

    public List<ResponseDeviceDto> getDtos() {
        return dtos;
    }

    public int getSize() {
        return size;
    }
}
