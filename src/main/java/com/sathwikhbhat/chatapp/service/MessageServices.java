package com.sathwikhbhat.chatapp.service;

import com.sathwikhbhat.chatapp.model.Message;
import com.sathwikhbhat.chatapp.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageServices {

    @Autowired
    private MessageRepository messageRepository;

    public Message sendMessage(Message message) {
        message.setTimestamp(LocalDateTime.now());
        return messageRepository.save(message);
    }

    public List<Message> getChatHistory(String user1, String user2) {
        return messageRepository.findBySenderAndReceiverOrReceiverAndSender(user1, user2, user2, user1);
    }

}
