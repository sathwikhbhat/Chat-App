package com.sathwikhbhat.chatapp.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "messages")
public class Message {
    @Id
    private String Id;
    private String sender;
    private String receiver;
    private String content;
    private LocalDateTime timestamp;
}
