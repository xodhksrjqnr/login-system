package com.taewan.login_api_server.domain.user.repository;

import com.taewan.login_api_server.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {

    void deleteByUserIdAndEmail(String userId, String email);
    Optional<User> findByUserIdAndPassword(String userId, String password);
}
