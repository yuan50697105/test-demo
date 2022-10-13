package com.example.demo.spring.cloud.dubbo.rds.user.dao.impl;

import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.user.dao.SystemUserDao;
import com.example.demo.spring.cloud.dubbo.rds.user.dao.SystemUserDaoFactory;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Repository
public class SystemUserDaoFactoryImpl implements SystemUserDaoFactory {
    private Map<DaoType, SystemUserDao> systemUserDaoMap;

    @Autowired
    public SystemUserDaoFactoryImpl(List<SystemUserDao> systemUserDaoMap) {
        this.systemUserDaoMap = systemUserDaoMap.stream().collect(Collectors.toMap(SystemUserDao::getType, Function.identity()));
    }

    @Override
    public Pagination<SystemUser> page(DaoType instance, SystemUser systemUser, int page, int size) {
        return systemUserDaoMap.get(instance).page(systemUser, page, size);
    }

    @Override
    public List<SystemUser> list(DaoType instance, SystemUser systemUser) {
        return systemUserDaoMap.get(instance).list(systemUser);
    }

    @Override
    public List<SystemUser> listLimit(DaoType instance, SystemUser systemUser, int page, int size) {
        return systemUserDaoMap.get(instance).listLimit(systemUser,page,size);
    }

    @Override
    @Transactional
    public void add(DaoType instance, SystemUser systemUser) {
        systemUserDaoMap.get(instance).add(systemUser);
    }

    @Override
    public void update(DaoType type, SystemUser systemUser) {
        systemUserDaoMap.get(type).update(systemUser);
    }

    @Override
    public void delete(DaoType type, Long id) {
        systemUserDaoMap.get(type).delete(id);
    }

    @Override
    public void delete(DaoType type, Collection<Long> ids) {
        systemUserDaoMap.get(type).delete(ids);
    }
}
