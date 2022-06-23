package com.codecool.timebuyers.payment;

import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.model.UserStatus;
import com.codecool.timebuyers.service.UserStorageService;
import org.apache.catalina.User;

import java.util.HashSet;
import java.util.Set;

public class PayWithCash implements Pay {

    @Override
    public Set<UserProfile> getResultList(UserProfile buyer, UserProfile tasker, Task taskToBuy, Task taskToGive, UserStorageService userStorageService) {
        Set<UserProfile> resultList = new HashSet<>();

        Set<UserProfile> allUsers = userStorageService.getAllUser();
        for (UserProfile user : allUsers){
            if (user.getUserStatus().equals(UserStatus.TASKER) || user.getUserStatus().equals(UserStatus.BOTH)){
                if (user.getTaskToTake().contains(taskToBuy)){
                    if (user.getTown().equals(buyer.getTown())){
                        resultList.add(user);
                    }
                }
            }
        }
        return resultList;
    }

    @Override
    public void sendEmail(UserProfile buyer, UserProfile tasker, PaymentMethod paymentMethod, Task taskToBuy, Task taskToOffer) {
        System.out.println("This message is from sendEmail method if you pay with cash");
    }
}
