package com.example.demo.spring.cloud.dubbo.rds.user.service;

import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;

import java.util.Collection;
import java.util.List;

public interface SystemUserRdsService {

    Pagination<SystemUser> page(String type, SystemUser systemUser, int page, int size);

    Pagination<SystemUser> page(DaoType type, SystemUser systemUser, int page, int size);

    List<SystemUser> list(String type, SystemUser systemUser);

    List<SystemUser> list(DaoType type, SystemUser systemUser);

    List<SystemUser> listLimit(String type, SystemUser systemUser, int page, int size);

    List<SystemUser> listLimit(DaoType type, SystemUser systemUser, int page, int size);

    void add(String type, SystemUser systemUser);

    void add(DaoType type, SystemUser systemUser);

    void update(String type, SystemUser systemUser);

    void update(DaoType type, SystemUser systemUser);

    void delete(String type, Long id);

    void delete(DaoType type, Long id);

    void delete(String type, Long id, Long... ids);

    void delete(DaoType type, Long id, Long... ids);

    void delete(String type, Long[] ids);

    void delete(DaoType type, Long[] ids);

    void delete(String type, Collection<Long> ids);

    void delete(DaoType type, Collection<Long> ids);

}
