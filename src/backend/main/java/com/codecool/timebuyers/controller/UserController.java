package com.codecool.timebuyers.controller;


import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.service.UserStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserStorageService userStorageService;

    @GetMapping(value = "api/users/get/{email}")
    public UserProfile getUser(@PathVariable String email) {
        return userStorageService.getUserByEmail(email);
    }

    @GetMapping(value = "api/users/all")
    public List<UserProfile> getAllUser() {
        return userStorageService.getAllUser();
    }

    @GetMapping(value = "api/users/taskers")
    public List<UserProfile> getTaskers() {
        return userStorageService.getTaskers();
    }

    @GetMapping(value = "api/users/buyers")
    public List<UserProfile> getBuyers() {
        return userStorageService.getBuyers();
    }

    @PostMapping(value = "api/new-user")
    public void addUser(@RequestBody UserProfile newUser) {
        userStorageService.addUser(newUser);
    }

    @DeleteMapping(value = "api/delete/{username}")
    public void deleteUser(@PathVariable String username){
        userStorageService.deleteUser(username);
    }

    @PutMapping(value = "api/update/{username}")
    public void updateUser(@PathVariable String username,
                           @RequestBody UserProfile updatedUserProfile){
        userStorageService.updateUserByUserName(username,
                updatedUserProfile.getPassword(),
                updatedUserProfile.getPhoneNumber(),
                updatedUserProfile.getEmail(),
                updatedUserProfile.getTown(),
                updatedUserProfile.getUserStatus(),
                updatedUserProfile.getTaskToNeed(),
                updatedUserProfile.getTaskToTake());

    }

    @GetMapping(value = "api/users/{task}")
    public List<UserProfile> usersByTask(@PathVariable String task){
        return userStorageService.getTaskersByTaskToTake(task);
    }
}
