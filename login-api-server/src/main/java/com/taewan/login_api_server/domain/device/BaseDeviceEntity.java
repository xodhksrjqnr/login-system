package com.taewan.login_api_server.domain.device;

import jakarta.persistence.*;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseDeviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(length = 20)
    protected String userId;
    @Column(length = 100)
    protected String token;
    @Column(length = 20)
    protected String type;
    @Column(length = 36)
    protected String uuid;
    @LastModifiedDate
    protected LocalDateTime lastLoggedInAt;

    public int getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getToken() {
        return token;
    }

    public String getType() {
        return type;
    }

    public String getUuid() {
        return uuid;
    }

    public LocalDateTime getLastLoggedInAt() {
        return lastLoggedInAt;
    }
}
