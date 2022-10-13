package com.example.demo.spring.cloud.dubbo.rds.user.repository;

import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemUserRespository extends JpaRepositoryImplementation<SystemUser,Long>, QuerydslPredicateExecutor<SystemUser> {
}
