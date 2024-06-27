package com.taewan.login_api_server.domain.user;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseUserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected int id;
    @Column(length = 20, unique = true)
    protected String userId;
    @Column(length = 45)
    protected String password;
    @Column(length = 30, updatable = false)
    protected String name;
    @Column(length = 15)
    protected String phoneNumber;
    @Column(length = 100, unique = true)
    protected String email;
    @CreatedDate
    protected LocalDateTime createdAt;

    public int getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
