package com.codecool.timebuyers.controller;


import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import com.codecool.timebuyers.service.UserStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserStorageService userStorageService;

    @GetMapping(value = "api/users/{username}")
    public UserProfile getUser(@PathVariable String username) {
        return userStorageService.getUser(username);
    }

    @GetMapping(value = "api/users")
    public List<UserProfile> getAllUser() {
        return userStorageService.getAllUser();
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
                           @RequestBody String updatedPhoneNumber,
                           @RequestBody String updatedEmail,
                           @RequestBody String updatedTown,
                           @RequestBody UserStatus updatedUserStatus,
                           @RequestBody ArrayList<Task> updatedTaskToNeed,
                           @RequestBody ArrayList<Task> updatedTaskToTake){
        userStorageService.updateUserByUserName(username,
                updatedPhoneNumber,
                updatedEmail,
                updatedTown,
                updatedUserStatus,
                updatedTaskToNeed,
                updatedTaskToTake);

    }
}
