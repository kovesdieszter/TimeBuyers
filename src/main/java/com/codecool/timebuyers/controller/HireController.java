package com.codecool.timebuyers.controller;

import com.codecool.timebuyers.factory.PaymentFactory;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.service.HireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HireController {
    @Autowired
    private HireService hireService;

    @GetMapping(value="api/getPossibleTaskers")
    public List<UserProfile> getPossibleTaskers(){
        return hireService.getPossibleTaskers();
    }
}
