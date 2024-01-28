package com.xy.service;

import com.xy.Repository.UserRepository;
import com.xy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
//    private UserRepository userRepository;

//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
//    public User getUser(){
//       return userRepository.user1();
//    }

    public UserService() {
        System.out.println("调用 User Service 构造⽅法");
    }
    public void sayHi(){
        System.out.println("User Service SayHi.");
    }

}
