package com.example.demo.spring.cloud.dubbo.user.service;

import com.example.demo.spring.cloud.dubbo.user.entity.UserAddDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserQueryDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserUpdateDTO;

public interface IUserService {
    String add(UserAddDTO dto);

    String update(UserUpdateDTO dto);

    String get(UserQueryDTO dto);
}
