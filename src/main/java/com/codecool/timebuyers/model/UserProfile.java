package com.codecool.timebuyers.model;

import java.util.UUID;

public class UserProfile {
    private UUID id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private UserStatus userStatus;
    private Set<Task> taskToNeed;
    private Set<Task> taskToTake;

    public UserProfile(UUID id, String userName, UserStatus userStatus) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.userStatus = userStatus;
    }
}
