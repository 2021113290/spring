package com.xy.component;

import com.xy.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UserBeans {
    @Bean
    public User user(){
        User user1=new User();
        user1.setId(1);
        return user1;
    }
}
