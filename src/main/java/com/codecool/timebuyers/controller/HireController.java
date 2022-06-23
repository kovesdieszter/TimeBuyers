package com.codecool.timebuyers.controller;

import com.codecool.timebuyers.factory.PaymentFactory;
import com.codecool.timebuyers.model.UserProfile;
import com.codecool.timebuyers.service.HireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(value = "api/settasker")
    public void setTasker(@RequestBody UserProfile tasker) {
        hireService.setTasker(tasker);
    }
}
