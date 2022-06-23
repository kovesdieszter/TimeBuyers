package com.codecool.timebuyers.service;

import com.codecool.timebuyers.factory.PaymentFactory;
import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.payment.Pay;

import java.util.HashSet;
import java.util.Set;

public class HireService {
    private final UserProfile buyer;
    private final Task taskToBuy;
    private UserProfile tasker;
    private Task taskToOffer;
    private final PaymentMethod paymentMethod;
    private final Pay pay;
    private Set<UserProfile> PossibleTaskers = new HashSet<>();

    public HireService(PaymentFactory paymentFactory, UserProfile buyer, Task taskToBuy, PaymentMethod paymentMethod) {
        this.buyer = buyer;
        this.taskToBuy = taskToBuy;
        this.paymentMethod = paymentMethod;
        this.pay = paymentFactory.createByPaymentMethod(paymentMethod);
    }

    public void setPossibleTaskers(UserStorageService userStorageService) {
        this.PossibleTaskers = pay.getResultList(buyer, tasker, taskToBuy, taskToOffer, userStorageService);
    }

    public Set<UserProfile> getPossibleTaskers() {
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



    //TODO:     Set<UserProfile> searchResult = null;


    /** kap egy buyer usert és egy paymentMethodot,
         * buyer lát egy listát a választható Taskokról
         * kiválaszt egyet azokból
         *
         * - ha cash:
         * végigiterálunk a tasker usereken (userStorage.getAllUser -ben az a user.getUserStatus == TASKER || BOTH,  && user.getCity == buyer.getCity, az a user megy egy result listbe
         * visszaadjuk a result listet
         * buyer választ egy taskert
         * és mehet a kétféle email: egy a buyernek, egy a taskernek
         *
         * - ha service:
         * buyer kiválasztja azt a taskot, amit felkínál cserébe (buyer.getTasksToTake),
         * végigiterálunk a tasker usereken (userStorage.getAllUser -ben az a user.getUserStatus == TASKER || BOTH,
         *  && user.getCity == buyer.getCity, && user.getTasksToNeed-ben benne van a buyer által választott task
         * ha a fentiek igazak, az a tasker kerüljön a search resultba
         * **/

}
