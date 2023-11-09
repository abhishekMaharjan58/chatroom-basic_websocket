package com.example.chatroom.models;

import lombok.Data;
import org.springframework.messaging.MessageHeaders;

import java.util.List;
import java.util.Map;

@Data
public class Message {
    private String name;
    private String content;
    private String headers;
}
