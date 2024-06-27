package com.taewan.login_api_server.domain.device.repository;

import com.taewan.login_api_server.domain.device.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Integer> {

    void deleteByUserIdAndUuid(String userId, String uuid);
}
