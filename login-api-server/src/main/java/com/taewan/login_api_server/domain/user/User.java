package com.taewan.login_api_server.domain.user;

import com.taewan.login_api_server.common.BaseUserEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User extends BaseUserEntity {

    protected User() {}

    protected User(int id, String userId, String password, String name, String phoneNumber, String email, LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.createdAt = createdAt;
    }

    static public User create(String userId, String password, String name, String phoneNumber, String email) {
        User user = new User();
        user.userId = userId;
        user.password = password;
        user.name = name;
        user.phoneNumber = phoneNumber;
        user.email = email;

        return user;
    }
}
