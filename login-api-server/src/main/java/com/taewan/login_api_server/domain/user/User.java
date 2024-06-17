package com.taewan.login_api_server.domain.user;

import com.taewan.login_api_server.common.BaseTime;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User extends BaseTime {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20, unique = true)
    private String userId;
    @Column(length = 45)
    private String password;
    @Column(length = 30, updatable = false)
    private String name;
    @Column(length = 15)
    private String phoneNumber;
    @Column(length = 100, unique = true)
    private String email;

    public User() {}

    public User(int id, String userId, String password, String name, String phoneNumber, String email, LocalDateTime createdAt) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.setCreatedAt(createdAt);
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
}
