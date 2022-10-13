package com.example.demo.spring.cloud.dubbo.rds.user.dao;

import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;

import java.util.Collection;
import java.util.List;

public interface SystemUserDao {
    DaoType getType();

    Pagination<SystemUser> page(SystemUser systemUser, int page, int size);

    List<SystemUser> list(SystemUser systemUser);

    List<SystemUser> listLimit(SystemUser systemUser, int page, int size);

    void add(SystemUser systemUser);

    void update(SystemUser systemUser);

    void delete(Long id);

    void delete(Collection<Long> ids);
}
