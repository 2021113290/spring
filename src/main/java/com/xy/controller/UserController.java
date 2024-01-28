package com.xy.controller;

import com.xy.model.User;
import com.xy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Controller
public class UserController {
    // 注⼊
//    方法1：
//    @Resource(name="user1")
//    方法2：
//    @Autowired
//    @Qualifier(value="user2")
//    public User getUser() {
//        return user;
//    }
    @Resource
    private UserService userService;
//    @Autowired
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    public User getUser() {
//        return userService.getUser();
//    }
    @PostConstruct
    public void postConstruct() {
        userService.sayHi();
        System.out.println("执⾏ User Controller 构造⽅法");
    }
}
