package com.example.demo.spring.cloud.dubbo.user.service;

import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;

public interface SystemUserService {
    void add(SystemUser systemUser);

    void update(SystemUser systemUser);
}
