package com.example.demo.spring.cloud.dubbo.rds.user.dao;

import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;

import java.util.Collection;
import java.util.List;

public interface SystemUserDaoFactory {
    Pagination<SystemUser> page(DaoType instance, SystemUser systemUser, int page, int size);

    List<SystemUser> list(DaoType instance, SystemUser systemUser);

    List<SystemUser> listLimit(DaoType instance, SystemUser systemUser, int page, int size);

    void add(DaoType instance, SystemUser systemUser);

    void update(DaoType type, SystemUser systemUser);

    void delete(DaoType type, Long id);

    void delete(DaoType type, Collection<Long> ids);
}
