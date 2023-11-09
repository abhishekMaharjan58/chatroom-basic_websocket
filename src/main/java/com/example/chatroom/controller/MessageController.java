package com.example.chatroom.controller;

import com.example.chatroom.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @MessageMapping(value = "/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        try{
            Thread.sleep(2000);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return message;
    }
}
