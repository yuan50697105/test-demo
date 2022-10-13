package com.example.demo.spring.cloud.dubbo.rds.user.service.impl;

import cn.hutool.core.collection.ListUtil;
import cn.hutool.extra.validation.BeanValidationResult;
import cn.hutool.extra.validation.ValidationUtil;
import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.user.dao.SystemUserDaoFactory;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import com.example.demo.spring.cloud.dubbo.rds.user.service.SystemUserRdsService;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ValidationException;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SystemUserRdsServiceImpl implements SystemUserRdsService {
    private final SystemUserDaoFactory systemUserDaoFactory;

    @Autowired
    public SystemUserRdsServiceImpl(SystemUserDaoFactory systemUserDaoFactory) {
        this.systemUserDaoFactory = systemUserDaoFactory;
    }


    @Override
    public Pagination<SystemUser> page(String type, SystemUser systemUser, int page, int size) {
        return systemUserDaoFactory.page(DaoType.getInstance(type), systemUser, page, size);
    }

    @Override
    public Pagination<SystemUser> page(DaoType type, SystemUser systemUser, int page, int size) {
        return systemUserDaoFactory.page(type, systemUser, page, size);
    }

    @Override
    public List<SystemUser> list(String type, SystemUser systemUser) {
        return systemUserDaoFactory.list(DaoType.getInstance(type), systemUser);
    }

    @Override
    public List<SystemUser> list(DaoType type, SystemUser systemUser) {
        return systemUserDaoFactory.list(type, systemUser);
    }

    @Override
    public List<SystemUser> listLimit(String type, SystemUser systemUser, int page, int size) {
        return systemUserDaoFactory.listLimit(DaoType.getInstance(type), systemUser, page, size);
    }

    @Override
    public List<SystemUser> listLimit(DaoType type, SystemUser systemUser, int page, int size) {
        return systemUserDaoFactory.listLimit(type, systemUser, page, size);
    }

    @Override
    @Transactional
    public void add(String type, SystemUser systemUser) {
        add(DaoType.getInstance(type), systemUser);
    }

    @Override
    @Transactional
    public void add(DaoType type, SystemUser systemUser) {
        BeanValidationResult result = ValidationUtil.warpValidate(systemUser, SystemUser.Add.class);
        throwErrorMessage(result);
        systemUserDaoFactory.add(type, systemUser);
    }

    @Override
    @Transactional
    public void update(String type, SystemUser systemUser) {
        update(DaoType.getInstance(type), systemUser);
    }

    @Override
    @Transactional
    public void update(DaoType type, SystemUser systemUser) {
        BeanValidationResult result = ValidationUtil.warpValidate(systemUser, SystemUser.Update.class);
        throwErrorMessage(result);
        systemUserDaoFactory.update(type, systemUser);
    }

    @Override
    @Transactional
    public void delete(String type, Long id) {
        this.delete(DaoType.getInstance(type), id);
    }

    @Override
    @Transactional
    public void delete(DaoType type, Long id) {
        systemUserDaoFactory.delete(type, id);
    }

    @Override
    @Transactional
    public void delete(String type, Long id, Long... ids) {
        this.delete(DaoType.getInstance(type), id, ids);
    }

    @Override
    @Transactional
    public void delete(DaoType type, Long id, Long... ids) {
        this.delete(type, Lists.asList(id, ids));
    }

    @Override
    @Transactional
    public void delete(String type, Long[] ids) {
        this.delete(DaoType.getInstance(type), ids);
    }

    @Override
    @Transactional
    public void delete(DaoType type, Long[] ids) {
        this.delete(type,ListUtil.toList(ids));
    }

    @Override
    @Transactional
    public void delete(String type, Collection<Long> ids) {
        this.delete(DaoType.getInstance(type),ids);
    }

    @Override
    @Transactional
    public void delete(DaoType type, Collection<Long> ids) {
        systemUserDaoFactory.delete(type, ids);
    }

    private void throwErrorMessage(BeanValidationResult result) {
        if (!result.isSuccess()) {
            String message = result.getErrorMessages().stream().map(BeanValidationResult.ErrorMessage::toString).collect(Collectors.joining(","));
            throw new ValidationException(message);
        }
    }


}
