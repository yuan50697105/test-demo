package com.example.demo.spring.cloud.dubbo.user.controller;

import com.example.demo.spring.cloud.dubbo.user.entity.UserAddDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserUpdateDTO;
import com.example.demo.spring.cloud.dubbo.user.service.IUserService;
import com.example.demo.spring.cloud.dubbo.user.service.UserGrpcServiceClient;
import com.example.demo.spring.cloud.dubbo.user.service.UserServiceClient;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @DubboReference
    private IUserService userService;
    @Autowired
    private UserServiceClient userServiceClient;
    @Autowired
    private UserGrpcServiceClient userGrpcServiceClient;
    @PostMapping("add")
    public String add(@RequestBody UserAddDTO dto) {
        return userService.add(dto);
    }

    @PostMapping("add2")
    public String add2(@RequestBody UserAddDTO dto) {
        return userServiceClient.add(dto);
    }

    @PostMapping("add3")
    public String add3(@RequestBody UserAddDTO dto) {
        return userGrpcServiceClient.add(dto);
    }
    @PutMapping("update")
    public String update(@RequestBody UserUpdateDTO dto) {
        return userService.update(dto);
    }

    @PutMapping("update2")
    public String update2(@RequestBody UserUpdateDTO dto) {
        return userServiceClient.update(dto);
    }

    @PostMapping("update3")
    public String update3(@RequestBody UserUpdateDTO dto) {
        return userGrpcServiceClient.update(dto);
    }

}
