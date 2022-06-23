package com.codecool.timebuyers.service;

import com.codecool.timebuyers.factory.PaymentFactory;
import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.payment.Pay;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class HireService {
    private UserProfile buyer;
    private Task taskToBuy;
    private UserProfile tasker;
    private Task taskToOffer;
    private PaymentMethod paymentMethod;
    private Pay pay;
    private List<UserProfile> PossibleTaskers = new ArrayList<>();

    public HireService() {
    }

//    public addAnOrder(PaymentFactory paymentFactory, UserProfile buyer, Task taskToBuy, PaymentMethod paymentMethod) {
//        this.buyer = buyer;
//        this.taskToBuy = taskToBuy;
//        this.paymentMethod = paymentMethod;
//        this.pay = paymentFactory.createByPaymentMethod(paymentMethod);
//    }


    public void setPossibleTaskers(UserStorageService userStorageService) {
        this.PossibleTaskers = pay.getResultList(buyer, tasker, taskToBuy, taskToOffer, userStorageService);
    }

    public List<UserProfile> getPossibleTaskers(){
        return PossibleTaskers;
    }

    public void setTasker(UserProfile tasker) {
        this.tasker = tasker;
    }

    public void setTaskToOffer(Task taskToOffer) {
        this.taskToOffer = taskToOffer;
    }

    public void sendEmail(){
        pay.sendEmail(buyer, tasker, paymentMethod, taskToBuy, taskToOffer);
    }
}
