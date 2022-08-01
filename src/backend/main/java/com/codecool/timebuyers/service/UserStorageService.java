
package com.codecool.timebuyers.service;

import com.codecool.timebuyers.dao.UserStorageRepository;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserStorageService {
    @Autowired
    UserStorageRepository userStorageRepository;
    private final List<UserProfile> users = new ArrayList<>();

    public UserProfile getUserByEmail(String email){
        return userStorageRepository.findByEmail(email);
    }
    public List<UserProfile> getAllUser(){
        return userStorageRepository.findAll();
    }
    public void addUser(UserProfile newUserProfile) {
        userStorageRepository.save(newUserProfile);
    }
    public void deleteUser(String userName){
        userStorageRepository.delete(userStorageRepository.findByUserName(userName));
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