package com.codecool.timebuyers.service;

import com.codecool.timebuyers.model.UserProfile;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class UserStorageService {
    private Set<UserProfile> users;

    public UserProfile getUser(String selectedUserName){
        UserProfile selectedUser = null;
        for (UserProfile user : users) {
            if (user.getUserName().equals(selectedUserName)) {
                selectedUser = user;

            } else {
                System.out.println("User not found with this username.");
            }
        }
        return selectedUser;
    }

    public Set<UserProfile> getAllUser(){
        return users;
    }

    public void addUser(UserProfile newUserProfile) {
        users.add(newUserProfile);
    }

    public void deleteUser(UserProfile user){
        users.remove(user);
    }

    public void updateUserByName(String selectedUserName,
                                 String updatedPhoneNumber,
                                 String updatedEmail,
                                 String updatedTown,
                                 UserStatus updatedUserStatus,
                                 Set<Task> updatedTaskToNeed,
                                 Set<Task> updatedTaskToTake){
        for (UserProfile user : users) {
            if (user.getUserName().equals(selectedUserName)){
                user.setPhoneNumber(updatedPhoneNumber);
                user.setEmail(updatedEmail);
                user.setTown(updatedTown);
                user.setUserStatus(updatedUserStatus);
                user.setTaskToNeed(updatedTaskToNeed);
                user.setTaskToTake(updatedTaskToTake);
            }
        }
    }

    @Override
    public String toString() {
        return "In this UserStorageService are the next" +
                "users=" + users;
    }
}
