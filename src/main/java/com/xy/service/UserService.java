package com.xy.service;

import com.xy.Repository.UserRepository;
import com.xy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUser(){
       return userRepository.user1();
    }

}
