package com.xy.component;

import com.xy.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Users {
    @Bean
    public User user1() {
        User user = new User();
        user.setId(1);
        user.setName("Java");
        return user;
    }
    @Bean
    public User user2() {
        User user = new User();
        user.setId(2);
        user.setName("MySQL");
        return user;
    }
}
