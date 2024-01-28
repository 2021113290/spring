package com.xy.controller;

import com.xy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class BeanScopesController {
    @Autowired
    private User user1;
    public User getUser1(){
        User user=user1;
        System.out.println("Bean 原 Name：" + user.getName());
        user.setName("悟空"); // 【重点：进⾏了修改操作】
        return user;
    }
}
