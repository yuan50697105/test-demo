package com.example.demo.spring.cloud.dubbo.rds.user.dao.impl;

import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.user.dao.SystemUserDao;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import com.example.demo.spring.cloud.dubbo.rds.user.mapper.SystemUserPlusMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Repository
public class SystemUserPlusDaoImpl extends ServiceImpl<SystemUserPlusMapper, SystemUser> implements SystemUserDao {
    @Override
    public DaoType getType() {
        return DaoType.PLUS;
    }

    @Override
    public Pagination<SystemUser> page(SystemUser systemUser, int page, int size) {
        PageHelper.startPage(page, size);
        return new Pagination<>(new PageInfo<>(getQuery(systemUser).list()));
    }

    @Override
    public List<SystemUser> list(SystemUser systemUser) {
        return getQuery(systemUser).list();
    }

    @Override
    public List<SystemUser> listLimit(SystemUser systemUser, int page, int size) {
        PageHelper.startPage(page, size);
        return getQuery(systemUser).list();
    }

    @Override
    @Transactional
    public void add(SystemUser systemUser) {
        save(systemUser);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        this.removeById(id);
    }

    @Override
    @Transactional
    public void delete(Collection<Long> ids) {
        this.removeBatchByIds(ids);
    }

    @Override
    public void update(SystemUser systemUser) {
        this.updateById(systemUser);
    }

    private LambdaQueryChainWrapper<SystemUser> getQuery(SystemUser systemUser) {
        return lambdaQuery();
    }
}
