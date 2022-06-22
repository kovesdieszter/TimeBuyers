package com.codecool.timebuyers.service;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import org.apache.catalina.User;

public class HireService {
    private UserProfile buyer;
    private UserProfile tasker;
    private Task task;
    private PaymentMethod paymentMethod;

    public void hireUser(UserProfile buyer, User tasker, Task task, PaymentMethod paymentMethod){

    }
}
