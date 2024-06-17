package com.taewan.login_api_server.domain.device;

import com.taewan.login_api_server.common.BaseTime2;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "Devices")
public class Device extends BaseTime2 {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(length = 100)
    String deviceToken;
    @Column(length = 20)
    String userId;

    public Device() {}

    public Device(int id, String deviceToken, String userId, LocalDateTime lastLoggedInAt) {
        this.id = id;
        this.deviceToken = deviceToken;
        this.userId = userId;
        this.setLastLoggedInAt(lastLoggedInAt);
    }

    static public Device create(String deviceToken, String userId) {
        Device device = new Device();
        device.deviceToken = deviceToken;
        device.userId = userId;

        return device;
    }

    public int getId() {
        return id;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public String getUserId() {
        return userId;
    }
}
