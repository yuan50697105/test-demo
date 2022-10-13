package com.example.demo.spring.cloud.dubbo.user.client;

import com.example.demo.spring.cloud.dubbo.user.entity.UserAddDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserQueryDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserUpdateDTO;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface IUserServiceClient {
    @PostMapping("user/add")
    String add(@RequestBody UserAddDTO dto);

    @PutMapping("user/update")
    String update(@RequestBody UserUpdateDTO dto);

    @GetMapping("user/get")
    String get(@SpringQueryMap UserQueryDTO dto);
}
