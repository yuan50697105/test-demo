package com.example.demo.controller;

import com.example.demo.protobuf.MessageUserEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class IndexController {
    @PostMapping(value = "aaa", produces = "application/x-protobuf")
    public MessageUserEntity.MessageUserResponse index(@RequestBody MessageUserEntity.MessageUserRequest request) {
        String username = request.getUsername();
        return MessageUserEntity.MessageUserResponse.newBuilder().setUsername(username).setAccessToken("11111").build();
    }
}
