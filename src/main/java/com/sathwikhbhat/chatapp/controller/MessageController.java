package com.sathwikhbhat.chatapp.controller;

import com.sathwikhbhat.chatapp.model.Message;
import com.sathwikhbhat.chatapp.service.MessageServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/messages")
public class MessageController {

    @Autowired
    private MessageServices messageService;

    @PostMapping("/send")
    public Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }

    @GetMapping("/chat")
    public List<Message> getChat(@RequestParam String user1, @RequestParam String user2) {
        return messageService.getChatHistory(user1, user2);
    }

}
