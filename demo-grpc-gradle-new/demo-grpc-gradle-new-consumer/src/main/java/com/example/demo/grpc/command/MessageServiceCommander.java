package com.example.demo.grpc.command;

import com.example.demo.grpc.client.MessageServiceClient;
import com.example.demo.grpc.proto.Message;
import com.google.common.util.concurrent.ListenableFuture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
public class MessageServiceCommander implements CommandLineRunner {
    @Autowired
    private MessageServiceClient messageServiceClient;
    @Override
    public void run(String... args) throws Exception {
        ListenableFuture<Message.MessageResponse> future = messageServiceClient.sendMessage("aaa", "aaa", "aaa");
        Message.MessageResponse messageResponse = future.get();
        String s = messageResponse.toString();
        String string = messageResponse.getMessageBytes().toString(StandardCharsets.UTF_8);
        System.out.println(s);
        System.out.println("string = " + string);
    }
}
