package com.codecool.timebuyers.model;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class UserProfile {
    private final UUID id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private String town;
    private UserStatus userStatus;
    private Set<Task> taskToNeed = new HashSet<>();
    private Set<Task> taskToTake = new HashSet<>();

    public UserProfile(String userName, String password,
                       String phoneNumber, String email, String town,
                       UserStatus userStatus, Set<Task> taskToNeed, Set<Task> taskToTake) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.town = town;
        this.userStatus = userStatus;
        this.taskToNeed = taskToNeed;
        this.taskToTake = taskToTake;
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

    public void addTaskToNeed(Task task){
        taskToNeed.add(task);
    }

    public void addTaskToTake(Task task){
        taskToTake.add(task);
    }

    @Override
    public String toString() {
        return "userName: " + userName;
    }
}
