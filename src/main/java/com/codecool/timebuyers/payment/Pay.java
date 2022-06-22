package com.codecool.timebuyers.payment;

import com.codecool.timebuyers.model.PaymentMethod;

public interface Pay {
    void pay(PaymentMethod paymentMethod);
}
