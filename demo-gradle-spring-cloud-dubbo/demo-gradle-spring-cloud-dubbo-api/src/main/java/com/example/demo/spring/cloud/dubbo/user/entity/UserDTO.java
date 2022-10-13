package com.example.demo.spring.cloud.dubbo.user.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDTO implements Serializable {
    private Long id;
    private String username;
//    private String password;
    private Integer state;
}
