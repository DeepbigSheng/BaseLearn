package com.victor.demo.controller;

import com.victor.demo.domain.User;
import com.victor.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello, world!";
    }

    @RequestMapping("/test")
    public List<User> test(){
        return userService.getUsers();
    }
}
