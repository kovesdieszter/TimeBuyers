
package com.codecool.timebuyers.service;

import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserStorageService {
    private final List<UserProfile> users = new ArrayList<>();

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
    public List<UserProfile> getAllUser(){
        return users;
    }
    public void addUser(UserProfile newUserProfile) {
        users.add(newUserProfile);
    }
    public void deleteUser(String userName){
        for (UserProfile user : users) {
            if (user.getUserName().equals(userName)){
                users.remove(user);
                break;
            }
        }
    }
    public void updateUserByUserName(String selectedUserName,
                                 String updatedPassword,
                                 String updatedPhoneNumber,
                                 String updatedEmail,
                                 String updatedTown,
                                 UserStatus updatedUserStatus,
                                 List<Task> updatedTaskToNeed,
                                 List<Task> updatedTaskToTake){
        for (UserProfile user : users) {
            if (user.getUserName().equals(selectedUserName)){
                user.setPassword(updatedPassword);
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
        return "Registered users: " + users;
    }

}