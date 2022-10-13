package com.example.demo.spring.cloud.dubbo.user.entity;

import com.example.demo.spring.cloud.dubbo.user.constants.UserState;
import lombok.Data;

import java.io.Serializable;

@Data
public class UserUpdateDTO implements Serializable {
    private Long id;
    private String username;
    private Integer state;

    public void setState(Integer state) {
        this.state = UserState.getState(state);
    }

    public Integer getState() {
        return UserState.getState(state);
    }

}
