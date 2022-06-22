package com.codecool.timebuyers.service;

import com.codecool.timebuyers.factory.PaymentFactory;
import com.codecool.timebuyers.model.PaymentMethod;
import com.codecool.timebuyers.model.Task;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.payment.Pay;

import java.util.Set;

public class HireService {
    private final UserProfile buyer;
    private UserProfile tasker;
    private final Task taskToBuy;
    private final PaymentMethod paymentMethod;
    private final PaymentFactory paymentFactory;

    public HireService(PaymentFactory paymentFactory, UserProfile buyer, Task taskToBuy, PaymentMethod paymentMethod) {
        this.paymentFactory = paymentFactory;
        this.buyer = buyer;
        this.taskToBuy = taskToBuy;
        this.paymentMethod = paymentMethod;
    }


    public void hireUser(UserProfile tasker, Task taskToOffer) {
        Pay payWithSelectedPayment = paymentFactory.createByPaymentMethod(paymentMethod);
        payWithSelectedPayment.pay(buyer, tasker, taskToBuy, taskToOffer);

    }

    public void setTasker(UserProfile tasker) {
        this.tasker = tasker;
    }



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
