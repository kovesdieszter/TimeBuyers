package com.codecool.timebuyers.controller;

import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.utils.SendEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/")
public class SendEmailController {
    private String senderEmailAddress;

    public SendEmailController(String senderEmailAddress) {
        this.senderEmailAddress = senderEmailAddress;
    }

    @Autowired
    private SendEmail sendEmailObject;

    @PostMapping(value = "send-email/{email-address}")
    public void sendEmailRoute(String emailAddress) {
        //TODO: this.senderEmailAddress = buyer.getEmail;
//TODO:         HashMap orderDetails = buyer.adatai, tasker.adatai

    }
}
