package com.example.demo.grpc.service;

import com.example.demo.grpc.client.MessageServiceClient;
import com.example.demo.grpc.proto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class MessageService {
    @Autowired
    private MessageServiceClient messageServiceClient;

    public String sendMessage(Message.MessageRequest build) {
        Message.MessageResponse messageResponse = messageServiceClient.sendMessage(build);
        return messageResponse.getMessageBytes().toString(StandardCharsets.UTF_8);
    }
}
