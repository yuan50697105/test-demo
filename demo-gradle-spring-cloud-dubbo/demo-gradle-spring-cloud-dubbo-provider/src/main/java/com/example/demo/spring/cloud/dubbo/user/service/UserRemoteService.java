package com.example.demo.spring.cloud.dubbo.user.service;

import com.alibaba.fastjson.JSON;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import com.example.demo.spring.cloud.dubbo.user.client.IUserServiceClient;
import com.example.demo.spring.cloud.dubbo.user.entity.UserAddDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserEntityUtils;
import com.example.demo.spring.cloud.dubbo.user.entity.UserQueryDTO;
import com.example.demo.spring.cloud.dubbo.user.entity.UserUpdateDTO;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@DubboService
public class UserRemoteService implements IUserService, IUserServiceClient {
    @Autowired
    private SystemUserService systemUserService;
    @Override
    public String add(UserAddDTO dto) {
        SystemUser systemUser = UserEntityUtils.copyAddData(dto);
        systemUserService.add(systemUser);
        return JSON.toJSONString(systemUser);
    }

    @Override
    public String update(UserUpdateDTO dto) {
        SystemUser systemUser = UserEntityUtils.copyUpdateData(dto);
        systemUserService.update(systemUser);
        return JSON.toJSONString(systemUser);
    }

    @Override
    public String get(UserQueryDTO dto) {
        return JSON.toJSONString(dto);
    }

}
