package com.example.demo.spring.cloud.dubbo.rds.user.dao.impl;

import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.user.dao.SystemUserDao;
import com.example.demo.spring.cloud.dubbo.rds.user.dao.base.SystemUserBaseDao;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import com.example.demo.spring.cloud.dubbo.rds.user.wrapper.SystemUserQuery;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Repository
public class SystemUserFluentDaoImpl extends SystemUserBaseDao implements SystemUserDao {
    @Override
    public DaoType getType() {
        return DaoType.FLUENT;
    }

    @Override
    public Pagination<SystemUser> page(SystemUser systemUser, int page, int size) {
        PageHelper.startPage(page, size);
        return new Pagination<>(new PageInfo<>(listEntity(getQuery(systemUser))));
    }

    @Override
    public List<SystemUser> list(SystemUser systemUser) {
        return listEntity(getQuery(systemUser));
    }

    @Override
    public List<SystemUser> listLimit(SystemUser systemUser, int page, int size) {
        PageHelper.startPage(page, size);
        return listEntity(getQuery(systemUser));
    }

    @Override
    @Transactional
    public void add(SystemUser systemUser) {
        save(systemUser);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        this.deleteById(id);
    }

    @Override
    @Transactional
    public void delete(Collection<Long> ids) {
        this.deleteByIds(ids);
    }

    @Override
    @Transactional
    public void update(SystemUser systemUser) {
        this.updateById(systemUser);
    }

    private SystemUserQuery getQuery(SystemUser systemUser) {
        return query();
    }
}
