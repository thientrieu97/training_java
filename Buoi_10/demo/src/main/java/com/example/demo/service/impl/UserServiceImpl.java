package com.example.demo.service.impl;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.MessageService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MessageService messageService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public String saveUser() {
        String response = "User and Message saved.";
        User user1 = new User("dung", 12000);
        userRepository.save(user1);
        messageService.saveMessage();
        System.out.println("User saved.");
        return response;
    }

}

