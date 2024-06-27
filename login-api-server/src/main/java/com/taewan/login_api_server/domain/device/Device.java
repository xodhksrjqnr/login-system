package com.taewan.login_api_server.domain.device;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Devices")
public class Device extends BaseDeviceEntity {

    protected Device() {}

    protected Device(int id, String userId, String token, String type, String uuid, LocalDateTime lastLoggedInAt) {
        this.id = id;
        this.userId = userId;
        this.token = token;
        this.type = type;
        this.uuid = uuid;
        this.lastLoggedInAt = lastLoggedInAt;
    }

    static public Device create(String userId, String token, String type, String uuid) {
        Device device = new Device();
        device.userId = userId;
        device.token = token;
        device.type = type;
        device.uuid = uuid;

        return device;
    }
}
