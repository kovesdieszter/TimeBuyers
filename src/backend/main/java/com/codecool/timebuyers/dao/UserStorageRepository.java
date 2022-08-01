package com.codecool.timebuyers.dao;

import com.codecool.timebuyers.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserStorageRepository extends JpaRepository<UserProfile, UUID> {
    UserProfile findByEmail(String email);
    UserProfile findByUserName(String username);
}
