package com.example.demo.spring.cloud.dubbo.user.service.impl;

import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import com.example.demo.spring.cloud.dubbo.rds.user.service.SystemUserRdsService;
import com.example.demo.spring.cloud.dubbo.user.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemUserServiceImpl implements SystemUserService {
    @Autowired
    private SystemUserRdsService systemUserRdsService;

    @Override
    public void add(SystemUser systemUser) {
        systemUserRdsService.add(DaoType.PLUS, systemUser);
    }

    @Override
    public void update(SystemUser systemUser) {
        systemUserRdsService.update(DaoType.PLUS, systemUser);
    }
}
