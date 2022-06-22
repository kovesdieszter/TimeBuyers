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



        return resultList;
    }
}
