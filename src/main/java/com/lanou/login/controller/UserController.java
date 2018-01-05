package com.lanou.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dllo on 18/1/5.
 */
@Controller
public class UserController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }





}
