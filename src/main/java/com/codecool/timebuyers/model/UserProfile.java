package com.codecool.timebuyers.model;

import org.springframework.stereotype.Component;

import java.util.*;
public class UserProfile {
    private final UUID id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private String town;
    private UserStatus userStatus;
    private List<Task> taskToNeed = new ArrayList<>();
    private List<Task> taskToTake = new ArrayList<>();

    public UserProfile(String userName, String password,
                       String phoneNumber, String email, String town,
                       UserStatus userStatus, List<Task> taskToNeed, List<Task> taskToTake) {
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

    public List<Task> getTaskToNeed() {
        return taskToNeed;
    }

    public List<Task> getTaskToTake() {
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

    public void setTaskToNeed(List<Task> taskToNeed) {
        this.taskToNeed = taskToNeed;
    }

    public void setTaskToTake(List<Task> taskToTake) {
        this.taskToTake = taskToTake;
    }

    public void addTaskToNeed(Task task){
        taskToNeed.add(task);
    }

    public void addTaskToTake(Task task){
        taskToTake.add(task);
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "userName: " + userName;
    }

}
