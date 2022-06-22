package com.codecool.timebuyers.payment;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;

import java.util.Set;

public interface Pay {
    Set<UserProfile> searchResult = null;

    void pay(UserProfile buyer, UserProfile tasker, Task taskToBuy, Task taskToGive);
}
