package com.example.demo.spring.cloud.dubbo.user.entity;

import cn.hutool.core.bean.BeanUtil;
import com.example.demo.spring.cloud.dubbo.rds.user.entity.SystemUser;
import com.example.demo.spring.cloud.dubbo.user.proto.UserEntity;
import lombok.Data;

@Data
public class UserEntityUtils {


    public static SystemUser copyAddData(UserAddDTO dto) {
        return BeanUtil.toBean(dto, SystemUser.class);
    }


    public static SystemUser copyUpdateData(UserUpdateDTO dto) {
        return BeanUtil.toBean(dto, SystemUser.class);
    }

    public static SystemUser copyAddData(UserEntity.UserAddRequest request) {
        SystemUser systemUser = new SystemUser();
        systemUser.setUsername(request.getUsername());
        systemUser.setPassword(request.getPassword());
        return systemUser;
    }

    public static SystemUser copyUpdateData(UserEntity.UserUpdateRequest request) {
        SystemUser systemUser = new SystemUser();
        systemUser.setId(request.getId());
        systemUser.setUsername(request.getUsername());
        return systemUser;
    }
}
