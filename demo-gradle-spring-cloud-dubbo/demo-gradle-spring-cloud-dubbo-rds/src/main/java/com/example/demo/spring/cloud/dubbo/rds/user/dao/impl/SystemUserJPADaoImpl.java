package com.example.demo.spring.cloud.dubbo.rds.user.dao.impl;

import cn.hutool.core.stream.StreamUtil;
import com.example.demo.spring.cloud.dubbo.rds.user.constants.DaoType;
import com.example.demo.spring.cloud.dubbo.rds.user.dao.SystemUserDao;
import com.example.demo.spring.cloud.dubbo.rds.commons.entity.Pagination;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import com.example.demo.spring.cloud.dubbo.rds.user.repository.SystemUserRespository;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SystemUserJPADaoImpl implements SystemUserDao {
    private final SystemUserRespository systemUserRespository;

    public SystemUserJPADaoImpl(SystemUserRespository systemUserRespository) {
        this.systemUserRespository = systemUserRespository;
    }

    @Override
    public DaoType getType() {
        return null;
    }

    @Override
    public Pagination<SystemUser> page(SystemUser systemUser, int page, int size) {
        return new Pagination<>(systemUserRespository.findAll(getPageable(page, size)));
    }

    @Override
    public List<SystemUser> list(SystemUser systemUser) {
        return systemUserRespository.findAll();
    }

    @Override
    public List<SystemUser> listLimit(SystemUser systemUser, int page, int size) {
        Iterable<SystemUser> iterable = systemUserRespository.findAll(getPageable(page, size));
        return StreamUtil.of(iterable).collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void add(SystemUser systemUser) {
        systemUserRespository.save(systemUser);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        this.systemUserRespository.deleteById(id);
    }

    @Override
    @Transactional
    public void delete(Collection<Long> ids) {
        this.systemUserRespository.deleteAllById(ids);
    }

    @Override
    @Transactional
    public void update(SystemUser systemUser) {
        this.systemUserRespository.save(systemUser);
    }

    @NotNull
    private PageRequest getPageable(int page, int size) {
        return PageRequest.of(page <= 1 ? 0 : page, size);
    }
}
