package com.codecool.timebuyers.controller;


import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.service.UserStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserStorageService userStorageService;

    @GetMapping(value = "users/{username}")
    public UserProfile getUser(@PathVariable String username) {
        return userStorageService.getUser(username);
    }

    @GetMapping(value = "users")
    public Set<UserProfile> getAllUser() {
        return userStorageService.getAllUser();
    }

    @PostMapping(value = "new-user")
    public void addUser(@RequestBody UserProfile newUser) {
        userStorageService.addUser(newUser);
    }

    @DeleteMapping(value = "users")
    public void deleteUser(@RequestBody UserProfile userProfile){
        userStorageService.deleteUser(userProfile);
    }

    @PutMapping(value = "update/{username}")
    public void updateUser(@PathVariable String username,
                           @RequestBody String updatedPhoneNumber,
                           @RequestBody String updatedEmail,
                           @RequestBody String updatedTown,
                           @RequestBody UserStatus updatedUserStatus,
                           @RequestBody Set<Task> updatedTaskToNeed,
                           @RequestBody Set<Task> updatedTaskToTake){
        userStorageService.updateUserByName(username,
                updatedPhoneNumber,
                updatedEmail,
                updatedTown,
                updatedUserStatus,
                updatedTaskToNeed,
                updatedTaskToTake);

    }
}
