package com.example.demo.service.impl;

import com.example.demo.model.Message;
import com.example.demo.repository.MessageRepository;
import com.example.demo.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    @Transactional(propagation = Propagation.MANDATORY)
    public String saveMessage() {
        String response = "Message Saved.";
        Message message = new Message("message for user.");
        messageRepository.save(message);
        System.out.println(response);
        return response;
    }
}
