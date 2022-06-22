package com.codecool.timebuyers.payment;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import com.codecool.timebuyers.service.UserStorageService;

import java.util.HashSet;
import java.util.Set;

public class PayWithTask implements Pay {

    @Override
    public Set<UserProfile> getResultList(UserProfile buyer, UserProfile tasker, Task taskToBuy, Task taskToOffer, UserStorageService userStorageService) {
        Set<UserProfile> resultList = new HashSet<>();

        Set<UserProfile> allUsers = userStorageService.getAllUser();
        for (UserProfile user : allUsers){
            if (user.getUserStatus().equals(UserStatus.TASKER) || user.getUserStatus().equals(UserStatus.BOTH)){
                if (user.getTown().equals(buyer.getTown())){
                    if (user.getTaskToNeed().contains(taskToOffer)){ //returns with boolean
                        resultList.add(user);
                    }
                }
            }
        }

        return resultList;
    }
}
