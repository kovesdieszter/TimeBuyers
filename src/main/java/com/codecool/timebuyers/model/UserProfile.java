package com.codecool.timebuyers.model;

import java.util.Set;
import java.util.UUID;

public class UserProfile {
    private UUID id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private String town;
    private UserStatus userStatus;
    private Set<Task> taskToNeed;
    private Set<Task> taskToTake;

    public UserProfile(UUID id, String userName, String password, UserStatus userStatus) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        this.userStatus = userStatus;
    }

    public String getUserName() {
        return userName;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public String getTown() {
        return town;
    }

    public Set<Task> getTaskToNeed() {
        return taskToNeed;
    }

    public Set<Task> getTaskToTake() {
        return taskToTake;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public void setTaskToNeed(Set<Task> taskToNeed) {
        this.taskToNeed = taskToNeed;
    }

    public void setTaskToTake(Set<Task> taskToTake) {
        this.taskToTake = taskToTake;
    }
}
