package com.codecool.timebuyers.dao;

import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface UserStorageRepository extends JpaRepository<UserProfile, UUID> {
    UserProfile findByEmail(String email);
    UserProfile findByUserName(String username);
    List<UserProfile> findAllByUserStatus(UserStatus userStatus);
}
