package com.example.demo.dubbo;

import com.example.demo.dubbo.entity.User;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

@Service
@DubboService
public class UserService implements IUserService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }

    @Override
    public User add(User user) {
        return user;
    }
}
