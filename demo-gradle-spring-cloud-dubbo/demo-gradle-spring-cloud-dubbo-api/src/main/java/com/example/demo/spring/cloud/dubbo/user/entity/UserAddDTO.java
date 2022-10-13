package com.example.demo.spring.cloud.dubbo.user.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserAddDTO implements Serializable {
    private String username;
    private String password;
}
