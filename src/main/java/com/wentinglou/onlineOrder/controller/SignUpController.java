package com.wentinglou.onlineOrder.controller;

import com.wentinglou.onlineOrder.entity.Customer;
import com.wentinglou.onlineOrder.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

// controller to handle sign-up request from client
@Controller
public class SignUpController {

    @Autowired
    private CustomerService customerService;

    // if the path is sign-up and HTTP request is post, then use the signUp method
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void signUp(@RequestBody Customer customer) {
        customerService.signUp(customer);
    }
}

