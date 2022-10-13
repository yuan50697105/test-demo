package com.example.demo.dubbo.controller;

import com.example.demo.dubbo.IUserService;
import com.example.demo.dubbo.entity.User;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @DubboReference(protocol = "dubbo", url = "dubbo://localhost:20880")
    private IUserService userService;

    @GetMapping("{name}")
    public String get(@PathVariable String name) {
        return userService.hello(name);
    }

    @GetMapping
    public User add(User user) {
        return userService.add(user);
    }
}
