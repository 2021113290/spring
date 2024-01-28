package com.xy.Repository;

import com.xy.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public User user1() {
        User user = new User();
        user.setId(1);
        user.setName("Java");
        return user;
    }
}
