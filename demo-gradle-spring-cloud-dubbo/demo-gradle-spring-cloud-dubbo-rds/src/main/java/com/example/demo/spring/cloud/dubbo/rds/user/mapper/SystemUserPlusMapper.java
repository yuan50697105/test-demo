package com.example.demo.spring.cloud.dubbo.rds.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.ExampleMapper;

@Mapper
@Repository
public interface SystemUserPlusMapper extends BaseMapper<SystemUser>, ExampleMapper<SystemUser> {
}
