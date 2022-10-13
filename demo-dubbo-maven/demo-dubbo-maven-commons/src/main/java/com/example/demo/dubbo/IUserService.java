package com.example.demo.dubbo;

import com.example.demo.dubbo.entity.User;

public interface IUserService {
    String hello(String name);

    User add(User user);
}
