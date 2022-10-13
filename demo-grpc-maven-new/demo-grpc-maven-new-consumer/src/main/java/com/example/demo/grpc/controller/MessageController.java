package com.example.demo.grpc.controller;

import com.example.demo.grpc.proto.Message;
import com.example.demo.grpc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @GetMapping(value = "send")
    public String response(String sender, String content, String receiver) {
        return messageService.sendMessage(Message.MessageRequest.newBuilder().setContent(content).setSender(sender).setReceiver(content).build());
    }
}
