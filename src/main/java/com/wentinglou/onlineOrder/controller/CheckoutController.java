package com.wentinglou.onlineOrder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CheckoutController {
    @RequestMapping(value = "/checkout", method = RequestMethod.GET)
    @ResponseBody
    public void checkout() {

    }
}
